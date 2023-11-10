# Integração Contínua

## Antes do CI/CD (Continuous Integration/Continuous Delivery)

O  processo de desenvolvimento de software colaborativo era por meio de soluções não tão convencionais. O compartilhamento era feito por meio de e-mails, FTP, etc. O que dificultava o processo de desenvolvimento, pois não havia um controle de versão, o que dificultava a identificação de erros e a manutenção do código.

Utilizando o FTP as sobrescritas de código eram comuns, pois não havia um controle de versão, o que dificultava a identificação de erros e a manutenção do código. Ademais também não era possível identificar quem havia feito a modificação.

Não havia o desenvolvimento de testes, então havia um dificuldade extrema em fazer o código executar em todos os ambientes de desenvolvimento.

Pouco tempo era dedicado para a qualidade do código e do produto final de maneira geral.

Através dos softwares de versionamento foi possível ter um controle de versão, o que facilitou a identificação de erros e a manutenção do código. Além disso também foi possível identificar quem havia feito a modificação.

## Ambientes de Software

### Development

É o ambiente de desenvolvimento, onde o código é desenvolvido e testado.

É o ambiente em que você não está exposto ao resto da equipe, então você pode fazer o que quiser, mas é importante que você não quebre o código.

Isso permite codificar sem se preocupar com o resto da equipe, mas é importante que você não quebre o código.

### Homologation

É o ambiente de homologação, onde o código é testado pelo cliente.

### Staging

É o ambiente de staging é o mais próximo possível da realidade de produção, é onde o código é testado em um ambiente que é o mais próximo possível da realidade de produção.

Esse ambiente pode ser utilizado para mostrar a funcionalidade aos clientes.

### Production

É o ambiente de produção, onde o código é executado em produção.

## CI/CD

Acronimo para Continuous Integration/Continuous Delivery, é um conjunto de práticas que visa automatizar o processo de desenvolvimento de software.

Essas práticas visam automatizar e melhorar o processo de desenvolvimento, testes e entrega de software

### CI

Prática que se concentra na automação do processo de integração de código-fonte de várais fontes de desenvolvedores diferentes em um único repósitorio central.

A cada alteração no código fonte essa alteração é integrada ao repositório central.

O sistema como Jenkins, Travis CI ou CircleCI é usado para automatizar essa integração e executar diversos testes para verificar se o ćodigo introduzido não quebrou o projeto.

### CD

É uma extensão da integracão contínua, onde o código é entregue ao cliente de maneira automatizada.

O principal objetivo é garantir que o software seja sempre implantavel ou seja sempre em um estado que pode ser implantado em produção.

Isso reduz a quantidade de trabalho manual necessária para implantar o software em produção.

Pode ser dividido em:

1. Continuous Delivery: Nesse cenário o software é implantado automaticamente em um ambiente de produção. Após a aprovação de uma equipe de operações ou de um gerente de produto, o software é implantado em produção.

2. Continuous Deployment: Nessa abordagem todas as alterações de código são aprovadas automaticamente implantadas em produção sem a intervenção de uma equipe de operações ou de um gerente de produto.

## Conclusões

O CI/CD é uma prática que visa automatizar o processo de desenvolvimento de software, isso permite que o desenvolvedor se concentre no que realmente importa, que é o desenvolvimento do software.

Visa automatizar e otimizar o ciclo de vida de desenvolvimento de software desde a integração de código até a entrega em produção.

|CI|CD|
|---|---|
|Integração em repositorio compartilhado| Extensão do CI|
| Facilitar modificação do código| Recebe código e monitora a execução|
| Testes automatizados| Entrega automatizada|
| Identificar erros| Entrega automatizada|
|Garantir integridade| Garantir que o software seja sempre implantavel|