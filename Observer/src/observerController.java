import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class observerController {

    @FXML
    private Button botonAzul;

    @FXML
    private Button botonRojo;

    @FXML
    private Button botonVerde;
    @FXML
    private VBox rootPane;

    @FXML
    private void botonRojoClick(ActionEvent event) {
        System.out.println("Se ha hecho clic en el botón Rojo");
        rootPane.setStyle("-fx-background-color:  lightCoral;");
    }

    @FXML
    private void botonVerdeClick() {
        System.out.println("Se ha hecho clic en el botón Verde");
        rootPane.setStyle("-fx-background-color: lightGreen;");
    }

    @FXML
    private void botonAzulClick() {
        System.out.println("Se ha hecho clic en el botón Azul");
        rootPane.setStyle("-fx-background-color: lightBlue;");
    }
}
