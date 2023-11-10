# Testes automatizados

## Testes automatizados

### O que são

Processos de verificação e validação de software que são executados de forma automatizada, ou seja sem intervenção manual.

Desempenham um papel crucial no desenvolvimento de software, garantindo que o código seja executado corretamente e que não tenha bugs.

São extremamente recomendaveis em desenvolvimento de software especialmente em abordagem ágeis como a integração continua e a entrega continua.

### Caracteristicas

1. Execução automatizada: São escritos uma vez e podem ser executados repetidamente sempre que necessário, sem intervenção manual, economizando tempo e esforço

2. Reprodutibilidade: Garantem a reprodutibilidade dos testes, ou seja consistencia.

3. Identificação Rápida de Problemas: Identificam rapidamente os problemas, permitindo que eles sejam corrigidos rapidamente.

4. Integração Contínua: São essenciais para a integração continua, pois permitem que o código seja integrado ao projeto a cada alteração.

5. Cobertura Abrangente: Podem ser escritos para testar todos os aspectos do software, garantindo que o software funcione corretamente.

6. Documentação Viva: Podem ser usados como documentação, pois descrevem como o software deve funcionar.

### Tipos

#### Testes de Unidade

Testam uma unidade de código, geralmente uma função ou método, isoladamente, ou seja sem dependencias externas.

Mocks - São objetos simulados que simulam o comportamento de objetos reais, são usados para simular dependencias externas.

Ou seja quando um teste de unidade depende de algo externo, esse algo externo é simulado.



## Controllers, Services e Repositories

### Controllers

São responsáveis por receber as requisições e retornar as respostas.

Recebe as solicitações do cliente e as encaminha para o serviço apropriado.

### Services

São responsáveis por implementar a lógica de negócio.

### Repositories

São responsáveis por implementar a lógica de acesso a dados.

## Injeção de dependências

Principio de design de software e padrão de projeto que implementa a inversão de controle para resolver dependências.

Envolve fornecer explicitamente as dependencias a um objeto em vez de deixar o objeto criar as dependencias.

Beneficios:

**1. Desacoplamento:** As dependencias são desacopladas do objeto, ou seja o objeto não precisa saber como as dependencias são criadas.

**2. Reutilização:** As dependencias podem ser reutilizadas em outros objetos.

**3. Testabilidade:** As dependencias podem ser facilmente substituidas por mocks, o que facilita a criação de testes.



