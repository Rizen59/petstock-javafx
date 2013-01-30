package fr.utbm.petstock.view.app.filters;

import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import fr.utbm.petstock.view.View;

public class FinancialTab extends Tab implements View {
	private ToolBar listControl;
	
	private TextField societyNameTextField;
	private Button addButton;
	private Button deleteButton;
	private Button editButton;
	private Button detailsButton;
	
	
	public FinancialTab() {
		this.listControl = new ToolBar();
		this.societyNameTextField = new TextField();
		this.addButton = new Button("Ajouter");
		this.deleteButton = new Button("Supprimer");
		this.editButton = new Button("Modifier");
		this.detailsButton = new Button("Visualiser");
		
		build();
	}
	
	public void build() {
		this.setText("Tableau du CAC40");
		this.setClosable(false);
		
		this.listControl.getItems().addAll(societyNameTextField, addButton, deleteButton, editButton, detailsButton);
		this.setContent(listControl);
	}
}
