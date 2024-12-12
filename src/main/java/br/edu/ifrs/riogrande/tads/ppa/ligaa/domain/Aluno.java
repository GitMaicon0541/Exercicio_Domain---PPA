package br.edu.ifrs.riogrande.tads.ppa.ligaa.domain;

import java.time.LocalDateTime;
import java.util.UUID;

// --> Turma -> Matricula -> Aluno (xMatriculas)
// --> Aluno -> Matricula -> Turma (xMatriculas)
public class Aluno {
    // -- campos de controle
    private UUID id;
    private LocalDateTime dataHoraCriacao;
    private LocalDateTime dataHoraAlteracao;
    private boolean desativado; // false

    // --
    private String nome;
    private String enderecoEletronico;
    private String login; // e-mail
    private String cpf;

    public String getEnderecoEletronico() {
        return enderecoEletronico;
    }

    public void setEnderecoEletronico(String enderecoEletronico) {
        this.enderecoEletronico = enderecoEletronico;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public LocalDateTime getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    public void setDataHoraAlteracao(LocalDateTime dataHoraAlteracao) {
        this.dataHoraAlteracao = dataHoraAlteracao;
    }

    public boolean isDesativado() {
        return desativado;
    }

    public void setDesativado(boolean desativado) {
        this.desativado = desativado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno [id = " + id + ", dataHoraCriacao = " + dataHoraCriacao + ", dataHoraAlteracao = " + dataHoraAlteracao
                + ", desativado = " + desativado + ", nome = " + nome + ", enderecoEletronico = " + enderecoEletronico
                + ", login = " + login + ", cpf = " + cpf + "]";
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return (cpf == null) ? 0 : prime + cpf.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aluno)) return false;
        Aluno other = (Aluno) obj;
        return Objects.equals(cpf, other.cpf);
    }
}