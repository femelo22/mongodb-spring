<h2>Rest API - SBOOT + MongoDB</h2>

<p>Este projeto é uma API Rest desenvolvida utilizando Spring Boot e MongoDB, que oferece funcionalidades de criar, obter por e-mail e listar todos os estudantes.</p>

<img width="50%" src="https://github.com/femelo22/mongodb-spring/blob/main/img/sboot%2Bmongodb.png" />

 <h2>Pré-requisitos</h2>
<p>Para executar esta API em sua máquina, você precisará ter instalado:</p>
<ul>
    <li>Java JDK</li>
    <li>Maven</li>
    <li>MongoDB</li>
</ul>

<h2>Executando a API Localmente</h2>

<h3>Passo 1: Clonar o Projeto</h3>
<p>Clone este repositório para sua máquina local utilizando o Git:</p>
<pre>
    https://github.com/femelo22/mongodb-spring
</pre>

<h3>Passo 2: Abrir no IDE</h3>
<p>Abra o projeto clonado em seu ambiente de desenvolvimento integrado (IDE), como IntelliJ IDEA, Eclipse ou NetBeans.</p>

<h3>Passo 3: Configurar JDK</h3>
<p>Configure o JDK (Java Development Kit) em seu IDE, se ainda não estiver configurado. Certifique-se de que o JDK esteja instalado em sua máquina.</p>

<h3>Passo 4: Rodar o Projeto</h3>
<p>Execute o projeto a partir do IDE. Certifique-se de que o servidor embutido do Spring Boot e o MongoDB estejam configurados e em execução. O Spring Boot iniciará o servidor na porta padrão 8080.</p>


<h2>Testando a API (Sandbox)</h2>
<p>Você pode testar as funcionalidades da API utilizando ferramentas como Postman, Insomnia, ou simplesmente utilizando o navegador.</p>

<h3>1. Criar um novo estudante</h3>
<p>Envie uma requisição POST para a rota <strong>/students</strong> com o payload do estudante no corpo da requisição.</p>
<pre>
    <strong>POST</strong> /students
    Content-Type: application/json

    {
        "firstName": "Luiz Fernando",
        "lastName": "Melo Gonçalves",
        "email": "luiz123jfmg@gmail.com",
        "gender": "MALE",
        "address": {
            "country": "Brasil",
            "city": "Juiz de Fora",
            "postCode": "36025190"
        },
        "favouriteSubjects": [
            "Matemática",
            "Lógica"
        ],
        "totalSpentInBooks": 350.00
    }
</pre>
<h3>2. Obter informações de um estudante por e-mail</h3>
<p>Envie uma requisição GET para a rota <strong>/students/{email}</strong> substituindo <em>{email}</em> pelo e-mail do estudante desejado.</p>
<pre>
    <strong>GET</strong> /students/luiz12345jfmg@gmail.com

    {
        "id": "6612f00070ef883f48c8627f",
        "firstName": "Luiz Fernando",
        "lastName": "Melo Gonçalves",
        "email": "luiz123jfmg@gmail.com",
        "gender": "MALE",
        "address": {
            "country": "Brasil",
            "city": "Juiz de Fora",
            "postCode": "36025190"
        },
        "favouriteSubjects": [
            "Matemática",
            "Lógica"
        ],
        "totalSpentInBooks": 350.00
    }
</pre>

<h3>3. Listar todos os estudantes cadastrados</h3>
<p>Envie uma requisição GET para a rota <strong>/students</strong>.</p>
<pre>
    <strong>GET</strong> /students

      [
        {
          "id": "6612f00070ef883f48c8627f",
          "firstName": "Luiz Fernando",
          "lastName": "Melo Gonçalves",
          "email": "luiz123jfmg@gmail.com",
          "gender": "MALE",
          "address": {
              "country": "Brasil",
              "city": "Juiz de Fora",
              "postCode": "36025190"
          },
          "favouriteSubjects": [
              "Matemática",
              "Lógica"
          ],
          "totalSpentInBooks": 350.00
      }
    ]
</pre>
