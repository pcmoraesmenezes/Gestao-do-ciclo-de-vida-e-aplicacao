# Resumo Spring Boot

## O que é o Spring Boot?

Spring Boot é um framework que visa facilitar o processo de configuração e publicação de aplicações que utilizam o ecossistema Spring.

O Spring possuí vários projetos, esses projetos são referidos como Ecossistema Spring, o Spring Boot é um projeto desse ecossistema.

A principal ideia do Spring é fazer com que o desenvolver fique focado nas regras de negócio, e não em configurações.

Por exemplo, ter uma configuração rápida e fácil de um servidor web, ou de um banco de dados.

## Por que usar o Spring Boot?

O Spring Boot é uma ferramenta que facilita o desenvolvimento de aplicações Java, pois ele automatiza tarefas que são comuns no desenvolvimento de aplicações.

Ele resolve problemas como:

- Gerenciamento de Objetos: Refere-se à gestão eficiente e simplificada de objetos dentro de uma aplicação.

- Injeção de Dependências: Padrão de design utilizado em orientação a objetos para reduzir o acoplamento entre componentes de um sistema. A injeção de dependências envolve fornecer as dependências necessarias a um componente em vez de deixar o componente criar as dependências.

```java
public class ClienteService {

    private final RepositorioCliente repositorio;

    // Injeção de dependência por meio do construtor
    public ClienteService(RepositorioCliente repositorio) {
        this.repositorio = repositorio;
    }

    // Métodos que utilizam a dependência repositorio
}


```

A classe ClienteService possui uma dependência de RepositorioCliente, e essa dependência é injetada por meio do construtor. O Spring Boot ao iniciar a aplicação, identifica essa dependência e fornece automaticamente uma instância apropriada de RepositorioCliente.

- Acesso à diferentes bancos de dados: O Spring Boot possui suporte a vários bancos de dados, como MySQL, PostgreSQL, MongoDB, etc. E o desenvolvedor não precisa se preocupar com a configuração de conexão com o banco de dados.

- REST APIs: O Spring Boot possui suporte a criação de REST APIs, e o desenvolvedor não precisa se preocupar com a configuração de um servidor web. Uma REST API é um conjunto de padrões e princípios de arquitetura de software, que tem como objetivo facilitar a comunicação entre sistemas. Em rest api tudo é considerado recurso; ALém disso as operações básicas de um recurso são mapeadas em operações CRUD. Isso significa que é possível criar (POST), recuperar (GET), atualizar (PUT/PATCH) ou excluír (DELETE) um recurso. A representação pode ser feita em arquivos XML, JSON, HTML, etc.

- Além disso o spring simplifica o desenvolvimento de software; Tem constante evolução; É open source; Tem alta popularidade

## Spring Vs Jakarta EE

Spring Framework e o Jakarta EE são dois frameworks java amplamente utilizados para o desenvolvimento de aplicativos empresariais.

### Origem

**Spring**: Spring surgiu como uma alternativa ao modelo de programação Java EE, inicialmente focando em resolver problemas de complexidade e configuração do Java EE.

**Jakarta EE**: Padrão da Oracle para o desenvolvimento de aplicativos empresariais Java. 

### Arquitetura

**Spring**: Conhecido pela flexibilidade e facilidade de integração com outras tecnologias, além de permitir que os desenvolvedores escolham os módulos especificos do Spring.

**Jakarta EE**: Especificações mais rigidas e padronizadas. 

### DI - Injeção de Dependências

**Spring**: Conhecido pela inversão de controle e injeção de dependencia robustos, o spring oferece flexibilidade

**Jakarta EE**: Dependia muito do EJB para injeção de dependências, mas com a versão 6 do Java EE, foi introduzido o CDI (Contexts and Dependency Injection), que é uma especificação para injeção de dependências.

### Configuração

**Spring**: Utiliza abordagem baseada em código ou configuração XML.

**Jakarta EE**: Utiliza abordagem baseada em anotações graças ao avanço das versões, era extremamente dependente de arquivos de configuração XML.

## Visão Geral

O Spring Boot é um framework que visa facilitar o processo de desenvolvimento de aplicativos Java.

Fornece maneira rápida de criar aplicativos prontos para produção.

## Características

### Convenção sobre Configuração

O Spring Boot utiliza o conceito de Convenção sobre Configuração, que é um paradigma de desenvolvimento de software que visa reduzir o número de decisões que os desenvolvedores precisam tomar, ganhando assim em produtividade.

### Starter POMs

Project Object Models, são uma característica do Maven que permite a criação de projetos com dependências pré-definidas.

O Spring Boot utiliza o conceito de Starter POMs, que são POMs que possuem dependências pré-definidas para um determinado tipo de aplicação.

### Autoconfiguração

