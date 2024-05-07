
# projeto-integrador-condominio-api

Esta API permite a gestão de avisos para condomínios.

Base URL
```https://mural-avisos-condominio-api-7ac88d72637c.herokuapp.com```



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

