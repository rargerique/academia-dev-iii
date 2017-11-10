# Academia

Backend relativo ao projeto de academia da disciplina de Desenvolvimento de Software III.

## Como rodar

É necessária a instalação do [Maven](https://maven.apache.org/) para subir o servidor.

1. Clone o repositório localmente
2. Rode o projeto com: `mvn spring-boot:run`
3. Acesse as APIs por default na porta 8080 `http://localhost:8080/users`

## APIs

Para acessar qualquer endpoint da API é necessário autenticação. Os endpoints são controlados com autenticação através de JSON web tokens. Para um primeiro acesso é necessário obter o web token de um usuário padrão já cadastrado no sistema, através dos seguintes passos:

1. Realizar uma chamada `POST` para a seguinte URL (admin/admin é um usuário padrão cadastrado no sistema para inicializar os registros):
`http://localhost:8080/login?nome=admin&senha=admin`

2. No retorno desta chamada é necessário salvar o token que estará no header `authorization`

3. Para qualquer nova chamada na API deve-se enviar este token no header `Authorization`

Após, pode-se cadastrar funcionários no endpoint abaixo e utilizá-los para logar. Para isso deve-se criar um usuário do tipo `funcionario`, já que um `cliente` não pode logar diretamente no sistema.

### Users

CRUD relacionado à informações de clientes e funcionários.
URL: `http://localhost:8080/users`

#### POST: 
```json
{
	"nome": "Unicornio",
	"dataNasc": "1993-03-11",
	"cpf": "03018494850",
	"endereço": "Rua Sem nome, 240",
	"estado": "RS",
	"cidade": "São Leopoldo",
	"cep": "93120450",
	"email": "unicornio@gmail.com",
	"telefone": "986675644",
	"senha": "123456",
	"tipoCadastro": "cliente",
	"restricoes": ["http://localhost:8080/restricoes/{id}"],
	"plano": "http://localhost:8080/planos/{id}"
}
```

- O campo dataNasc deve seguir o formato: yyyy-MM-dd.
- O campo tipo cadastro aceita dois valores: `funcionario` e `cliente`
- Para adicionar restrições ao cliente é necessário que as mesmas tenham sido cadastradas previamente, e deve se utilizar a URI com o ID da restrição que se quer adicionar
- Para adicionar um plano ao cliente é necessário que o mesmo tenha sido cadastrado previamente, e deve se utilizar a URI com o ID do plano que se quer adicionar

#### GET:

URL: `http://localhost:8080/users`

Retornar user especifico pelo id:

URL `http://localhost:8080/users/{id}`

Retornar user especifico pelo nome:

URL `http://localhost:8080/users/search/findByNome?nome=Unicornio`

### Restricoes

CRUD relacionado à restrições de saúde de clientes.
URL: `http://localhost:8080/restricoes`

#### POST:
```json
{
	"descricao":"asma"
}
```

A restrição deve ser registrada antes de ser adicionada ao usuário.

### GET:

URL: `http://localhost:8080/restricoes`

Retornar restricao especifica pelo id:

URL `http://localhost:8080/restricoes/{id}`

Retornar restricao especifica pelo nome:

URL `http://localhost:8080/restricoes/search/findByDescricao?nome=asma`

Retornar restricoes de um cliente especifico:

URL `http://localhost:8080/user/{id}/restricoes`

### Planos

CRUD relacionado aos planos de contrato da academia.
URL: `http://localhost:8080/planos`

#### POST:
```json
{
	"descricao": "Plano 1",
	"formaDePagamento": "anual"
}
```

O plano deve ser cadastrado antes de ser adicionado ao usuário.
O campo forma de pagamento é um enum que aceita os seguintes valores: `mensal`, `semestral`, `anual`

### GET:

URL: `http://localhost:8080/planos`

Retornar plano pelo id:

URL `http://localhost:8080/planos/{id}`

Retornar plano pela descrição:

URL `http://localhost:8080/restricoes/search/findByDescricao?descricao=Plano1`

Retornar plano de um cliente especifico:

URL `http://localhost:8080/user/{id}/plano`

### Fichas de treino

CRUD relacionado à fichas de treino dos clientes da academia.
URL: `http://localhost:8080/fichastreino`

#### POST:
```json
{
	"usuario": "http://localhost:8080/users/{id}",
	"atividades": ["http://localhost:8080/atividades/{id}]"
}
```

O usuário e as atividades relativos ao plano devem ser cadastrados antes da sua adição à ficha de treino.

### GET:

URL: `http://localhost:8080/fichastreino`

Retornar ficha de treino pelo id:

URL `http://localhost:8080/fichastreino/{id}`

Retornar ficha de treino pelo cliente:

URL `http://localhost:8080/fichastreino/search/findByUserName?nome=Unicornio`

### Atividades

CRUD relacionado às atividades da academia.
URL: `http://localhost:8080/atividades`

#### POST:
```json
{
	"descricao": "Natacao",
	"restricoes": ["http://localhost:8080/restricoes/{id}"],
	"dia": "segunda",
	"periodo": "noite"
}
```

As restrições relacionadas à atividade devem ser cadastradas antes de se criar a atividade.
O campo dia é um enum que aceita os seguintes valores: `segunda`, `terca`, `quarta`, `quinta`, `sexta`, `sabado`
O campo periodo é um enum que aceita os seguintes valores: `manha`, `tarde`, `noite`

### GET:

URL: `http://localhost:8080/atividades`

Retornar atividade pelo id:

URL `http://localhost:8080/atividades/{id}`

Retornar atividade pela descrição:

URL `http://localhost:8080/atividades/search/findByDescricao?descricao=Natacao`
