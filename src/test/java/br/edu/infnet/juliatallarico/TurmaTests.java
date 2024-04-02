package br.edu.infnet.juliatallarico;

import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Endereco;
import br.edu.infnet.juliatallarico.model.domain.Professor;
import br.edu.infnet.juliatallarico.model.domain.Turma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTests {

    @Test
    void testConstrutorEGetters() {
        Professor professor = new Professor("João", "Matemática", "Segunda-feira", 2500, null, "Doutorado", "123456789");
        Turma turma = new Turma(6, professor, "A101");

        assertEquals(6, turma.getAnoEnsino());
        assertEquals(professor, turma.getProfessorResponsavel());
        assertEquals("A101", turma.getNumeroSala());
        assertEquals(0, turma.getQuantidadeAlunos());
        assertTrue(turma.getAlunos().isEmpty());
    }

    @Test
    void testAdicionarAluno() {
        Professor professor = new Professor("João", "Matemática", "Segunda-feira", 2500, null, "Doutorado", "123456789");
        Turma turma = new Turma(6, professor, "A101");

        Endereco endereco = new Endereco("12345", "Rua X", "Apto 101", "Bairro Y", "Cidade Z", "UF");
        Aluno aluno = new Aluno("Maria", 16, 6, "6A", endereco, "Pais de Maria", "987654321", new double[]{8.5, 9.0, 7.5});

        turma.adicionarAluno(aluno);

        assertEquals(1, turma.getQuantidadeAlunos());
        assertFalse(turma.getAlunos().isEmpty());
        assertTrue(turma.getAlunos().contains(aluno));
    }

    @Test
    void testRemoverAluno() {
        Professor professor = new Professor("João", "Matemática", "Segunda-feira", 2500, null, "Doutorado", "123456789");
        Turma turma = new Turma(6, professor, "A101");

        Endereco endereco = new Endereco("12345", "Rua X", "Apto 101", "Bairro Y", "Cidade Z", "UF");
        Aluno aluno = new Aluno("Maria", 16, 6, "6A", endereco, "Pais de Maria", "987654321", new double[]{8.5, 9.0, 7.5});

        turma.adicionarAluno(aluno);
        assertEquals(1, turma.getQuantidadeAlunos());

        turma.removerAluno(aluno);
        assertEquals(0, turma.getQuantidadeAlunos());
        assertTrue(turma.getAlunos().isEmpty());
    }

    @Test
    void testTurmaAtendeRegrasMinimas() {
        Professor professor = new Professor("João", "Matemática", "Segunda-feira", 2500, null, "Doutorado", "123456789");
        Turma turma = new Turma(6, professor, "A101");

        assertFalse(turma.turmaAtendeRegrasMinimas());

        Endereco endereco = new Endereco("12345", "Rua X", "Apto 101", "Bairro Y", "Cidade Z", "UF");
        for (int i = 0; i < 5; i++) {
            Aluno aluno = new Aluno("Aluno" + i, 16, 6, "6A", endereco, "Pais do Aluno" + i, "98765432" + i, new double[]{8.5, 9.0, 7.5});
            turma.adicionarAluno(aluno);
        }

        assertTrue(turma.turmaAtendeRegrasMinimas());
    }
}