O Spring Boot utiliza o conceito de Autoconfiguração, que é um mecanismo que analisa o classpath da aplicação e fornece automaticamente configurações padrões para o que está faltando.

### Monitoramente e Gerenciamento

O Spring Boot Actuator oferece recursos de monitoramento e gerenciamento prontos para uso, como endpoints HTTP para métricas, health check, auditoria, etc.

Endpoints: São URLs que podem ser acessadas para obter informações sobre a aplicação. Por exemplo, a URL http://localhost:8080/actuator/health retorna informações sobre a saúde da aplicação.

Além disso o Spring tem fácil integração com frameworks Front-End, como Angular, React, Vue, etc.


## Mãos à Obra

A API utilizada será {JSON} Placeholder, que é uma API de teste gratuita para prototipagem e testes.

Essa API fornece dados de usuários, posts, comentários, etc.

### API

Uma API é um conjunto de regras e definições que facilitam a interação entre diferentes softwares.

Uma API permite que aplicativos comuniquem entre si, permitindo que eles requisitem e enviem dados uns aos outros.

### Criando o Projeto

Utilizando o IntelliJ, criar um novo projeto Spring Boot.

Dentro da pasta src/main/resources adicionar um arquivo chamado application.yaml, que é um arquivo de configuração do Spring Boot.

Adicionar as seguintes configurações:

```yaml

spring:
  application:
  name: // Nome da aplicação
  datasource:
  driver-class-name: com.mysql.cj.jdbc.Driver
  url: // URL do banco de dados
  username: // Usuário do banco de dados
  password: // Senha do banco de dados

```

O arquivo exemplo pode ser encontrado em: [application.yaml](/application.yaml.example)

### Bean

Bean é um objeto que é instanciado, gerenciado e injetado pelo Spring.

### Container IoC

O Spring IoC é um container que gerencia os objetos (beans) e suas dependências.

### Algumas anotações do Bean

**@Component**: Indica que uma classe é um componente do Spring.

**@Repository**: Indica que uma classe é um repositório, ou seja, é responsável por acessar o banco de dados.

**@Service**: Indica que uma classe é um serviço, ou seja, é responsável por implementar as regras de negócio.

**@Autowired**: Indica que uma dependência deve ser injetada pelo Spring.

**@Controller**: Indica que uma classe é um controller, ou seja, é responsável por receber as requisições e retornar as respostas.

### Controllers

Três principais anotações: @Controller, @RestController e @RestControllerAdvice.

**@Controller**: Indica que uma classe é um controller, ou seja, é responsável por receber as requisições e retornar as respostas.

**@RestController**: Indica que uma classe é um controller, ou seja, é responsável por receber as requisições e retornar as respostas. Além disso, essa anotação combina as anotações @Controller e @ResponseBody.

**@RestControllerAdvice**: Indica que uma classe é um controller advice, ou seja, é responsável por tratar exceções globais.

Os controladores anotados com @Controller geralmente são usados para manipular solicitações HTTP e gerenciar lógica de negocios. Retornam principalmente representações de visualizações HTML.

Exemplo:
    
```java
    @Log4j2
    @Controller
    @AllArgsConstructor

    public class BlogController{

        private final UserService service;
        @GetMapping("/")
        public String getHome(){
            return "home";
        }
    }

```

Vamos por etapas:

**@Log4j2**: Anotação do Lombok que gera um logger estático para a classe.

**@Controller**: Anotação do Spring que indica que a classe é um controller.

**@AllArgsConstructor**: Anotação do Lombok que gera um construtor com todos os argumentos.

**private final UserService service**: Injeção de dependência do serviço UserService.

**@GetMapping("/")**: Anotação do Spring que indica que o método getHome() é executado quando uma requisição GET é feita para a URL /.

**return "home"**: Retorna a view home.

No que diz respeito a anotação @RestController é uma versão especializada de @Controller, usada para casos em que o controlador precisa retornar dados no formato JSON ou XML.

Exemplo:

```java

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    @GetMapping
    public ResponseEntity<User> findUserById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(service.findById(id));)
    }
}

```

Vamos por etapas:

**@RestController**: Anotação do Spring que indica que a classe é um controller.

**@AllArgsConstructor**: Anotação do Lombok que gera um construtor com todos os argumentos.

**@RequestMapping("/api/user")**: Anotação do Spring que indica que a URL base para esse controller é /api/user.

**private final UserService service**: Injeção de dependência do serviço UserService.

**@GetMapping**: Anotação do Spring que indica que o método findUserById() é executado quando uma requisição GET é feita para a URL /api/user.

**return ResponseEntity.ok(service.findById(id))**: Retorna um ResponseEntity com o status 200 e o usuário encontrado.

**@PathVariable("id") Integer id**: Indica que o parâmetro id é passado na URL.

