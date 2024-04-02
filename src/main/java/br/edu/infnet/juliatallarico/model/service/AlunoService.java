package br.edu.infnet.juliatallarico.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.juliatallarico.model.domain.Professor;
import org.springframework.stereotype.Service;

import br.edu.infnet.juliatallarico.model.domain.Aluno;

@Service
public class AlunoService {

    private static Map<String, Aluno> alunos = new HashMap<>();

    public void incluir(Aluno aluno) {
        alunos.put(aluno.getNomeCompleto(), aluno); // Use o nome completo do aluno como identificador
    }

    public void excluir(String nomeCompleto) {
        alunos.remove(nomeCompleto);
    }

    public Collection<Aluno> listaAlunos() {
        return alunos.values();
    }

    public Aluno obterAluno(String nomeCompleto) {
        return alunos.get(nomeCompleto);
    }
}