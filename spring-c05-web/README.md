
# Spring Web

1. Crear **proyecto** [aquí](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.2&packaging=jar&jvmVersion=19&groupId=com.example&artifactId=spring-c05-web&name=spring-c05-web&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example&dependencies=data-jpa,mysql,lombok,web,devtools,thymeleaf): 
	* Spring Data JPA
	* MySQL
	* Lombok
	* Spring Web
	* Spring Boot Devtools
	* Thymeleaf
2. Rellenar **application.properties** con la configuración de MySQL
3. Arrancar MySQL, debe estar en Ejecución
4. Crear **paquete** controller
5. Dentro de paquete controller crear una **clase java HelloController**
	1. ``@Controller``
	2. ``@GetMapping("hello")``
6. Crear un archivo **HTML** en **src/main/resources/templates**, por ejemplo hello.html
7. Ejecutar método **main**
8. Comprobar que en la consola aparece la línea ``Tomcat started on port(s): 8080 (http) with context path ''``
9. Abrir en el navegador la URL: http://localhost:8080/

## Pasos crear capa para una entidad

1. Entidad
2. Repositorio
3. Servicio
4. Controlador
5. HTML

## Spring Boot Devtools

Esta dependencia permite reinicios rápidos y automáticos cuando se hacen cambios en la aplicación.

Marcar las siguientes opciones:

Settings > Compiler > Build project automatically

Settings > Advanced Settings > Allow auto-make to start even....


## Bootstrap

https://getbootstrap.com/docs/5.2/getting-started/introduction/

Agregar dependencias en el **pom.xml** y recargar Maven:

```xml
<dependency>  
    <groupId>org.webjars</groupId>  
    <artifactId>bootstrap</artifactId>  
    <version>5.2.3</version>  
</dependency>  
<!-- https://mvnrepository.com/artifact/org.webjars/webjars-locator-core -->  
<dependency>  
    <groupId>org.webjars</groupId>  
    <artifactId>webjars-locator-core</artifactId>  
    <version>0.52</version>  
</dependency>
```

En el HTML agregar dentro de las etiquetas **head** la siguiente línea:

```html
<link rel="stylesheet" th:href="@{/webjars/bootstrap/css/bootstrap.min.css}"/>
```