# LABORATORIO 3 - TDD
TALLER 3
Testing - TDD
PRE-RREQUISITOS
Java OpenJDK Runtime Environment: 17.x.x
Apache Maven: 3.9.x
JUnit: 5.x.x
Docker

## OBJETIVOS
Como hacer pruebas unitarias.
Utilizar anotaciones @Test del framework JUnit
Aplicar TDD.
## DESCRIPCIÓN PROYECTO
El proyecto consiste en un sistema de gestión de bibliotecas, donde hay clases que representan Libro, Usuario, Prestamo, y Biblioteca. Los usuarios pueden tomar prestados libros de la biblioteca, y la Biblioteca se encarga de gestionar los préstamos, asegurarse de que los libros estén disponibles, y mantener un registro de los libros prestados.

## CREAR PROYECTO CON MAVEN

![image](Assets/CreaciónProyecto.png)

## AGREGAR DEPENDENCIA JUNIT5

Buscar en maven central la dependencia de JUnit5 en su versión más reciente.


Edite el archivo pom.xml del proyecto para agregar la dependencia.


Verifique que la versión de java sea la 17

![image](Assets/Dependencias.png)
![image](Assets/mvnVersion.png)

## AGREGAR ESQUELETO DEL PROYECTO
Cree los siguientes paquetes dentro de edu.eci.cvds.tdd

library
book
loan
user
![image](Assets/tree.png)

## AGREGAR CLASES
