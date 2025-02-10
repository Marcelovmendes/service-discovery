# Service Discovery com Spring Cloud Gateway e Eureka

Este repositório contém um exemplo prático de implementação de **Service Discovery** utilizando **Eureka Server** e **Spring Cloud Gateway** para roteamento dinâmico de microsserviços.

Artigo mais detalhado sobre o projeto [aqui](https://dev.to/marcelovmendes/criando-service-discovery-com-spring-cloud-gateway-e-eureka-158h)
## 🛠 Tecnologias Utilizadas
- Java 21
- Spring Boot
- Spring Cloud Gateway
- Spring Cloud Netflix Eureka (Server e Client)

## 📌 Estrutura do Projeto

```bash
📂 SERVICE-DISCOVERY
├── 📂 service-discovery      # Servidor Eureka
├── 📂 api-01              # Serviço cliente 1
├── 📂 api-02              # Serviço cliente 2
├── 📂 gateway       # API Gateway
└── README.md
```

## 🚀 Como Rodar o Projeto Localmente

### Pré-requisitos
Certifique-se de ter instalado:
- [Java 21](https://sdkman.io/usage/)
- [Maven](https://maven.apache.org/)

### 1️⃣ Clonar o Repositório
```bash
git clone https://github.com/Marcelovmendes/service-discovery
cd SERVICE-DISCOVERY
```

### 2️⃣ Rodar o Eureka Server
```bash
cd service-discovery
./mvnw spring-boot:run
```
Acesse [http://localhost:8761](http://localhost:8761) para visualizar o Eureka Server.

### 3️⃣ Rodar as APIs Cliente (api-01 e api-02)
Abra dois terminais diferentes e execute:
```bash
# Rodando api-01
cd ../api-01
./mvnw spring-boot:run
```
```bash
# Rodando api-02
cd ../api-02
./mvnw spring-boot:run
```
Após isso, as APIs serão registradas no Eureka automaticamente.

### 4️⃣ Rodar o API Gateway
```bash
cd ../api-gateway
./mvnw spring-boot:run
```
Agora, o Gateway estará disponível em [http://localhost:8080](http://localhost:8080).

### 5️⃣ Testando as Rotas
```bash
# Testando API-01
curl http://localhost:8080/api-01/api/health

# Testando API-02
curl http://localhost:8080/api-02/api/health
```
Ambos devem retornar a mensagem `API está saudável!`.


## 🎯 Objetivo do Projeto
Este projeto demonstra como utilizar **Eureka Server** para **Service Discovery**, permitindo que o **Spring Cloud Gateway** roteie requisições dinamicamente, sem necessidade de configuração manual de endpoints.


