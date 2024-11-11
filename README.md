
# projeto-integrador-condominio-api

Esta API permite a gestão de avisos para condomínios.

Base URL
```https://mural-avisos-condominio-api-ebaa5089fa03.herokuapp.com```



# Endpoints

## USUARIOS

### GetAll 

Este endpoint retorna todos os usuarios cadastrados no sistema.

- URL: /usuarios
- Método HTTP: GET
- Requisição: Não requer parâmetros adicionais.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "CPF": "123.456.789-00",
    "nome_usuario": "fulano_de_tal",
    "bloco": "A",
    "apto": "11",
    "telefone": "(00) 1234-5678",
    "email": "fulano@example.com",
    "perfil": "Usuário",
    "status_usuario": true,
    "senha": "senha123"
  },
  {
    "id": 2,
    "data_hora_registro": "2024-04-28T13:34:02.000+00:00",
    "CPF": "12345678911",
    "nome_usuario": "Adriano Pereira",
    "bloco": "32",
    "apto": "06",
    "telefone": "11999996666",
    "email": "pereira@arvore.com",
    "perfil": "MORADOR",
    "status_usuario": true,
    "senha": "FGHIJL"
  },
  // Outros usuarios...
]
```

### GetByID 

Este endpoint retorna um usuario igual ao ID passado, cadastrados no sistema.

- URL: /usuarios/{id}
- Método HTTP: GET
- Requisição: substituir o {id} pelo numero do ID que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /usuarios/2:

```
[
  {
    "id": 2,
    "data_hora_registro": "2024-04-28T13:34:02.000+00:00",
    "CPF": "12345678911",
    "nome_usuario": "Adriano Pereira",
    "bloco": "32",
    "apto": "06",
    "telefone": "11999996666",
    "email": "pereira@arvore.com",
    "perfil": "MORADOR",
    "status_usuario": true,
    "senha": "FGHIJL"
  }
]
```

### GetByEmail 

Este endpoint retorna um usuario igual ao Email passado, cadastrados no sistema.

- URL: /usuarios/email/{email}
- Método HTTP: GET
- Requisição: substituir o {email} pelo email que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /usuarios/email/pereira@arvore.com:

```
[
  {
    "id": 2,
    "data_hora_registro": "2024-04-28T13:34:02.000+00:00",
    "CPF": "12345678911",
    "nome_usuario": "Adriano Pereira",
    "bloco": "32",
    "apto": "06",
    "telefone": "11999996666",
    "email": "pereira@arvore.com",
    "perfil": "MORADOR",
    "status_usuario": true,
    "senha": "FGHIJL"
  }
]
```


### Create 

Este endpoint cria um usuario no sistema e retorna os dados cadastrados.

- URL: /usuarios
- Método HTTP: POST
- Requisição: enviar um BODY objeto JSON com os dados do usuario para cadastrar (não enviar campo ID), exemplo:
```
[
  {
    "data_hora_registro": "2024-04-28T13:34:02.000+00:00",
    "CPF": "12345678911",
    "nome_usuario": "Testetese",
    "bloco": "10",
    "apto": "05",
    "telefone": "11999996666",
    "email": "teste@gmail.com",
    "perfil": "MORADOR",
    "status_usuario": true,
    "senha": "aaabbbccc"
  }
]
```
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 4,
    "data_hora_registro": "2024-04-28T13:34:02.000+00:00",
    "CPF": "12345678911",
    "nome_usuario": "Testetese",
    "bloco": "10",
    "apto": "05",
    "telefone": "11999996666",
    "email": "teste@gmail.com",
    "perfil": "MORADOR",
    "status_usuario": true,
    "senha": "aaabbbccc"
  }
]
```



## PROBLEMA ELEVADORES

### GetAll 

Este endpoint retorna todos os problemas de elevadores cadastrados no sistema.

