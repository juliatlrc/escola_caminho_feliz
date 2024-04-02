package br.edu.infnet.juliatallarico.model.domain;

import br.edu.infnet.juliatallarico.model.domain.Endereco;

public class Professor {
    private String nome;
    private String disciplina;
    private String horarioTrabalho;
    private float salario;
    private Endereco endereco;
    private String formacaoSuperior;
    private String telefone;

    public Professor(String nome, String disciplina, String horarioTrabalho, float salario, Endereco endereco, String formacaoSuperior, String telefone) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.horarioTrabalho = horarioTrabalho;
        this.salario = salario;
        this.endereco = endereco;
        this.formacaoSuperior = formacaoSuperior;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome do professor: " + nome + ", Disciplina: " + disciplina + ", Endereço: " + endereco + ", Formação Superior: " + formacaoSuperior + ", Telefone: " + telefone;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getFormacaoSuperior() {
        return formacaoSuperior;
    }

    public void setFormacaoSuperior(String formacaoSuperior) {
        this.formacaoSuperior = formacaoSuperior;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}