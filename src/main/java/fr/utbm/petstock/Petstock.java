package fr.utbm.petstock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import fr.utbm.petstock.view.TopMenuBar;
import fr.utbm.petstock.view.vmenu.VerticalMenu;

public class Petstock extends Application {
	private VBox root = new VBox();
	private HBox hLayout = new HBox();
	
	private MenuBar menuBar = new TopMenuBar();
	private TitledPane verticalMenu = new VerticalMenu();
    
	
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application PetStocks");
        
        root.getChildren().addAll(menuBar, hLayout);
        hLayout.getChildren().addAll(verticalMenu);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("/css/style.css");
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}