Não há nada que impeça que um controlador tenha acesso a um repositorio, por exemplo, entretanto é uma boa prática é que ele passe pelo Serviço (responsavel pela regras de negócio). É melhor chamar um serviço que somente chama um repositorio do que fazer o Controlador chamar diretamento o Repositorio

Como enviar dados para a página? Através da classe Model, chamando dois métodos: ```addAttribute()``` e ```addObject()```.

O método ```model.addAtributes(String atributeName, Object value)``` Recebe dois parametros, o nome do atributo e o valor do atributo. O método ```model.addObject(Object value)``` recebe apenas o valor do atributo.

```java
@GetMapping("/users")
public String user(Model model){
    List <User> users = service.getAllUsers();
    model.addAttribute("users", users);
    return "users";
}
```

O método ```model.addAttribute("users", users)``` adiciona o atributo users com o valor users.

O método ```getUsers()``` retorna uma lista de usuários.

Basicamente o que o método faz é adicionar o atributo users com o valor users, e retornar a view users.

Dessa forma tem-se o controlador enviando dados para a view.

Mas como fazer para receber dados da view?

Isso acontece tipicamente quando o usuário preenche um formulário e envia os dados para o servidor.

Usamos o argumento do metodo do controlador do tipo ```@ModelAttribute```, que indica que o objeto será preenchido com os dados enviados pelo usuário.

```java

@PostMapping("/users")
public String newUser(@ModelAttribute("user") User user){
    log.info("Entrou no cadastro de usuário");
    User addedUser = service.add(user);
    return "redirect:/user/" + addedUser.getId();
}

```

O método ```newUser()``` recebe um objeto do tipo User, que é preenchido com os dados enviados pelo usuário.

O método ```service.add(user)``` adiciona o usuário no banco de dados.

Ele então retorna a view redirect:/user/{id}, que redireciona para a página do usuário.

Existem diversos controladores que podem ser utilizados, como @GetMapping, @PostMapping, @PutMapping, @DeleteMapping, etc.

Alguns dos principais métodos do controlador são:

| Método | Descrição |
| --- | --- |
| @GetMapping | Indica que o método é executado quando uma requisição GET é feita para a URL especificada. |
| @PostMapping | Indica que o método é executado quando uma requisição POST é feita para a URL especificada. |
| @PutMapping | Indica que o método é executado quando uma requisição PUT é feita para a URL especificada. |
| @DeleteMapping | Indica que o método é executado quando uma requisição DELETE é feita para a URL especificada. |
| @PatchMapping | Indica que o método é executado quando uma requisição PATCH é feita para a URL especificada. |
| @RequestMapping | Indica que o método é executado quando uma requisição é feita para a URL especificada. |

Deletando um usuário:

```java

@DeleteMapping("/{id}")
public void deleteUserById(@PathVariable("id") Integer id){
    service.deleteById(id);
}

@PostMapping("/")
public ResponseEntity<User> createUser (@RequestBody UserRequest request){
    return ResponseEntity.ok(serivce.add(request));
}

```

@DeleteMapping recebe uma requisição DELETE para a URL /{id}, e o método deleteUserById() é executado.

@RequestBody indica que o corpo da requisição será convertido para o objeto UserRequest.

@PathVariable indica que o parâmetro id é passado na URL.

Vamos quebrar a classe ResponseEntity e entender o que ela faz.

**public:** Modificador de acesso.

**ResponseEntity:** Classe do Spring que representa uma resposta HTTP.

**<{user}>:** Tipo de dado que será retornado.

**createUser:** Nome do método.

**(@RequestBody UserRequest request):** Parâmetro do método.

### Service

O Service é responsável por implementar as regras de negócio.

Nos controladores não tem nenhum tipo de regra(if else, for, etc), apenas chamadas aos métodos do serviço.

O Service é um intermediário entre o controlador e o repositório. Ou seja, o controlador chama o serviço, e o serviço chama o repositório.

### Repository

O Repository é responsável por acessar o banco de dados.

Diferente do Service e Controller, o repositório é uma interface. Isso porque o Spring Data JPA fornece uma implementação padrão para essa interface.

Ela deve herdar a interface JpaRepository, que possui métodos para acessar o banco de dados.

```java
@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

}
```

O repositório que herda de JpaRepository recebe dois parâmetros, o tipo da entidade e o tipo do id.

Além disso ele já possui alguns métodos pré-definidos.

- **findAll()**: Retorna todos os registros da tabela.

- **findById()**: Retorna um registro da tabela com base no id.

- **save()**: Salva um registro na tabela. - Caso a entidade não existe, ele insere um novo registro. - Caso a entidade exista, ele atualiza o registro.

É possível criar consultas personalizadas através de métodos com nomes específicos.

