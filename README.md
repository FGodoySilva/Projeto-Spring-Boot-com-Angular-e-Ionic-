# Projeto-Spring-Boot-com-Angular-e-Ionic-
Projeto Spring Boot com Angular e Ionic


Esse repositório é resultado do aprendizado de um curso pela Udemy. Projeto em andamento, não finalizado 

O projeto que está em desenvolvimento terá construção de login, cadastro de usuário, fluxo completo de navegação de carrinho de compras, fluxo de fechamento de pedido, tela de perfil de usuário com envio de foto tanto pela câmera quanto pela galeria. No momento foram implementadas as classes de serviço, recursos (controller), repository e de domínio, com mapeamento objeto-relacional com JPA e foi criado a API REST com serialização JSON.

No Back-end será criado uma API Rest usando Java com Spring Boot (2.x.x) e banco de dados MySQL. Será usado JPA com Hibernate para mapeamento objeto-relacional, envio de email com SMTP da Google, armazenamento de imagens com storage S3 da Amazon, autenticação e autorização com tokens JWT, e implantação na nuvem usando a plataforma Heroku. Será aplicado: validação de dados, tratamento de exceções, uso adequado do protocolo HTTP no padrão REST, segurança, CORS, e muito mais.

Além do back end, será desenvolvido o front end utilizando Ionic. Será explorado a arquitetura MVC do Angular, os componentes visuais do Ionic, Angular reactive forms, navegação, interceptors, local storage, tratamento de erros, acesso à câmera e galeria, paginação com infinite scroll, loading e refresher. Ionic 3+ e Angular 5+.

Diagrama de Classes UML

A camada de domínio qe faz parte da camada de Modelo no MVC foi implementada com bastante recursos de Orientação a Objetos, como Herança, Composição, Agregação, Entidade Fraca, Atributo Composto, Coleções como o HashSet, Multiplicidade, Enumerações, Listas com ArrayList, Injeção de Dependências, Tratamento de Exceções... [![Imagem]

Implementação da camada de domínio

A camada de domínio foi populado no Banco de Dados a partir dos dados do diagrama abaixo, de forma que ao iniciar a aplicação os dados já são inseridos. No momento está sendo utilizado o SGBD H2, que é um banco de dados em memória e facilita os testes, mas depois será migrado para o MySQL. Essa migração não apresentará dificulades, visto que, as configurações do banco são inseridas facilmente no aruqivo de propriedades do Spring Boot e as classes, atributos e métodos do projeto OO foram mapeadas através do JPA (com implementação do Hibernate), transformando-se em entidades e colunas do banco de dados. [![Imagem]

Rodar a aplicação

Usando o Git Bash
•Navegue até o seu diretório de projetos de programação
•Faça o clone do projeto para a sua máquina local.

Atualização do Maven e compilação

Pode ser feito tanto pelo terminal quanto por uma IDE Java, a seguir as duas opções, finalizando na execução.

Através do terminal ou CMD
•Entre na raiz do projeto, pelo CMD é o seguinte comando: `cd cursomc`
•Execute o comando via CMD ou terminal: `mvn clean install`
•Execute o comando a seguir na raiz do projeto `mvn spring-boot:run`

Usando a IDE

Através do Spring Tool Suite, Eclipse com o plugin STS ou outra IDE Java:
•Depois de importar o projeto deve atualizar as dependências do Maven clicando com o botão direito no projeto, buscando a opção `Mavene clicar emUpdate Project`
•Na janela aberta selecione o projeto e clique no checkbox `Force Update of Snapshots/Releases` 
•Clique em `Ok` e aguarde
•Finalizada a atualização do Maven, deve clicar com o botão direito no projeto, buscar a opção `Run Ase clicar emSpring Boot App`

Executando no browser
•Em ambos os casos, quanto a execução do Maven no terminal ou na IDE, resultarão após a compilação do projeto na renderização no navegador através do endereço: `http://localhost:8080/` 
•Junto a algum endpoint, como: `http://localhost:8080/pedidos/1`

Endpoints dos Serviços Rest

| Endpoint | Dados | | ------ | ------ | | /categorias/{id} | Categoria e seus produtos | /clientes/{id} | Cliente, seus telefones e seus endereços | /pedidos/{id} | Pedido, seu cliente, seu pagamento, seus itens de pedido, seu endereço de entrega

Exemplo de Resultado de consulta do endpoint: /pedidos/1
{
  "id": 1,
  "instante": "30/09/2017 13:32",
  "pagamento": {
    "id": 1,
    "estado": "QUITADO",
    "numeroDeParcelas": 6
  },
  "cliente": {
    "id": 1,
    "nome": "Maria Silva",
    "email": "maria@gmail.com",
    "cpfOuCnpj": "36378912377",
    "tipo": "PESSOAFISICA",
    "endereco": [
      {
        "id": 1,
        "logradouro": "Rua Flores",
        "numero": "300",
        "complemento": "Apto 203",
        "bairro": "Jardim",
        "cep": "38220834",
        "cidade": {
          "id": 1,
          "nome": "Uberlândia",
          "estado": {
            "id": 1,
            "nome": "Minas Gerais"
          }
        }
      },
      {
        "id": 2,
        "logradouro": "Avenida Matos",
        "numero": "105",
        "complemento": "Sala 800",
        "bairro": "Centro",
        "cep": "38777012",
        "cidade": {
          "id": 2,
          "nome": "São Paulo",
          "estado": {
            "id": 2,
            "nome": "São Paulo"
          }
        }
      }
    ],
    "telefones": [
      "27363323",
      "93838393"
    ]
  },
  "enderecoDeEntrega": {
    "id": 1,
    "logradouro": "Rua Flores",
    "numero": "300",
    "complemento": "Apto 203",
    "bairro": "Jardim",
    "cep": "38220834",
    "cidade": {
      "id": 1,
      "nome": "Uberlândia",
      "estado": {
        "id": 1,
        "nome": "Minas Gerais"
      }
    }
  },
  "itens": [
    {
      "desconto": 0.0,
      "quantidade": 1,
      "preco": 2000.0,
      "produto": {
        "id": 1,
        "nome": "Computador",
        "preco": 2000.0
      }
    },
    {
      "desconto": 0.0,
      "quantidade": 2,
      "preco": 80.0,
      "produto": {
        "id": 3,
        "nome": "Mouse",
        "preco": 80.0
      }
    }
  ]
}



![dados_populados](https://user-images.githubusercontent.com/86478813/126151505-1b0ae4bc-736b-49e3-8dd0-9e29b4ad7cbe.png)
![diagrama_classes](https://user-images.githubusercontent.com/86478813/126151525-c1d41680-d9ec-4c52-b34a-cba2f8baa782.png)
![enumeracoes](https://user-images.githubusercontent.com/86478813/126151539-ab3b8694-a129-48eb-a351-ac301a119e51.png)

