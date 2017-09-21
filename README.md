# Academia

Backend relativo ao projeto de academia da disciplina de Desenvolvimento de Software III.

## Como rodar

1. Clone o repositório localmente
2. Rode o projeto com: `mvn spring-boot:run`
3. Acesse as APIs por default na porta 8080 `http://localhost:8080/clientes`

## APIs

### Clientes

CRUD relacionado à informações de clientes.
URL: `http://localhost:8080/clientes`

#### POST: 
`{
	"nome": "Unicórnio",
	"dataNasc": "1993-03-11",
	"cpf": "03018494850",
	"endereço": "Rua Sem nome, 240",
	"estado": "RS",
	"cidade": "São Leopoldo",
	"cep": "93120450",
	"email": "unicornio@gmail.com",
	"telefone": "986675644",
	"senha": "123456",
	"tipoCadastro": "cliente"
}`

#### GET:

URL: `http://localhost:8080/clientes`

Retornar cliente especifico pelo id:

URL `http://localhost:8080/clientes/{id}`

Retornar cliente especifico pelo nome:

URL `http://localhost:8080/clientes?nome='Unicórnio'`
