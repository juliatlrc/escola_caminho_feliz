package br.edu.infnet.juliatallarico.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.juliatallarico.model.domain.Professor;

@Service
public class ProfessorService {

    private static Map<String, Professor> professores = new HashMap<>();

    public void incluir(Professor professor) {
        professores.put(professor.getNome(), professor);
    }

    public void excluir(String nome) {
        professores.remove(nome);
    }

    public Collection<Professor> listaProfessores() {
        return professores.values();
    }

    public Collection<Professor> listarProfessores() {
        return professores.values();
    }

    public Professor obterProfessor(String nome) {
        return professores.get(nome);
    }
}