# API Cursos

API desenvolvida em Java com Spring Boot para gerenciamento de cursos.

---

## Fluxo cliente e servidor

Quando um cliente consulta o endpoint `GET /cursos`, acontece um fluxo de comunicação entre o cliente e o servidor.

O **cliente** é quem faz a solicitação para a API. Ele pode ser um navegador, Postman ou outro sistema que consuma a API.

O cliente envia uma **requisição HTTP (request)** utilizando o método `GET` para solicitar os cursos cadastrados.

O **servidor (back-end)** recebe essa requisição e realiza o processamento necessário. No projeto, o `CursoController` recebe a requisição e encaminha a solicitação para o `CursoService`, que utiliza o `CursoRepository` para buscar os cursos.

Depois do processamento, o servidor envia uma **resposta HTTP (response)** para o cliente contendo os cursos cadastrados.

O fluxo completo é:

**Cliente → Requisição HTTP → Back-end → Processamento → Resposta HTTP → Cliente**

Exemplo:

```text
Cliente
   ↓
GET /cursos
   ↓
Requisição HTTP (Request)
   ↓
CursoController
   ↓
CursoService
   ↓
CursoRepository
   ↓
Processamento
   ↓
Resposta HTTP (Response)
   ↓
Cliente