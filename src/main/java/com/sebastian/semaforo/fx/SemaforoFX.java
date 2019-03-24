package com.sebastian.semaforo.fx;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * mvn compile exec:java mvn clean compile package exec:java
 *
 * @author Sebastián Ávila A.
 */
public class SemaforoFX extends Application {

  @Override
  public void stop() {
    Platform.exit();
    System.exit(Thread.MAX_PRIORITY);
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(
            "semaforo.fxml"));
    primaryStage.setTitle("Semaforo");
    final Scene scene = new Scene(loader.load());
    ReceptorEventos controller = loader.getController();
    System.out.println(controller);
    scene.addEventHandler(EventType.ROOT, e -> {
      controller.recibir(e);
    });
    primaryStage.setScene(scene);
    primaryStage.setFullScreen(true);
    primaryStage.setAlwaysOnTop(true);
    primaryStage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
