import br.edu.infnet.juliatallarico.model.domain.Endereco;
import br.edu.infnet.juliatallarico.model.domain.Professor;
import br.edu.infnet.juliatallarico.model.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfessorLoader implements ApplicationRunner {

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Criando um endereço para o professor
        Endereco endereco = new Endereco("54321", "Rua XYZ", "Apto 202", "Bairro Central", "Cidade Y", "UF");

        // Criando um professor
        Professor professor = new Professor("João Silva", "Matemática", "Segunda a sexta, 8h às 18h", 5000.00f, endereco, "Licenciatura em Matemática", "123456789");

        // Incluindo o endereço no serviço de endereços
        enderecoService.incluir(endereco);

        // Imprimindo informações do professor
        System.out.println("Professor criado: " + professor);
    }
}