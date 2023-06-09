import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class observerController {

    @FXML
    private Button botonAzul;

    @FXML
    private Button botonRojo;

    @FXML
    private Button botonVerde;

    @FXML
    private void botonRojoClick() {
        System.out.println("Se ha hecho clic en el botón Rojo");
    }

    @FXML
    private void botonVerdeClick() {
        System.out.println("Se ha hecho clic en el botón Verde");
    }

    @FXML
    private void botonAzulClick() {
        System.out.println("Se ha hecho clic en el botón Azul");
    }
}