- URL: /problemas-elevadores
- Método HTTP: GET
- Requisição: Não requer parâmetros adicionais.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 1,
    "usuario_id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "bloco": "A",
    "andar": 5,
    "tipo_elevador": "Social",
    "descricao_problema": "O elevador está fazendo barulhos estranhos",
    "problema_solucionado": false,
    "exibir": true
  },
    {
    "id": 2,
    "usuario_id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "bloco": "A",
    "andar": 5,
    "tipo_elevador": "Social",
    "descricao_problema": "O elevador está fazendo barulhos estranhos",
    "problema_solucionado": false,
    "exibir": true
  },
  // Outros problemas de elevadores...
]
```

### GetByID 

Este endpoint retorna um problema de elevador igual ao ID passado, cadastrados no sistema.

- URL: /problemas-elevadores/{id}
- Método HTTP: GET
- Requisição: substituir o {id} pelo numero do ID que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /problemas-elevadores/1:

```
[
  {
    "id": 1,
    "usuario_id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "bloco": "A",
    "andar": 5,
    "tipo_elevador": "Social",
    "descricao_problema": "O elevador está fazendo barulhos estranhos",
    "problema_solucionado": false,
    "exibir": true
  }
]
```

### Create 

Este endpoint cria um problema de elevador no sistema e retorna os dados cadastrados.

- URL: /problemas-elevadores
- Método HTTP: POST
- Requisição: enviar um BODY objeto JSON com os dados do problema de elevador para cadastrar (não enviar campo ID), exemplo:
```
[
  {
    "usuario_id": 2,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "bloco": "B",
    "andar": 3,
    "tipo_elevador": "Social",
    "descricao_problema": "O elevador está fazendo barulhos",
    "problema_solucionado": false,
    "exibir": true
  }
]
```
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 2,
    "usuario_id": 2,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "bloco": "B",
    "andar": 3,
    "tipo_elevador": "Social",
    "descricao_problema": "O elevador está fazendo barulhos",
    "problema_solucionado": false,
    "exibir": true
  }
]
```





## MENSAGENS

### GetAll 

Este endpoint retorna todos as mensagens cadastrados no sistema.

- URL: /mensagens
- Método HTTP: GET
- Requisição: Não requer parâmetros adicionais.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "assunto": "Assunto da mensagem",
    "mensagem": "Conteúdo da mensagem",
    "usuario_id": 1,
    "exibir": true
  },
  {
    "id": 2,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "assunto": "pets",
    "mensagem": "quero ter um gato e é proibido",
    "usuario_id": 3,
    "exibir": true
  },
  // Outras mensagens...
]
```

### GetByID 

Este endpoint retorna uma mensagem igual ao ID passado, cadastrados no sistema.

- URL: /mensagens/{id}
- Método HTTP: GET
- Requisição: substituir o {id} pelo numero do ID que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /mensagens/1:

```
[
  {
    "id": 1,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "assunto": "Assunto da mensagem",
    "mensagem": "Conteúdo da mensagem",
    "usuario_id": 1,
    "exibir": true
  }
]
```

### Create 

Este endpoint cria uma mensagem no sistema e retorna os dados cadastrados.

- URL: /mensagens
- Método HTTP: POST
- Requisição: enviar um BODY objeto JSON com os dados da mensagem para cadastrar (não enviar campo ID), exemplo:
```
[
  {
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "assunto": "pets",
    "mensagem": "quero ter um gato e é proibido",
    "usuario_id": 3,
    "exibir": true
  }
```
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 2,
    "data_hora_registro": "2024-05-06T10:15:30.000+00:00",
    "assunto": "pets",
    "mensagem": "quero ter um gato e é proibido",
    "usuario_id": 3,
    "exibir": true
  }
]
```




## EXEMPLARES

### GetAll 

Este endpoint retorna todos os exemplares cadastrados no sistema.

- URL: /exemplares
- Método HTTP: GET
- Requisição: Não requer parâmetros adicionais.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 1,
    "titulo": "The Fellowship of the Ring",
    "autor": "J. R. R. Tokien",
    "anoEdicao": 2000,
    "numPaginas": 699,
    "resumo": "Primeira parte da jornada da sociedade do Anel",
    "editora": "Editora que editou",
    "assuntoTema": "O começo da distribuição do anel",
    "lingua": "Inglês",
    "qtdEmprestimos": 0,
    "emprestado": false
  },
  {
    "id": 2,
    "titulo": "Java Programming Fundamentals",
    "autor": "John Doe",
    "anoEdicao": 2022,
    "numPaginas": 450,
    "resumo": "Este livro cobre os fundamentos de programação em Java, abordando desde o básico até conceitos avançados.",
    "editora": "Editora Exemplo",
    "assuntoTema": "Programação",
    "lingua": "Português",
    "qtdEmprestimos": 5,
    "emprestado": false
  },
  // Outros exemplares...
]
```

### GetByID 

Este endpoint retorna um exemplar igual ao ID passado, cadastrados no sistema.

- URL: /exemplar/{id}
- Método HTTP: GET
- Requisição: substituir o {id} pelo numero do ID que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /exemplar/1:

```
{
  "id": 1,
  "titulo": "The Fellowship of the Ring",
  "autor": "J. R. R. Tokien",
  "anoEdicao": 2000,
  "numPaginas": 699,
  "resumo": "Primeira parte da jornada da sociedade do Anel",
  "editora": "Editora que editou",
  "assuntoTema": "O começo da distribuição do anel",
  "lingua": "Inglês",
  "qtdEmprestimos": 0,
  "emprestado": false
}
```

### Create 

Este endpoint cria um exemplar no sistema e retorna os dados cadastrados.

- URL: /exemplar
- Método HTTP: POST
- Requisição: enviar um BODY objeto JSON com os dados do exemplar para cadastrar (não enviar campo ID), exemplo:
```
{
    "titulo": "História da Arte",
    "autor": "Carlos Souza",
    "anoEdicao": 2019,
    "numPaginas": 280,
    "resumo": "Explora a evolução da arte através dos séculos, abordando desde o período renascentista até a arte contemporânea.",
    "editora": "Editora Cultural",
    "assuntoTema": "Arte",
    "lingua": "Português",
    "qtdEmprestimos": 7,
    "emprestado": false
}
```
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
{
  "id": 6,
  "titulo": "História da Arte",
  "autor": "Carlos Souza",
  "anoEdicao": 2019,
  "numPaginas": 280,
  "resumo": "Explora a evolução da arte através dos séculos, abordando desde o período renascentista até a arte contemporânea.",
  "editora": "Editora Cultural",
  "assuntoTema": "Arte",
  "lingua": "Português",
  "qtdEmprestimos": 7,
  "emprestado": false
}
```





