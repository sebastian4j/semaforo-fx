## semaforo-fx

Ejemplo de aplicación con JavaFX para crear un semáforo, presionando el boton auto avanza automaticamente, presionando el click izquierdo del mouse se mueve en forma manual. 
- Para el ejemplo utilicé Java 11, JPMS, y OpenJFX 11

#### Enlaces Útiles:
OpenJFX: [https://openjfx.io](https://openjfx.io)

SDK JFX: [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)

OpenJDK: [https://jdk.java.net/11/](https://jdk.java.net/11/)

SceneBuilder: [https://gluonhq.com/products/scene-builder/](https://gluonhq.com/products/scene-builder/)

#### Antes de Empezar
Leer la siguiente documentación es requerido: [https://openjfx.io/openjfx-docs/](https://openjfx.io/openjfx-docs/)

#### Compilar y Lanzar la Aplicación
- Es posible lanzar la aplicación sin empaquetarla:
~~~~
mvn compile exec:java
~~~~
- Para realizar la compilación se utiliza el siguiente comando: 
~~~~
mvn clean compile package
~~~~
- Luego de compilarla se puede lanzarla con lo siguiente (se incluyen las librerias requeridas desde el SDK de JFX, cambiar el path por el adecuado):
~~~~
java --module-path  target/semaforo-fx-1.0-SNAPSHOT.jar:/home/sebastian/java/jdk/openjfx/lib/javafx.graphics.jar:/home/sebastian/java/jdk/openjfx/lib/javafx.fxml.jar:/home/sebastian/java/jdk/openjfx/lib/javafx.base.jar:/home/sebastian/java/jdk/openjfx/lib/javafx.controls.jar  --module com.sebastian.semaforo.fx/com.sebastian.semaforo.fx.SemaforoFX 
~~~~

> Como indiqué al comienzo, es requerido leer la documentación para poder saber más de JavaFX y poder instalar los requerimientos

