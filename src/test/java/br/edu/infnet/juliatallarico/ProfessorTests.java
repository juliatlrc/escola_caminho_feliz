package br.edu.infnet.juliatallarico;

import br.edu.infnet.juliatallarico.model.domain.Endereco;
import br.edu.infnet.juliatallarico.model.domain.Professor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTests {
    private Professor professorPadrao;

    private final String NOME = "Prof. Carlos";
    private final String DISCIPLINA = "Matemática";
    private final String HORARIO_TRABALHO = "Segunda-feira, das 08:00 às 12:00";
    private final float SALARIO = 5000.0f;
    private final String FORMACAO_SUPERIOR = "Licenciatura em Matemática";
    private final String TELEFONE = "(21) 98765-4321";

    @BeforeEach
    void setUp() {
        Endereco endereco = new Endereco("12345678", "Rua A", "Apto 101", "Centro", "Rio de Janeiro", "RJ");
        professorPadrao = new Professor(NOME, DISCIPLINA, HORARIO_TRABALHO, SALARIO, endereco, FORMACAO_SUPERIOR, TELEFONE);
    }

    @Test
    void testGetNome() {
        assertEquals(NOME, professorPadrao.getNome());
    }

    @Test
    void testGetDisciplina() {
        assertEquals(DISCIPLINA, professorPadrao.getDisciplina());
    }

    @Test
    void testGetHorarioTrabalho() {
        assertEquals(HORARIO_TRABALHO, professorPadrao.getHorarioTrabalho());
    }

    @Test
    void testGetSalario() {
        assertEquals(SALARIO, professorPadrao.getSalario());
    }

    @Test
    void testGetFormacaoSuperior() {
        assertEquals(FORMACAO_SUPERIOR, professorPadrao.getFormacaoSuperior());
    }

    @Test
    void testGetTelefone() {
        assertEquals(TELEFONE, professorPadrao.getTelefone());
    }

    @Test
    void testSetNome() {
        String novoNome = "Prof. Maria";
        professorPadrao.setNome(novoNome);
        assertEquals(novoNome, professorPadrao.getNome());
    }

    @Test
    void testSetDisciplina() {
        String novaDisciplina = "Física";
        professorPadrao.setDisciplina(novaDisciplina);
        assertEquals(novaDisciplina, professorPadrao.getDisciplina());
    }

    @Test
    void testSetHorarioTrabalho() {
        String novoHorarioTrabalho = "Terça-feira, das 14:00 às 18:00";
        professorPadrao.setHorarioTrabalho(novoHorarioTrabalho);
        assertEquals(novoHorarioTrabalho, professorPadrao.getHorarioTrabalho());
    }

    @Test
    void testSetSalario() {
        float novoSalario = 6000.0f;
        professorPadrao.setSalario(novoSalario);
        assertEquals(novoSalario, professorPadrao.getSalario());
    }

    @Test
    void testSetFormacaoSuperior() {
        String novaFormacao = "Doutorado em Matemática";
        professorPadrao.setFormacaoSuperior(novaFormacao);
        assertEquals(novaFormacao, professorPadrao.getFormacaoSuperior());
    }

    @Test
    void testSetTelefone() {
        String novoTelefone = "(21) 12345-6789";
        professorPadrao.setTelefone(novoTelefone);
        assertEquals(novoTelefone, professorPadrao.getTelefone());
    }
}