##  AREP - PARCIAL 2

## Introducción

#### Descripción 
Diseñé, construya y despliegue los siguientes servicios en un microcontenedor docker desplegado en una instancei a EC2 de AWS. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista. Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una prámetro sde tipo "Double".

  

0. log

1. ln

2. sin

3. cos

4. tan

5. acos

6. asin

7. atan

8. sqrt

9. exp (el número de eauler elevado ala potendia del parámetro)

  

  

Implemente los servicios para responder al método de solicitud HTTP GET. Deben usar el nombre de la función especificado en la lista y el parámetro debe ser pasado en la variable de query con nombre "value".

  

  

Ejemplo de una llamado:

  

[https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592](https://amazonxxx.x.xxx.x.xxx:{port}/cos?value=3.141592)


#### Resumen
Realizar una aplicación que de un servicio que pueda resolver 2 funciones en este caso será atan y acos. Esta aplicacion estara deplegada en en docker con el servicio de [AWS ECS](https://aws.amazon.com/es/ec2/?ec2-whats-new.sort-by=item.additionalFields.postDateTime&ec2-whats-new.sort-order=desc)



## Intruciones de uso local

#### Pre requisitos

* [GIT](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalación-de-Git)
* [JAVA 8](https://www.java.com/es/download/)
* [MAVEN](https://maven.apache.org)
* [DOCKER](https://www.docker.com/)
* [DOCKER COMPOSE](https://docs.docker.com/compose/install/)



#### Complicación

Genere copia local del repositorio puede ejecutar la siguiente línea en la consola de comandos.

    git clone https://github.com/DamGaFlo/AREP-Parcial2

Primero es necesario usar el siguiente comando en estos proyectos:
```
mvn clean install
```
Para ejecutar el proyecto usamos Maven en el directorio raiz de cada proyecto proyecto  usando el siguiente comando.
```
mvn package
mvn compile
```

## Despliegue local

####  Creación de imágenes
Para esto usaremos los archivos Dockerfile creados y ubicados en el directorio raíz, usaremos los siguientes comando en la raíz respectiva.
```
docker build --tag calculadora.

```
#### Creacion de contenedores
```
docker run -d -p 34000:6000 --network lognet --name calculadora calculadora 

```
### Despliegue con docker compose
Para este proyecto también crearemos un docker-compose y basta con ubicarse en la raiz del archivo y ejecutar el comando.
```
docker-compose up -d
```


#### Prueba local

Aca podremos ver la respuesta del objeto JSON desde el local 

![localhost](/img/local.png)

## AWS y Docker

para esto debemos crear una maquina virtual en AWS en este caso usamos el servicio EC2 una vez creada debemos prepararla descargando Docker.
Para obtener las imágenes las bajamos desde el [repositorio](https://hub.docker.com/r/damgaflo/calculadora) en dockerHub en este caso usaremos el comando

```
docker pull damgaflo/calculadora

``` 
y con la imagen descargada basta con ejecutarla con el comando.

```
docker run -d -p 42000:6000 --name calculadora damgaflo/calculadora:latest
```

#### Pruebas AWS

Aca podemos ver el funcionamiento del servicio
![input](/img/funcionamiento.png)


### Video

[![Evidencia](https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/YouTube_full-color_icon_%282017%29.svg/71px-YouTube_full-color_icon_%282017%29.svg.png)](https://www.youtube.com/watch?v=8MCuglESuhY&ab_channel=damiangarridoflorez)

## Autor
[Johan Damian Garrido Florez](https://github.com/DamGaFlo)
## Derechos de Autor
**©** _Johan Damian Garrido Florez, Escuela Colombiana de Ingeniería Julio Garavito._
## Licencia
Licencia bajo  GNU General Public License