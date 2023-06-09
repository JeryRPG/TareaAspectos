
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Observer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        

        Button botonRojo = new  Button("Rojo");
        Button botonVerde = new Button("Verde");
        Button botonAzul = new Button("Azul");


        VBox vbox = new VBox();
        vbox.getChildren().addAll(botonRojo, botonVerde, botonAzul);

        primaryStage.setScene(new Scene(vbox, 200, 150));
        primaryStage.show();
    }
}