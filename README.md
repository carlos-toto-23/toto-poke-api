# Repositorio Poke API REST JAVA by carlos ortega (toto)

*Este repositorio se creo como practica para desarrolar una API Rest consumiendo un API externa PokeAPI si quieres ver mas información sobre la pokeApi da clic [Aquí](https://pokeapi.co/ "Aquí")*

## Tecnologías usadas 
*Este Proyecto fue desarrollado con java versión 1.8 y con Srpring boot*
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.1/reference/htmlsingle/#boot-features-developing-web-applications)

## Endpoints
*esta API cuenta con  6 endpoints solo para fines de practica tendras que levantar la aplicación por defecto corre en el puerto 8090 de tu maquina*
#### Swgger Endpoint
**Este enpoint nos ayudo a documentar todos los endpoints en esta API REST y sus parametros para que funcione así como las respuestas obtenida de ejecutar dicha petición**

- para ver la lista de los endpoints solo debes visitar https://totopokeapi.herokuapp.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/

#### pokemon Endpoints
**Estos endpoints nos muestran la información de un pokemon por id o nombre y regresa un Json con los datos obtenidos**
-  metodo GET ruta: https://totopokeapi.herokuapp.com/pokemon/{id}
 - ejemplo: https://totopokeapi.herokuapp.com/pokemon/132
- metodo GET ruta: https://totopokeapi.herokuapp.com/pokemon/name/{name}
 - ejemplo https://totopokeapi.herokuapp.com/pokemon/name/ditto

#### Berry Endpoints
**Estos endpoints nos muestran los detalles de las bayas se puede obtener por id o por nombre y regresa un Json con los datos obtenidos**
- metodo GET ruta:  https://totopokeapi.herokuapp.com/berry/{id}
 - ejemplo  https://totopokeapi.herokuapp.com/berry/1
-  metodo GET ruta:  https://totopokeapi.herokuapp.com/berry/name/{name}
 - ejemplo metodo GET ruta:  https://totopokeapi.herokuapp.com/berry/name/chesto

#### Berry Firmness
**Estos endpoints nos muestran la infomación de la dureza de una baya podremos obtener dicha información por id o por nombre**
- metodo GET ruta:  https://totopokeapi.herokuapp.com/berry-firmness/{id}
 - ejemplo  https://totopokeapi.herokuapp.com/berry-firmness/1
- metodo GET ruta:  https://totopokeapi.herokuapp.com/berry-firmness/name/{name}
 - ejemplo https://totopokeapi.herokuapp.com/berry-firmness/name/cheri

####  Mas Documentación, pruebas etc.
**se generó un archivo de documentación donde se establecen los puntos principales de esta practica, las tecnologias utilizadas y las pruebas tanto locales como en Heroku para mas informacion dar clic [aquí](https://drive.google.com/file/d/1hqeeHjxt8Vjy43y4-9MWOKSIvWFN0UYs/view?usp=sharing "aquí")**
