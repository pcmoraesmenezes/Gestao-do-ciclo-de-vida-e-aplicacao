# GIT

## O que é

Criado por Linus Torvalds em 2005, o Git é um sistema de controle de versão distribuído, ou seja, ele não depende de um servidor central para armazenar os arquivos, cada desenvolvedor tem uma cópia do repositório localmente.

A criação do git se deu por necessidade de Linus Torvalds, que precisava de um sistema de controle de versão para o desenvolvimento do kernel do Linux, porém os sistemas de controle de versão existentes na época não atendiam as necessidades do projeto.

O git é um sistema de controle de versão distribuído, ou seja, ele não depende de um servidor central para armazenar os arquivos, cada desenvolvedor tem uma cópia do repositório localmente.

As alterações não são armazenadas como diferenças de arquivos, mas sim como um conjunto de snapshots, ou seja, cada alteração é armazenada como uma imagem do projeto inteiro. Ou seja não compromete a integridade do projeto.

## Terminologia

**Repository**: É o repositório do projeto, onde os arquivos são armazenados.

**Commit**: É uma alteração no projeto, cada commit é identificado por um hash.

**Branch**: É uma ramificação do projeto, é uma cópia do projeto que pode ser alterada sem afetar o projeto principal.

**Merge**: É a união de duas branches.

**Pull Request**: É uma solicitação de merge.

**Fork**: É uma cópia do projeto, geralmente feita por um desenvolvedor que não tem permissão para alterar o projeto original.

**Clone**: É uma cópia do projeto, geralmente feita por um desenvolvedor que tem permissão para alterar o projeto original.
## Commit Semântico

| Tipo | Descrição |
| --- | --- |
| feat | Uma nova feature |
| fix | Uma correção de bug |
| docs | Uma alteração na documentação |
| style | Uma alteração que não afeta o código (espaço em branco, formatação, etc) |
| refactor | Uma alteração no código que não corrige um bug e nem adiciona uma feature |
| perf | Uma alteração no código que melhora a performance |
| test | Uma adição de testes |
| build | Uma alteração que afeta o sistema de build ou dependências externas |
| ci | Uma alteração nos arquivos e scripts de configuração do CI |
| chore | Uma alteração que não afeta o código do projeto (log, etc) |
| revert | Reverte um commit anterior |
| env | Alterações no ambiente de desenvolvimento |



