# API RESTful
API RESTful que nos permite gerenciar as informações das propriedades dos países (identificador – gerado automaticamente, nome, capital, região, sub-região, área).

Possível criar um novo país a partir da API criada com todas as suas propriedades;
Possível listar todos os países anteriormente criados;
Possível modificar os dados de um país anteriormente criado;
Possível eliminar um país anteriormente criado;
Possível ordenar a lista dos países por qualquer uma das suas propriedades.

# Tecnologias utilizadas
API desenvolvida em Java 17 usando Spring Boot Framework no Intelij Community
API criada usando a ferramenta de gestao de dependencias Maven
Utillzou-se a base de dados H2 para guardar as informacoes
Inicializacao da base de dados se encontra no  arquivo https://github.com/LGYx2/LGYx2.github.io/blob/main/countriesapi/src/main/resources/data.sql
Testado no Advanced REST client com todas instrucoes funcionando

# Acesso e Teste
Ficheiros de Controle, Modelo, Servico e Repositorio se encontram no diretorio https://github.com/LGYx2/LGYx2.github.io/tree/main/countriesapi/src/main/java/org/devchallenge/countriesapi
Para criacao de um novo pais: http://localhost:8083/countries (Metodo POST)
Para listar paises: http://localhost:8083/countries (Metodo GET)
Para modificar os dados de um país anteriormente criado: http://localhost:8083/countries/{id} (Metodo PUT)
Para eliminar um país anteriormente criado: http://localhost:8083/countries/{id} (Metodo DELETE)
Para ordenar a lista dos países por qualquer uma das suas propriedades: http://localhost:8083/countries/getBy(nome da propriedade) (Metodo Get)

 
