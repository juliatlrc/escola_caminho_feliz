package br.edu.infnet.juliatallarico.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.juliatallarico.model.domain.Professor;
import org.springframework.stereotype.Service;

import br.edu.infnet.juliatallarico.model.domain.Turma;

@Service
public class TurmaService {

    private static Map<String, Turma> turmas = new HashMap<>();

    public void incluir(Turma turma) {
        turmas.put(turma.getNumeroSala(), turma);
    }
    public void excluir(String numeroSala) {
        turmas.remove(numeroSala);
    }

    public Collection<Turma> listaTurmas() {
        return turmas.values();
    }

    public Collection<Turma> listarTurma() {
        return turmas.values();
    }

    public void criarTurma(Turma turma) {
        incluir(turma);
    }

    public Turma obterTurma(String numeroSala) {
        return turmas.get(numeroSala);
    }
}