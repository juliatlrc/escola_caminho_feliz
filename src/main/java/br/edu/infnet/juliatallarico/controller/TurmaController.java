package br.edu.infnet.juliatallarico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Turma;
import br.edu.infnet.juliatallarico.model.service.TurmaService;

@RestController
@RequestMapping("/api/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @PostMapping("/criar")
    public void criarTurma(@RequestBody Turma turma) {
        turmaService.criarTurma(turma);
    }

    @GetMapping("/listar")
    public List<Turma> listarTurmas() {
        return (List<Turma>) turmaService.listarTurma();
    }
}
