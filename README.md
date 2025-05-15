# 📚 Voll.Med API

Uma API REST desenvolvida em Java 17 com Spring Boot para gestão de médicos e pacientes em um sistema de saúde.

## 🚀 Funcionalidades

### Médicos
- Cadastro de médicos com informações completas
- Listagem de médicos ativos
- Atualização de dados médicos
- Exclusão lógica (desativação)
- Busca por especialidade

### Pacientes
- Cadastro de pacientes
- Listagem de pacientes ativos
- Atualização de dados
- Exclusão lógica
- Histórico médico

## 🔧 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate Validator**
- **Lombok**
- **Banco de dados**: H2 (desenvolvimento) / PostgreSQL (produção)
- **Documentação**: Swagger/OpenAPI
- **Testes**: JUnit 5, Mockito

## 📌 Requisitos

- JDK 17+
- Maven 3.6+
- Docker (opcional para banco de dados)

## 🛠️ Configuração do Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/voll.med-api.git
```
## 📄 Documentação da API

Acesse a documentação Swagger após iniciar a aplicação: http://localhost:8080/swagger-ui.html


## 🧪 Testes

Execute os testes com:
```bash
mvn test