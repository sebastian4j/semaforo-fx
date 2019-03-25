package com.sebastian.semaforo.fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Sebastián Ávila A.
 */
public class SemaforoController implements Initializable, ReceptorEventos {
  @FXML
  private Circle rojo;
  @FXML
  private Circle amarillo;
  @FXML
  private Circle verde;
  private int presionados = 0;
  @FXML
  private Pane semaforo;


  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    rojo.setFill(Color.GRAY);
    verde.setFill(Color.GRAY);
    amarillo.setFill(Color.GRAY);
    semaforo.setFocusTraversable(true);
    semaforo.requestFocus();
  }

  private void recibir(EventType evento) {
    if (evento == MouseEvent.MOUSE_CLICKED) {
      switch (presionados) {
        case 0:
          rojo.setFill(Color.RED);
          verde.setFill(Color.GRAY);
          amarillo.setFill(Color.GRAY);
          break;
        case 1:
          rojo.setFill(Color.GRAY);
          verde.setFill(Color.GREEN);
          amarillo.setFill(Color.GRAY);
          break;
        case 2:
          rojo.setFill(Color.GRAY);
          verde.setFill(Color.GRAY);
          amarillo.setFill(Color.YELLOW);
          break;
      }
      presionados++;
      if (presionados == 3) {
        presionados = 0;
      }
    }
  }

  @Override
  public void recibir(Event evento) {
    recibir(evento.getEventType());
  }

}
