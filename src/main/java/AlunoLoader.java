import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Endereco;
import br.edu.infnet.juliatallarico.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AlunoLoader implements ApplicationRunner {

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Criando um endereço para o aluno
        Endereco endereco = new Endereco("12345", "Rua ABC", "Apto 101", "Bairro Central", "Cidade X", "UF");

        // Criando um aluno
        Aluno aluno = new Aluno("Fulano de Tal", 20, 2024, "Turma A", endereco, "Responsável", "123456789", new double[]{8.5, 7.0, 9.2});

        // Incluindo o endereço no serviço de endereços
        enderecoService.incluir(endereco);

        // Imprimindo informações do aluno
        System.out.println("Aluno criado: " + aluno);
    }
}