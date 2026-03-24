# Exercício 10: Gerenciamento de Tarefas

## Enunciado
Implemente uma aplicação Spring Boot para gerenciar tarefas. O objetivo é praticar mapeamento JPA com tipos de data e booleanos, e operações CRUD.

## Entidade: Tarefa
| Atributo       | Tipo      | Descrição                                         |
|:---------------|:----------|:--------------------------------------------------|
| id             | Long      | Identificador único (chave primária, auto-gerado) |
| descricao      | String    | Descrição da tarefa                               |
| dataVencimento | LocalDate | Data de vencimento da tarefa                      |
| concluida      | Boolean   | Status de conclusão da tarefa                     |
## Requisitos
1. Crie uma entidade JPA chamada Tarefa com os atributos especificados
2. Configure o nome da entidade JPA como Tarefa
3. Configure o nome da tabela no banco como tb_tarefa
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /tarefas — criar nova tarefa
* GET /tarefas — listar todas as tarefas
* GET /tarefas/{id} — buscar tarefa por ID
* DELETE /tarefas/{id} — deletar tarefa por ID

## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas