O contexto de uma escola foi escolhido por ser um ambiente conhecido e facilmente
compreensível. 
Além disso, uma escola possui várias entidades interconectadas, o que
permite criar uma estrutura de classes interessante para demonstrar diferentes aspectos
da programação orientada a objetos.<br>
Classe Aluno.java:
Atributos: nomeCompleto, idade, ano, turma, endereco, nomeResponsaveis,
telefoneContato, notas. <br>
Descrição: A classe Aluno representa um aluno matriculado na escola. Ela possui
atributos como nomeCompleto, idade, ano (indicando o ano de escolaridade), turma (a
turma à qual o aluno está associado), endereco (endereço residencial do aluno),
nomeResponsaveis (nome dos responsáveis pelo aluno), telefoneContato (número de
telefone para contato) e notas (notas do aluno em diferentes disciplinas).<br>
Classe Professor.java:
Atributos: nome, disciplina, horarioTrabalho, salario, endereco, formacaoSuperior, telefone.
Descrição: A classe Professor representa um professor que leciona na escola. Ela possui
atributos como nome, disciplina (a disciplina que o professor ministra), horarioTrabalho,
salario, endereco (endereço residencial do professor), formacaoSuperior (formação
acadêmica do professor), telefone (número de telefone de contato do professor).<br>
Classe Turma.java:
Atributos: anoEnsino, professorResponsavel, quantidadeAlunos, numeroSala, alunos.
Descrição: A classe Turma representa uma turma de alunos em um determinado ano de
ensino. Ela possui atributos como anoEnsino (indicando o ano de escolaridade da turma),
professorResponsavel (o professor responsável pela turma), quantidadeAlunos (o número
de alunos na turma), numeroSala (o número da sala de aula) e alunos (lista de alunos
matriculados na turma).<br>
Análise dos atributos da classe:<br>
Aluno<br>
● nomeCompleto: Representa o nome completo do aluno, que é uma informação
fundamental para identificar individualmente cada aluno.<br>
● idade: Reflete a idade do aluno, o que pode ser importante em diversos contextos<br>
educacionais, como a organização em diferentes séries ou para avaliar requisitos
de idade mínima.<br>
1<br>
● ano: Indica o ano de estudo em que o aluno está matriculado, permitindo a<br>
organização dos alunos em diferentes classes ou séries.<br>
● turma: Representa a turma à qual o aluno está associado, o que é fundamental para<br>
agrupar os alunos de acordo com o ano de estudo e facilitar o gerenciamento<br>
escolar.<br>
● endereco: Um objeto do tipo Endereco, que armazena informações sobre o<br>
endereço do aluno, como seu logradouro, bairro, cidade, etc. Essa informação pode<br>
ser útil para atividades administrativas ou para comunicação com os responsáveis.<br>
● nomeResponsaveis: Armazena o nome dos responsáveis pelo aluno, o que é crucial<br>
para a comunicação entre a escola e a família do aluno.<br>
● telefoneContato: Permite registrar um número de telefone para contato, facilitando<br>
a comunicação entre a escola e os responsáveis pelo aluno.<br>
● notas: Um array que armazena as notas do aluno em diferentes disciplinas ou<br>
avaliações. Isso é fundamental para acompanhar o desempenho acadêmico do<br>
aluno ao longo do tempo.<br>
