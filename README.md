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

Payload for post: 
`{
	"nome": "Unicórnio"
}`
