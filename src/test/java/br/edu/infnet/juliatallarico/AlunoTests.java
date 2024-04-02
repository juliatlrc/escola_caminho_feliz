package br.edu.infnet.juliatallarico;

import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Endereco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTests {
    private Aluno alunoPadrao;

    private final String NOME_COMPLETO = "Maria Silva";
    private final int IDADE = 15;
    private final int ANO = 10;
    private final String TURMA = "10A";
    private final String NOME_RESPONSAVEIS = "José Silva e Ana Silva";
    private final String TELEFONE_CONTATO = "(21) 98765-4321";
    private final double[] NOTAS = {8.5, 7.8, 9.2};

    @BeforeEach
    void setUp() {
        Endereco endereco = new Endereco("23456789", "Rua B", "Casa 102", "Centro", "São Paulo", "SP");
        alunoPadrao = new Aluno(NOME_COMPLETO, IDADE, ANO, TURMA, endereco, NOME_RESPONSAVEIS, TELEFONE_CONTATO, NOTAS);
    }

    @Test
    void testGetNomeCompleto() {
        assertEquals(NOME_COMPLETO, alunoPadrao.getNomeCompleto());
    }

    @Test
    void testGetIdade() {
        assertEquals(IDADE, alunoPadrao.getIdade());
    }

    @Test
    void testGetAno() {
        assertEquals(ANO, alunoPadrao.getAno());
    }

    @Test
    void testGetTurma() {
        assertEquals(TURMA, alunoPadrao.getTurma());
    }

    @Test
    void testGetNomeResponsaveis() {
        assertEquals(NOME_RESPONSAVEIS, alunoPadrao.getNomeResponsaveis());
    }

    @Test
    void testGetTelefoneContato() {
        assertEquals(TELEFONE_CONTATO, alunoPadrao.getTelefoneContato());
    }

    @Test
    void testGetNotas() {
        assertEquals(NOTAS.length, alunoPadrao.getNotas().length);
        for (int i = 0; i < NOTAS.length; i++) {
            assertEquals(NOTAS[i], alunoPadrao.getNotas()[i]);
        }
    }

    @Test
    void testSetNomeCompleto() {
        String novoNome = "João Oliveira";
        alunoPadrao.setNomeCompleto(novoNome);
        assertEquals(novoNome, alunoPadrao.getNomeCompleto());
    }

    @Test
    void testSetIdade() {
        int novaIdade = 16;
        alunoPadrao.setIdade(novaIdade);
        assertEquals(novaIdade, alunoPadrao.getIdade());
    }

    @Test
    void testSetAno() {
        int novoAno = 11;
        alunoPadrao.setAno(novoAno);
        assertEquals(novoAno, alunoPadrao.getAno());
    }

    @Test
    void testSetTurma() {
        String novaTurma = "11B";
        alunoPadrao.setTurma(novaTurma);
        assertEquals(novaTurma, alunoPadrao.getTurma());
    }

    @Test
    void testSetNomeResponsaveis() {
        String novosResponsaveis = "Marcos Oliveira e Fernanda Oliveira";
        alunoPadrao.setNomeResponsaveis(novosResponsaveis);
        assertEquals(novosResponsaveis, alunoPadrao.getNomeResponsaveis());
    }

    @Test
    void testSetTelefoneContato() {
        String novoTelefone = "(21) 12345-6789";
        alunoPadrao.setTelefoneContato(novoTelefone);
        assertEquals(novoTelefone, alunoPadrao.getTelefoneContato());
    }

    @Test
    void testSetNotas() {
        double[] novasNotas = {7.0, 8.0, 6.5};
        alunoPadrao.setNotas(novasNotas);
        assertEquals(novasNotas.length, alunoPadrao.getNotas().length);
        for (int i = 0; i < novasNotas.length; i++) {
            assertEquals(novasNotas[i], alunoPadrao.getNotas()[i]);
        }
    }
}