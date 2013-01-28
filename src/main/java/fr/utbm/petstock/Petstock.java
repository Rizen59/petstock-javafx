package fr.utbm.petstock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import fr.utbm.petstock.view.TopMenuBar;
import fr.utbm.petstock.view.vmenu.VerticalMenu;
import fr.utbm.petstock.view.vmenu.SubVerticalMenus;

public class Petstock extends Application {	
	private MenuBar menuBar = new TopMenuBar();
	private TitledPane verticalMenu = new VerticalMenu();
	
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Application PetStocks");
        
        VBox root = new VBox();
        root.getChildren().add(menuBar);
        root.getChildren().add(verticalMenu);
        
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add("/css/style.css");
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}
