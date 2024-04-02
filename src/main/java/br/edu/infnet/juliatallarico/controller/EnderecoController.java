package br.edu.infnet.juliatallarico.controller;

import br.edu.infnet.juliatallarico.model.domain.Endereco;
import br.edu.infnet.juliatallarico.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endereco")

public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(value = "/{cep}")
    public Endereco obterPorCep(@PathVariable String cep) {
        return enderecoService.obterEndereco(cep);
    }
}
