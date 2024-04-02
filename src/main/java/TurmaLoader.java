import br.edu.infnet.juliatallarico.model.domain.Aluno;
import br.edu.infnet.juliatallarico.model.domain.Professor;
import br.edu.infnet.juliatallarico.model.domain.Turma;
import br.edu.infnet.juliatallarico.model.service.AlunoService;
import br.edu.infnet.juliatallarico.model.service.ProfessorService;
import br.edu.infnet.juliatallarico.model.service.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TurmaLoader implements ApplicationRunner {

    @Autowired
    private TurmaService turmaService;

    @Autowired
    private ProfessorService professorService;

    @Autowired
    private AlunoService alunoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Criando um professor responsável
        Professor professorResponsavel = new Professor("João Silva", "Matemática", "Segunda a sexta, 8h às 12h", 4000, null, "Licenciatura em Matemática", "(21) 98765-4321");
        professorService.incluir(professorResponsavel);

        // Criando alunos para a turma
        Aluno aluno1 = new Aluno("Maria Souza", 17, 2024, "A", null, "José Souza", "(21) 98765-1234", new double[]{8.5, 7.8, 9.2});
        alunoService.incluir(aluno1);
        Aluno aluno2 = new Aluno("Carlos Oliveira", 16, 2024, "A", null, "Ana Oliveira", "(21) 98765-5678", new double[]{9.0, 8.7, 8.9});
        alunoService.incluir(aluno2);

        // Criando uma turma e adicionando os alunos
        Turma turma = new Turma(2024, professorResponsavel, "Sala 101");
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        // Incluindo a turma criada
        turmaService.incluir(turma);
    }
}