# Anotações Referentes a Testes

## Testes Automatizaods

### O que são?

Testes automatizados são testes que são executados automaticamente, sem a necessidade de intervenção humana, e que podem ser executados de forma repetida, em um curto espaço de tempo, com o objetivo de verificar se o comportamento do sistema está de acordo com o esperado.

São um tipo de verificação e validação de software, que tem como objetivo verificar se o software está de acordo com o esperado, e validar se o software está de acordo com o que o cliente deseja.

No geral, os testes desempenham um papel fundamental na melhoria da qualidade do software, na aceleração do processo de desenvolvimento e na redução de custos.

São extremamente recomendaveis em desenvolvimento de software, pois permitem que o desenvolvedor tenha mais confiança em seu código, e que o mesmo possa ser alterado sem medo de quebrar o sistema.

Especialmente abordados no contexto de desenvolvimento ágil, os testes automatizados são uma parte fundamental do desenvolvimento de software, pois permitem que o desenvolvedor tenha mais confiança em seu código, e que o mesmo possa ser alterado sem medo de quebrar o sistema.

### Caracteristicas

1. Execução Automatizada: São escritos uma vez e podem ser executados repetidamente sempre que necessário, sem a necessidade de intervenção manual.

2. Reprodutibilidade: Os testes automatizados são executados em um ambiente controlado, o que permite que os resultados sejam reproduzidos.

3. Identificação Rápida de Problemas: Testes automatizados são executados em um curto espaço de tempo, o que permite que os problemas sejam identificados rapidamente.

4. Integração Contínua: Os testes automatizados são executados em um ambiente controlado, o que permite que os resultados sejam reproduzidos.


### Tipos de Testes Automatizados

Existem vários tipos de testes de unidades incluindo:

1. Testes de Unidade: Testes de unidade são testes que verificam o comportamento de uma unidade de código, como um método ou uma classe, de forma isolada.

2. Testes de Integração: Testes de integração são testes que verificam o comportamento de um conjunto de unidades de código, como um conjunto de classes, de forma integrada.

3. Testes de Aceitação: Testes de aceitação são testes que verificam o comportamento de um sistema, de forma integrada, simulando o comportamento do usuário.

4. Testes de Desempenho: Testes de desempenho são testes que verificam o comportamento de um sistema, de forma integrada, simulando um grande número de usuários.

5. Testes de Segurança: Testes de segurança são testes que verificam o comportamento de um sistema, de forma integrada, simulando ataques de hackers.


### Testes de Unidade

Testes de unidade são testes que verificam o comportamento de uma unidade de código, como um método ou uma classe, de forma isolada.

Por convenção colocamos o sufixo Test ou UnitTest no nome da classe de teste.

Declara-se a classe a ser testada dentro da classe de teste.

Anotação @Test indica que o método é um teste.

Exemplos de testes de unidade podem ser encontrados [aqui](/Testes/testes_unidade.java)

Pode ser utilizado a anotação @DisplayName para dar um nome mais descritivo ao teste.

Cada execução do teste unitario deve ser independente, ou seja, não deve depender de outros testes.

Deve ter uma chamada do método que está sendo testado.

A asserção é a verificação do resultado esperado.

No caso do exemplo foi utilizado majoritariamente ```Assert.assertEquals``` para verificar se o resultado esperado é igual ao resultado obtido.

### Mocks

Em casos que os testes unitarios possuem dependência externa é necessário utilizar mocks.

Mocks é um objeto simulado ou substituto que simula o comportamento de objetos reais de forma controlada.

Mocks são usados principalmente para isolar a unidade de código que está sendo testada.

Os mocks são programados para simular o comportamento esperado dos objetos reais.

Além disso os testes ficam mais rápidos, pois os Mocks não dependem de recursos externos.

As anotações do Mockito são:

- @InjectMocks: Responsavel por dizer que o objeto que está abaixo desta anotação será onde os mocks serão injetados. Somente um objeto pode receber essa anotação.

- @Mock: Responsavel por dizer que o objeto que está abaixo desta anotação será um mock. Ou seja o objeto será simulado.

- @BeforeEach: Responsavel por dizer que o método que está abaixo desta anotação será executado antes de cada teste.

- Open Mocks: Responsavel por dizer que os mocks serão criados antes de cada teste.

- Mockito.when().thenThrow(): Responsavel por dizer que quando o método que está entre os parenteses for chamado, o mock deve lançar uma exceção.

Dentro do when coloca-se a chamada do metodo externo, passanddo exatamente os paremtros com que ele será chamado.

Dentro do thenThrow coloca-se a exceção que será lançada.

Caso deseja retornar um valor utiliza-se ```thenReturn()```.

```java
public class UserServiceTest{
    @InjectMocks
    private UserService service;

    @Mock
    private UserDAO dao;

    @BeforeEach
    public void setup(){
        MockitoAnnotatios.openMocks(this);
    }

    @Test
    @DisplayName("Teste de exceção")
    void addUsersWhenThe...(){
        Mockito.when(
            userDAO.create("Teste", LocalDate.of(1912, 6, 23), "1233124412").thenThrow(UserCreationException.class)
        );

        Assertions.assertThrow(UserCreationExceptio.class () ->
        service.addUser("Teste", LocalDate.of(1912, 6, 23), "1233124412"
         ) );
    }
}
```


Vamos por etapa para entender melhor o código acima:

1. ```@InjectMocks``` é uma anotação do Mockito que indica que o objeto que está abaixo desta anotação será onde os mocks serão injetados. Somente um objeto pode receber essa anotação.

No caso o objeto que está abaixo da anotação é o UserService, ou seja os mocks serão injetados no UserService.

2. ```@Mock``` é uma anotação do Mockito que indica que o objeto que está abaixo desta anotação será um mock. Ou seja o objeto será simulado.

O objeto que está sendo simulado então é o UserDAO.

3. ```@BeforeEach``` é uma anotação do JUnit que indica que o método que está abaixo desta anotação será executado antes de cada teste.

No caso o método que está abaixo da anotação é o setup.

O método setup é responsavel por inicializar os mocks.

4. ```MockitoAnnotatios.openMocks(this)``` é uma chamada do Mockito que indica que os mocks serão criados antes de cada teste.

5. ```Mockito.when()``` é uma chamada do Mockito que indica que quando o método que está entre os parenteses for chamado, o mock deve retornar o que está entre os parenteses do thenReturn.

6. ```Assertions.assertThrow()``` é uma chamada do JUnit que indica que o teste deve lançar uma exceção.

7. ```UserCreationExceptio.class``` é uma chamada do JUnit que indica que o teste deve lançar uma exceção do tipo UserCreationException.