```java
@Query(value = "SELECT * FROM user WHERE name = :name", nativeQuery = true)
Optional<User> findUserByName(@Param("name") String name);

```

### Entity

É uma representação da entidade que está no banco de dados. 

Utiliza-se a anotação com @Entity.

Precisa-se também definir o nome da tabela e qual o nome do schema que a tabela pertence.

Dentro do contexto de Spring toda entidade precisa ter uma chave primária. 

```java

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "db", name = "user")
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GeneratioType.IDENTITY)
    private Integer id;
    private String name;
    
    @Column(name = "email")
    private String email;
    private String phone;
    private String website;

    @OneToMany(mappedBy="user")
    private List<Post> posts;
}

```

Vamos entender por etapas:

**@Setter**: Anotação do Lombok que gera os métodos setters.

**@Getter**: Anotação do Lombok que gera os métodos getters.

**@Entity**: Anotação do Spring que indica que a classe é uma entidade.

**@Builder**: Anotação do Lombok que gera um construtor com todos os argumentos.

**@NoArgsConstructor**: Anotação do Lombok que gera um construtor sem argumentos.

**@AllArgsConstructor**: Anotação do Lombok que gera um construtor com todos os argumentos.

**@Table(schema = "db", name = "user")**: Anotação do Spring que indica o nome da tabela e o nome do schema.

**@Id**: Anotação do Spring que indica que o atributo é uma chave primária. O atributo passado com "@" é a chave primária.

**@GeneratedValue(strategy=GeneratioType.IDENTITY)**: Anotação do Spring que indica que o valor do atributo é gerado automaticamente. O atributo passado com "@" é o valor gerado automaticamente.

**@Column(name = "email")**: Anotação do Spring que indica o nome da coluna.

**@OneToMany(mappedBy="user")**: Anotação do Spring que indica que a relação entre as entidades é de um para muitos. O atributo passado com "@" é o nome do atributo na outra entidade.

MappedBy: Indica que a relação entre as entidades é de um para muitos. O atributo passado com "@" é o nome do atributo na outra entidade.

Tipos de estratégia para definir uma chave primaria:

|Tipo|Descrição|
|---|---|
|Identity|O banco de dados gera um valor automaticamente.|
|Sequence|O banco de dados gera um valor baseado em uma sequência.|
|Table|O banco de dados gera um valor baseado em uma tabela.|
|Auto|O provedor de persistência escolhe a estratégia mais adequada.|


### Templates

Utiliza-se o Thymeleaf para criar as views.

O Thymeleaf é um mecanismo de template que permite criar páginas HTML com conteúdo dinâmico.

Utiliza-se o prefixo ```th:``` para definir atributos e expressões.

Para cada objeto usa-se o prefixo ```th:object```.

Para cada lista usa-se o prefixo ```th:each```.

O acesso a um objeto é feito usando ```${objeto.atributo}```.

```html
<!--

    Recebe um objeto do tipo User, e exibe os dados do usuário.
 -->
<table>
    <tr>
        <th>Name</th>
        <th>Username</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Website</th>
    </tr>
    <tr th:object="${user}">
        <td><span th:text="${user.name}"></span></td>
        <td><span th:text="${user.username}"></span></td>
        <td><span th:text="${user.email}"></span></td>
        <td><span th:text="${user.phone}"></span></td>
        <td><span th:text="${user.website}"></span></td>
</table>

<!-- Exibindo os posts -->

<table>
    <tr>
        <th>Title</th>
        <th>Body</th>
    </tr>
    <tr th:each="post: ${user.posts}">
        <td><span th:text="${post.title}"></span></td>
        <td><span th:text="${post.body}"></span></td>
    </tr>
</table>


```

Para adicionar um novo usuario, utiliza-se o prefixo ```th:action```.

```html

<form th:action>="@{/user}" method="post">
    <label>
        Name:
        <input type ="text" id="name" th:field= "*{name}">
        <br/>
    </label>
    <label>
        Username:
        <input type ="text" id="username" th:field= "*{username}">
        <br/>
    </label>
    <label>
        Email:
        <input type ="text" id="email" th:field= "*{email}">
        <br/>
    </label>
    <label>
        Phone:
        <input type ="text" id="phone" th:field= "*{phone}">
        <br/>
    </label>
    <label>
        Website:
        <input type ="text" id="website" th:field= "*{website}">
        <br/>
    </label>
    <input type="submit" value="Submit">
</form>

```

Passa-se para o ```th:action``` a URL para onde os dados serão enviados. Nesse caso, a URL é /user, que é a URL do controlador. Passamos também o método HTTP, que nesse caso é POST.

Para cada campo do formulário, utiliza-se o prefixo ```th:field```.

Através deste prefixo, o Thymeleaf consegue fazer o binding dos dados enviados pelo usuário com o objeto User.

