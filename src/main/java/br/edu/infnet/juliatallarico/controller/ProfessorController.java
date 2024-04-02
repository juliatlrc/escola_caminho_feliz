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

import br.edu.infnet.juliatallarico.model.domain.Professor;
import br.edu.infnet.juliatallarico.model.service.ProfessorService;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping(value = "/incluirprofessor")
    public void incluir(@RequestBody Professor professor) {
        professorService.incluir(professor);
    }

    @DeleteMapping(value = "/{nome}/excluirprofessor")
    public void excluir(@PathVariable String nome) {
        professorService.excluir(nome);
    }

    @GetMapping(value = "/listarprofessores")
    public Collection<Professor> listarProfessores() {
        return professorService.listarProfessores();
    }


    @GetMapping(value = "/{nome}/obterprofessor")
    public Professor obterProfessor(@PathVariable String nome) {
        return professorService.obterProfessor(nome);
    }
}
