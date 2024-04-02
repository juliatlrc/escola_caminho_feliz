package br.edu.infnet.juliatallarico.model.service;

import br.edu.infnet.juliatallarico.model.domain.Endereco;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EnderecoService {
    private static Map<String, Endereco> enderecos = new HashMap<String, Endereco>();

    public void incluir(Endereco endereco) {
        enderecos.put(endereco.getCep(), endereco);

    }

    public void excluir(String cep) {
        enderecos.remove(cep);
    }

    public Collection<Endereco> listaEnderecos() {
        return enderecos.values();
    }

    public Endereco obterEndereco(String cep) {
        return enderecos.get(cep);
    }
}
