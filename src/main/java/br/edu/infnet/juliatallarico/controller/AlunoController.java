package br.edu.infnet.juliatallarico.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping(value = "/incluiraluno")
    public void incluir(@RequestBody Aluno aluno) {
        alunoService.incluir(aluno);
    }

    @DeleteMapping(value = "/{nome}/excluiraluno")
    public void excluir(@PathVariable String nome) {
        alunoService.excluir(nome);
    }

    @GetMapping(value = "/listaralunos")
    public Collection<Aluno> listaralunos() {
        return alunoService.listaAlunos();
    }

    @GetMapping(value = "/{nome}/obteraluno")
    public Aluno obterAluno(@PathVariable String nome) {
        return alunoService.obterAluno(nome);
    }
}
