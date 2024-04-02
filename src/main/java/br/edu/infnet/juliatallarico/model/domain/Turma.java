package br.edu.infnet.juliatallarico.model.domain;
import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Professor;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int anoEnsino;
    private Professor professorResponsavel;
    private int quantidadeAlunos;
    private String numeroSala;
    private List<Aluno> alunos;

    // Construtor
    public Turma(int anoEnsino, Professor professorResponsavel, String numeroSala) {
        this.anoEnsino = anoEnsino;
        this.professorResponsavel = professorResponsavel;
        this.numeroSala = numeroSala;
        this.alunos = new ArrayList<>();
    }

    // Getters e Setters
    public int getAnoEnsino() {
        return anoEnsino;
    }

    public void setAnoEnsino(int anoEnsino) {
        this.anoEnsino = anoEnsino;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Método para adicionar aluno à turma
    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < 15) { // Verifica se o número máximo de alunos foi atingido
            alunos.add(aluno);
            quantidadeAlunos++;
            System.out.println("Aluno " + aluno.getNomeCompleto() + " adicionado à turma.");
        } else {
            System.out.println("Não foi possível adicionar o aluno. O número máximo de alunos foi atingido.");
        }
    }

    // Método para remover aluno da turma
    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        quantidadeAlunos--;
        System.out.println("Aluno " + aluno.getNomeCompleto() + " removido da turma.");
    }

    // Método para verificar se a turma atende às regras mínimas
    public boolean turmaAtendeRegrasMinimas() {
        return anoEnsino >= 5 && quantidadeAlunos >= 5;
    }
}