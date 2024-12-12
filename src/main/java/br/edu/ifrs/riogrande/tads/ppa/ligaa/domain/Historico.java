package br.edu.ifrs.riogrande.tads.ppa.ligaa.domain;

import java.util.List;

import br.edu.ifrs.riogrande.tads.ppa.ligaa.domain.Matricula.Situacao;

// Value Object => Objeto de Valor 
// DTO => VO => DTO
public record Historico(Aluno aluno, List<Turma> turmas) {

    public List<Turma> turmasAnteriores(Turma turma) {
        return turmas.stream()
                .filter(t -> t.getDisciplina().equals(turma.getDisciplina()))
                .toList();
    }

    private boolean verificaSituacaoAnterior(List<Turma> turmasAnterioresDaDisciplina, Situacao situacao) {
        return turmasAnterioresDaDisciplina.stream()
                .flatMap(t -> t.getMatriculas().stream())
                .anyMatch(m -> m.getAluno().equals(aluno) && m.getSituacao().equals(situacao));
    }

    public boolean reprovadoAnteriormente(List<Turma> turmasAnterioresDaDisciplina) {
        return verificaSituacaoAnterior(turmasAnterioresDaDisciplina, Situacao.REPROVADO);
    }

    private void verificaSituacaoAtual(Turma turma, Aluno aluno, Situacao situacao, String mensagem) {
        boolean situacaoAnteriormente = this.turmasAnteriores(turma).stream()
                .flatMap(t -> t.getMatriculas().stream())
                .anyMatch(m -> m.getAluno().equals(aluno) && m.getSituacao().equals(situacao));

        if (situacaoAnteriormente) {
            throw new DomainException(
                    "Aluno " + aluno.getCpf() + " " + mensagem + " " + turma.getDisciplina().getNome());
        }
    }

    public void alunoAproveitouAnteriormente(Turma turma, Aluno aluno) {
        verificaSituacaoAtual(turma, aluno, Situacao.APROVEITAMENTO, "++ Aproveitou a disciplina ++");
    }

    public void alunoAprovadoEm(Turma turma, Aluno aluno) {
        verificaSituacaoAtual(turma, aluno, Situacao.APROVADO, "++ Aprovado na disciplina ++");
    }
}
