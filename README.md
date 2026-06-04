# trabalhoFinalProgramacaoAvancada

## Sistema GIS em Java

### Descrição

Este projeto foi desenvolvido para a disciplina de Programação Avançada, com base no artigo "A Web-Based Java Framework for Cross-Platform Mobile GIS and Remote Sensing Applications".

O sistema simula um ambiente GIS (Geographic Information System), permitindo autenticação de usuários, cadastro, persistência de dados, visualização de mapas e carregamento de arquivos GIS, aplicando os principais conceitos estudados durante a disciplina.

### Funcionalidades

- Login de usuários
- Cadastro de usuários
- Listagem de usuários cadastrados
- Persistência de dados em arquivo .txt
- Visualização de mapa
- Carregamento de arquivos GIS
- Interface gráfica utilizando Swing

### Tecnologias Utilizadas

- Java
- Swing
- Programação Orientada a Objetos
- Arquitetura em Camadas
- Persistência em Arquivos
- UML

### Estrutura do Projeto

```bash
src
│
├── main
│   └── Main.java
│
├── model
│   ├── Usuario.java
│   ├── Admin.java
│   ├── Mapa.java
│   ├── ArquivoGIS.java
│   └── Sessao.java
│
├── dao
│   ├── UsuarioDAO.java
│   ├── ArquivoGISDAO.java
│   └── ConexaoArquivo.java
│
├── service
│   ├── LoginService.java
│   ├── ArquivoGISService.java
│   └── MapaService.java
│
├── view
│   ├── TelaLogin.java
│   ├── TelaPrincipal.java
│   ├── TelaCadastroUsuario.java
│   ├── TelaListaUsuarios.java
│   └── TelaMapa.java
│
├── exception
│   ├── LoginInvalidoException.java
│   └── ArquivoInvalidoException.java
│
└── interfaces
    └── Visualizavel.java
```

### Como Executar

1- Abrir o projeto na IDE.

2- Executar a classe:

```bash
Main.java
```

3- Utilizar as credenciais padrão:

```bash
Usuário: admin
Senha: 123
```

### Integrantes

- Patrick Guilherme
- Gabriel da Silva
- Matheus Nogueira

### Referência

Tsou, M. H., Guo, L., & Howser, A. A Web-Based Java Framework for Cross-Platform Mobile GIS and Remote Sensing Applications.