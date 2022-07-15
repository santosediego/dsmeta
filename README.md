# DSMeta

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/santosediego/dsmeta/blob/main/LICENSE) 
[![Netlify Status](https://api.netlify.com/api/v1/badges/740ffab2-0f1a-4c0e-a53d-7c3b7720afb4/deploy-status)](https://app.netlify.com/sites/dsmetadiegosantos/deploys)

## Sobre o projeto

[dsmetadiegosantos.netlify.app](https://dsmetadiegosantos.netlify.app/)

DSMeta é uma aplicação web construída durante o evento Semana Spring React da [Devsuperior](https://github.com/devsuperior). A aplicação
consiste em uma listagem de vendedores com filtragem de data de venda, é possível o envio de notificação SMS para o vendedor selecionado,
função de SMS integrada ao serviço da Twilio.

## Layout
<section align="center">
  <img src="https://github.com/santosediego/assets/blob/main/dsmeta/dsmetaDesktop.png" width="625" alt="Web desktop">
  <img src="https://github.com/santosediego/assets/blob/main/dsmeta/dsmetaMobile.jpg" width="250" alt="Web responsive">
</section>

## Tecnologias utilizadas
### Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Twilio
### Front end
- HTML / CSS / JS / TypeScript
- ReactJS
- React-toastify
- Axios


## Implantação em produção
- Back end: Heroku
- Front end: Netlify
- Banco de dados: H2

## Como executar o projeto

### Back end
Pré-requisitos:
- Java 17
- Uma conta na [Twilio](https://www.twilio.com/pt-br/)
- Definir variáveis de ambiente:
  - TWILIO_SID
  - TWILIO_KEY
  - TWILIO_PHONE_FROM
  - TWILIO_PHONE_TO

```bash
# clonar repositório
git clone https://github.com/santosediego/dsmeta.git

# entrar na pasta do projeto back end
cd dsmeta/backend/

# executar o projeto (sem as váriaveis de ambiente a aplicação não rodará)
./mvnw spring-boot:run
```

### Front end
Pré-requisito: npm / yarn

```bash
# clonar repositório
git clone https://github.com/santosediego/dsmeta.git

# entrar na pasta do projeto front end web
cd dsmeta/frontend/

# instalar dependências
yarn

# executar o projeto
yarn dev
```

## Autor

[Diego Santos](https://www.linkedin.com/in/santosediego/ "Perfil Linkedin Diego Santos")
