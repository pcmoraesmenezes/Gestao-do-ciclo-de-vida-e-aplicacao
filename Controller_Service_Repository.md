# Controller, Service e Repository

## Controller

O controlador é responsavel por lidar com as solicitações de entrada do usuário e interagir com os modelos e serviços para realizar as solicitações.

Ele recebe solicitações dos clientes (como por exemplo uma solicitação HTTP) e as encaminha para o serviço apropriado, que é responsável por implementar a lógica de negócio.

Geralmente, os controladores delegam o processamento das solicitações para os serviços, que são responsáveis por implementar a lógica de negócio.

## Service

Os serviços contêm a lógica de negócio.

São responsáveis por realizar operações específicas e complexas que não pertencem ao controlador.

OS serviços encapsulam a lógica de negócio e são usados ​​por controladores e outros serviços.

Podem ser chamados por diferentes controladores, ou até mesmo por outros serviços.

Essa camada é onde regras de negócio são implementadas.

Serviços podem ser utilizados para orquestrar varias ações em diferentes repositórios.

## Repository

Repositório é responsável por acessar e manipular os dados.

Geralmente os repositórios são usados para acessar o banco de dados. por meio de consultas.

Os repositórios abstram a camada de acesso a dados, ou seja, os controladores e serviços não precisam saber como os dados são acessados.

Além disso permite que outras partes do sistema interajam com os dados de forma independente da implementação de acesso a dados.

Dito isso, essa abstração facilita a manutenção e a troca de fontes e dados, como a mudança de um banco de dados, sem afetar o restante do sistema.

## Injeção de dependências

A injeção de dependências é um principio de design de software e padrão de projeto que implementa a inversão de controle para resolver dependências.

Tem como objetivo reduzir o acoplamento entre componentes de um sistema

Amplamente utilizada em programação orientada a objetos, a injeção de dependência envolve fornecer explicitamente as dependencias a um objeto em vez de deixar o objeto criar as dependencias.

Beneficios:

**1. Desacoplamento:** As dependencias são desacopladas do objeto, ou seja o objeto não precisa saber como as dependencias são criadas.

**2. Testabilidade:** As dependencias podem ser facilmente substituidas por mocks, o que facilita a criação de testes.

**3. Reutilização:** As dependencias podem ser reutilizadas em outros objetos.

**4. Flexibilidade:** As dependencias podem ser facilmente substituidas por outras dependencias.

Existem varias maneiras de realizar a injeção de dependências, como por exemplo:

1. Injeção de Dependência por Construtor: As dependencias são fornecidas por meio do construtor da classe. 
```Java
public class UserService{
//User Repository is an interface

private UserRepository repository;

public User (UserRepository repository){
    this.repository = repository;
}
}
```

Analisando por etapas:

1. A classe UserService possui uma dependencia com a interface UserRepository.

2. A dependencia é fornecida por meio do construtor da classe UserService.

3. A dependencia é atribuida a variavel repository.

a classe UserService não precisa saber como a dependencia é criada, ela apenas recebe a dependencia.

2. Injeção de Dependência por Propriedade

AS dependências são definidas como propriedades da classe.

```Java
public class UserService{

    private UserRepository repository;

    public void setUserRepository(UserRepository repository){
        this.repository = repository;
    }
}

```

Analisando por etapas:

1. A classe UserService possui uma dependencia com a interface UserRepository.

2. A dependencia é definida como uma propriedade da classe UserService.

3. A dependencia é atribuida a variavel repository.

a classe UserService não precisa saber como a dependencia é criada, ela apenas recebe a dependencia.

3. Injeção de Dependência por Método

As dependencias são fornecidas por meio de um método.

```Java

public class UserService {
    public User addUser(UserRepository repository, String nome, LocalDate birthdate, String cpf){
        if (Objects.isNull(user){
            throw new UserCreationException("User cannot be null");
        })
        return user;
    }
}

```

Analisando por etapas:

1. Tem-se uma metódo que recebe a dependencia como parametro. Essa dependencia é atribuida a variavel repository.

o parametro para addUser é a dependencia.

User é o retorno do método.

Existem containers de injeção de dependências que são responsaveis por criar as dependencias e injeta-las nos objetos.

Um exemplo de container de injeção de dependências é o Spring Framework.