## EMPRESTIMOS

### GetAll 

Este endpoint retorna todos os emprestimos cadastrados no sistema.

- URL: /emprestimos
- Método HTTP: GET
- Requisição: Não requer parâmetros adicionais.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
[
  {
    "id": 1,
    "dataEntrega": "2024-11-17T14:00:00",
    "diasFaltantes": 6,
    "dataEmprestimo": "2024-11-10T14:00:00",
    "usuario_id": 2,
    "exemplar_id": 1
  },
  {
    "id": 2,
    "dataEntrega": "2024-11-30T14:00:00",
    "diasFaltantes": 19,
    "dataEmprestimo": "2024-11-10T14:00:00",
    "usuario_id": 2,
    "exemplar_id": 1
  },
  // Outras mensagens...
]
```

### GetByID 

Este endpoint retorna um emprestimo igual ao ID passado, cadastrados no sistema.

- URL: /emprestimos/{id}
- Método HTTP: GET
- Requisição: substituir o {id} pelo numero do ID que se quer.
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta se mandar: /mensagens/1:

```
{
  "id": 2,
  "diasFaltantes": 19,
  "dataEmprestimo": "2024-11-10T17:00:00",
  "dataEntrega": "2024-11-30T17:00:00",
  "usuario_id": 2,
  "exemplar_id": 1
}
```

### Create 

Este endpoint cria um emprestimo no sistema e retorna os dados cadastrados.

- URL: /emprestimos
- Método HTTP: POST
- Requisição: enviar um BODY objeto JSON com os dados d0 emprestimo para cadastrar (não enviar campo ID), exemplo:
```
{
    "usuario_id": 2,
    "exemplar_id": 1,
    "dataEmprestimo": "2023-11-10T14:00:00",
    "dataEntrega": "2023-11-17T14:00:00"
}

```
- Resposta de Sucesso: Código 200 OK

- Exemplo de Corpo da Resposta:

```
{
  "id": 5,
  "diasFaltantes": 0,
  "dataEmprestimo": "2023-11-10T14:00:00",
  "dataEntrega": "2023-11-17T14:00:00",
  "usuario_id": 2,
  "exemplar_id": 1
}
```
*OBS: o campo diasFaltantes sempre virá zerado neste endpoint pois ele só tem este calculo quando é um GET.


