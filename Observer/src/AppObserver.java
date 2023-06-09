
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppObserver extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        
    	/**
        Button botonRojo = new  Button("Rojo");
        Button botonVerde = new Button("Verde");
        Button botonAzul = new Button("Azul");
        

        VBox vbox = new VBox();
        vbox.getChildren().addAll(botonRojo, botonVerde, botonAzul);
        **/
        Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("observer.fxml"));
			primaryStage.setScene(new Scene(root, 650,500));
			primaryStage.setTitle("Tarea Aspectos");
	        primaryStage.show();
		} catch (IOException e) {
			System.out.println("Error al crear la ventana.");
			e.printStackTrace();
			
		}
    }
}