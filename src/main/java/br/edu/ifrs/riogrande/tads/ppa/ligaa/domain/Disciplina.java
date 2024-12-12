package br.edu.ifrs.riogrande.tads.ppa.ligaa.domain;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    // chave
    private String codigo;
    private String nome;
    private String ementa;
    private int cargaHoraria;
    private List<Disciplina> preRequisitos = new ArrayList<>();
    private int aulasSemanais;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(List<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public int getAulasSemanais() {
        return aulasSemanais;
    }

    public void setAulasSemanais(int aulasSemanais) {
        this.aulasSemanais = aulasSemanais;
    }

    @Override
    public String toString() {
        return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", ementa=" + ementa + ", cargaHoraria="
                + cargaHoraria + ", preRequisitos=" + preRequisitos + ", aulasSemanais=" + aulasSemanais + "]";
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return (codigo == null) ? prime : prime * codigo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Disciplina)) return false;
        Disciplina other = (Disciplina) obj;
        return Objects.equals(codigo, other.codigo);
    }
    
}