# RESTful API
RESTful API that allows us to manage country property information (identifier – automatically generated, name, capital, region, sub-region, area).

* Possible to create a new country from the created API with all its properties;
* Possible to list all previously created countries;
* Possible to modify the data of a previously created country;
* Possible to delete a previously created country;
* Possible to sort the list of countries by any of their properties.

# Technologies used
* API developed in Java 17 using Spring Boot Framework on Intelij Community
* API created using Maven dependency management tool
* The H2 database was used to store the information, to access the console: http://localhost:8083/h2-console
* Database initialization can be found in the file https://github.com/LGYx2/LGYx2.github.io/blob/main/countriesapi/src/main/resources/data.sql
* Tested on Advanced REST client with all instructions working

# Access and Test
* Control, Model, Service and Repository files are located in the directory https://github.com/LGYx2/LGYx2.github.io/tree/main/countriesapi/src/main/java/org/devchallenge/countriesapi
* To create a new country: http://localhost:8083/countries (POST method)
* To list countries: http://localhost:8083/countries (GET method)
* To modify the data of a previously created country: http://localhost:8083/countries/{id} (PUT method)
* To delete a previously created country: http://localhost:8083/countries/{id} (DELETE method)
* To sort the list of countries by any of their properties: http://localhost:8083/countries/getBy(property name) (Get Method)



 
