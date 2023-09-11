# Scrum

Nome derivado de uma jogada do Rugby

Scrum é um framework agil, iterativo e incremental para gerenciamento de um projeto.

Por mais que tenha sido criado para o desenvolvimento de software ele pode ser aplicado em qualquer projeto.

Scrum se baseia em três pilares:

-   *Transparencia* -> Todo processo deve estar visivel a todos os envolvidos na criação do produto

-   *Inspeção* -> Scrum é empirico, logo é necessário inspecionar o produto para evitar eventuais problemas.

-   *Adaptação*  -> No caso de problemas serem encontrados é necessário fazer as adaptações o mais breve possível para assegurar a produtividade da equipe

## Papeis no Scrum

Times no scrum são auto organizados e multifuncionais, dessa forma o time decide qual a melhor forma de realizar o trabalho, sem inferencia externa. 

A multifuncionalidade implica a não dependencia de ninguém fora do time.

### Product Owner
Responsavel por garantir o ROI (Return on Investiment), definir a visão do produto, gerenciar a entrada de novos requisitos e definir a sua ordem.

Dessa forma ele aceita ou rejeita o que foi feito pelo time ao fim de cada iteração

### Development Team
Todo o desenvolvimento é feito pelo development team. 

É responsável por desenvolver o produto e estimar as funcionalidades que aquele produto pode ter

Ele deve ser auto organizado

Ele deve ser  auto gerenciado

Devem ser pequenos o suficiente para manter a agilidade e produtividade, e grande o suficiente para evitar problemas de coordenação

Existem quatro estágios para um time organizado:
-   Forming: Inicio da formação do time, ninguem se conhece até então
-   Storming: Os membros passam a se conhecer
-   Norming: Os membros começam a criar algumas regras ou normas
-   Performing: Time passa a trabalhar de forma sincronizada, melhorando consequentemente o desempenho como um todo

### Scrum Master
Responsavel por orientar o product owner na criação e ordenação do Product Backlog

Ele também é responsável por:
-   Garantir a execução das ordens da Scrum
-   Facilitar os eventos da Scrum
-   Ajudar a remover embroglios que surgirem ao longo do desenvolvimento

Ele não exibe um papel ativo no time, entretanto ele é o lider na questão de processos.

Faz-se uso de tecnicas de coaching e facilitação para ajudar a visualizar problemas e encontrar melhores soluções para eles.

Ele promove o desafio para a equipe


## Eventos

### Sprint

Todo desenvolvimento do scrum é feito de forma iterativa e incremental.

-   Possuem duração fixa
-   Ao final de ciclo, temos incrementos potencilmente entregaveis do produto
-   Essas iterações são chamadas de sprint

A duração máxima de cada sprint é de até 30 dias, ou seja um mês, dessa forma é possível termos feedbacks constantes.

Dessa forma o Product Owner consegue analisar o que foi produzido e reorganizar de acordo com possíveis necessidades.

Durante uma execução de sprint, não deve ser feito quaisquer alterações que possam comprometer as metas da sprint.

### Sprint Planning Meeting
Ao inicio de cada sprint, ocorre uma reunião, ma qual o Time Scrum se reune para planejar o que será feito naquela sprint (Sprint Planning Meeting)

Cada Sprint Planning Meeting é dividida em duas partes:
-   O que será entregue no incremento resultante nesta sprint?
    -   O que será feito? O development team seleciona as tarefas que serão feitas e faz uma previsão das funcionalidades que serão desenvolvidas durante a Sprint

-   Como faremos para entregar o Incremento nessa sprint?
    -   O time cria um plano para entregar o incremento, ele deve ser criado de forma colaborativa, e deve ser feito de forma que todos os membros do time entendam o que deve ser feito.
    -   O time é autogereciavel, logo ele deve ser capaz de criar o plano de forma que todos entendam o que deve ser feito

Com o Sprint Backlog criado, o Time Scrum define a meta da Sprint

O que é Sprint Backlog? É o conjunto de tarefas que devem ser feitas para que o incremento seja entregue. 


### Daily Scrum

Como o time é formado colaborativamente, a Daily Scrum permite que os membros se comuniquem e entrem em sincronia.

