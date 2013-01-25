package fr.utbm.petstock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import fr.utbm.petstock.view.TopMenuBar;

public class Petstock extends Application {	
	private MenuBar menuBar = new TopMenuBar();
	
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application PetStocks");
        
        VBox root = new VBox();
        root.getChildren().add(menuBar);
        
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}
