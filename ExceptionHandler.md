# Exception Handler

No desenvolvimento de um sistema deve-se pensar em como tratar as exceções que podem ocorrer durante a execução do sistema. Ou seja em todos os cenários possíveis que podem ocorrer durante a execução do sistema.

Quando ocorre um comportamento não esperado em nosso sistema, geralmente trata-se esse comportamento com o lançamento de uma exceção.

Mas o que acontece com uma exceção que é lançada e não é tratada? O sistema quebra, ou seja, o sistema para de funcionar.

Exemplo: Whitelabel Error Page

Esse erro é lançado quando ocorre uma exceção e não é tratada. O sistema para de funcionar e é exibida uma página de erro.

Essa mensagem de rro não é clara para o usuário, pois não informa o que aconteceu e como resolver o problema.

A aplicação deve ser sempre transparente para o usuário, ou seja, o usuário deve saber o que aconteceu e como resolver o problema.


Quando acessamos batendo via endpoint, a mensagem de erro se torna mais clara, pois é exibido o erro que ocorreu.

O que é um endpoint?

É um ponto de acesso da aplicação, ou seja, é uma URL que acessamos para executar uma ação.

Essa ação pode ser por exemplo, cadastrar um usuário, listar usuários, etc.

Retomando ao assunto de exceções, quando ocorre uma exceção e não é tratada, o sistema para de funcionar e é exibida uma página de erro.

É possível costumizar esse comportamento, ou seja, é possível tratar as exceções que ocorrem na aplicação e exibir uma mensagem de erro mais clara para o usuário.

Para isso, devemos criar uma classe que irá tratar as exceções que ocorrem na aplicação.

Por padrão o Spring retorna o HTTP Status 500 (Internal Server Error) quando ocorre uma exceção não tratada.

Pode ser utilizado o Thymeleaft para costumizar a página de erro.

Para isso adicionamos uma página chamada error em src/main/resources/templates.

A classe de erro tem por padrão as seguintes propriedades:

|Propriedade|Descrição|
|-----------|---------|
|${timestamp}|Data e hora que ocorreu o erro|
|${path}|Endpoint que foi acessado|
|${error}|Nome do http lançado|
|${status}|Status do http lançado|
|${message}|Mensagem de erro|
|${exception}|Exceção lançada|

Exemplo:

``` html

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <header>
            <h1>Error Page</h1>
        </header>
        <main>
            <table>
                <tr>
                    <td>Date</td>
                    <td th:text="${timestap}"></td>
                </tr>
            </table>
        </main>

```

Para o exemplo acima, o th:text="${timestap}" irá exibir a data e hora que ocorreu o erro.

Quando não se usa o Thymeleaf, pode-se criar uma classe que irá capturar as exceções que ocorrem na aplicação.

O uso dessa classe impacta no uso do Thymeleaf, pois o Thymeleaf é um framework que permite a criação de páginas HTML com Java.

Para isso deve-se utilizar a anotação @RestControllerAdvice e herdar da classe ResponseEntityExceptionHandler.

``` java
@Log4j2
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

}

```


Lembrando que a anotação @log4j2 é uma anotação do Lombok que permite a criação de logs na aplicação.