A reunião, não é feita para qualquer tipo de relatorio, ou para o Scrum Master, ou para o Product Owner, afinal de contas eles são autogerenciaveis, a reunião é para eles mesmos apenas.

Essas reuniões fazem parte do ciclo de inspeção e adaptação do Scrum

Essa ánalise diaria é extremamente benéfica, já que caso ocorra algum problema pode ser feita a correção imediatamente.

### Sprint Review

Ao final de cada Sprint, o Time Scrum se reune para inspecionar o incremento e adaptar o Product Backlog se necessário.

Pode participar qualquer que estiver interessado no produto, entretanto apenas o Product Owner pode aceitar ou rejeitar o que foi feito.

Seu objetivo é analisar o trabalho feito durante a sprint e verificar se há necessidade de adaptação para o próximo ciclo.

Ou seja o objetivo é aprimorar o produto.

O Product Owner valida ou não a Sprint, tudo depende da meta que tensa sido estabelecida durante a Planning Meeting.


### Sprint Retrospective
Ocorre imediatamente após a Sprint Review e antes da próxima Sprint Planning Meeting.

Participam da reunião todos os membros do Time Scrum

O principal objetivo é inspecionar o ultimo Sprint e criar um plano para melhorar o próximo.

Ou seja, é uma reunião de melhoria continua.

## Fim da Scrum e agora?

Com o termino dos eventos da Scrum(Sprint Planning, Daily Scrum, Sprint Review e Sprint Retrospective), uma nova iteração do Scrum se inicia, dessa vez com foco no Backlog.

## Product Backlog

É uma lista ordenada, na qual contém todas as funcionalidades, requisitos, melhorias e correções que devem ser feitas no produto.

O Product Owner pode inserir, remover e reordenar os itens dessa lista

O formato mais utilizado para esses itens são os de User Stories, que são escritos em uma linguagem natural, e que descrevem uma funcionalidade do produto.

Exemplos de User Story:
```
Como um <tipo de usuário>, eu quero <alguma funcionalidade> para que <algum objetivo>

Como um usuário, eu quero poder me cadastrar no site para que eu possa ter acesso a conteudos exclusivos

```

Durante o andamento de um projeto, algumas funcionalidades vão ganhando mais importância e outras vão perdendo a importância.

Quando o item está considerado pronto para ser trabalhado?
-   Ele deve ser pequeno o suficiente para ser desenvolvido em uma Sprint
-   Deve deixar claro quanto a expectativa do Product Owner
-   Deve ser claro o suficiente para que o Time Scrum possa estimar o esforço necessário para desenvolver o item

## Sprint Backlog

Como dito anteriormente, o Sprint Backlog é o conjunto de tarefas que devem ser feitas para que o incremento seja entregue.

Também inclui o plano para transforma-las em incremento.

Consequentemente ao fim de cada Sprint Planning Meeting, o Sprint Backlog é criado.

### Kanban board é uma ferramenta que pode ser utilizada para gerenciar o Sprint Backlog.
```
O time divide cada um dos itens do Sprint Backlog em: 
-   A fazer(Todo)
-   Fazendo(Doing)
-   Feito(Done)
```

## Potentially Shippable Product Increment 

Ao fim de cada Sprint, o time entrega um incremento do produto

Ou seja o que foi produzido durante a sprint 

Esse é o conceito primordial do Scrum, tendo em vista a sua natureza empirica.


## Defination of Done
Definição de uma funcionalidade pronta 

É considerada como pronta, se ela atender a todos os critérios de aceitação estabelecidos pelo Product Owner e passado por todas as etapas definidas pelo Development Team.

## Lembrar da dinâmica dos aviões, uma aplicação prática dos conteudos vistos nessa anotação:

Tinhamos o momento de reunião, onde definiamos quantos aviões conseguiriamos produzir em um x tempo, ou seja uma reunião, além disso, podiamos estipular materias que gastariamos e, em seguida entrava a etapa de produção na qual faziamos o avião de acordo com o que foi pedido. Ao fim de cada produção o Product Owner (Professor) verificava se os aviões se encaixavam com o que foi pedido, se sim ele aceitava, se não ele rejeitava e o time tinha que fazer novamente.

