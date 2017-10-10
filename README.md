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
	"restricoes": ["http://localhost:8080/restricoes/{id}"]
}
```

- O campo dataNasc deve seguir o formato: yyyy-MM-dd.
- O campo tipo cadastro aceita dois valores: `funcionario` e `cliente`
- Para adicionar restrições ao cliente é necessário que as mesmas tenham sido cadastradas previamente, e deve se utilizar a URI com o ID da restrição que se quer adicionar

#### GET:

URL: `http://localhost:8080/users`

Retornar user especifico pelo id:

URL `http://localhost:8080/users/{id}`

Retornar user especifico pelo nome:

URL `http://localhost:8080/users/search/findByNome?nome=Unicornio`

### Restricoes

CRUS relacionado à restrições de saúde de clientes.
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

URL `http://localhost:8080/restricoes/search/findByNome?nome=asma`

Retornar restricoes de um cliente especifico:

URL `http://localhost:8080/user/{id}/restricoes`



