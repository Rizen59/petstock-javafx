package fr.utbm.petstock.view.vmenu;

import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import fr.utbm.petstock.view.View;

public class VerticalMenu extends TitledPane implements View {
	private VBox mainLayout;
	private HBox userActionsLayout;
	
	private Accordion subMenus;
	
	
	public VerticalMenu() {
		this.mainLayout = new VBox();
		this.userActionsLayout = new HBox();
		
		this.subMenus = new SubVerticalMenus();
		
		build();
	}
	
	public void build() {
		this.setText("Menu");
		this.setCollapsible(false);
		
		ImageView userAddImg = new ImageView(new Image("/images/icons/user_add.gif"));
		ImageView userDeleteImg = new ImageView(new Image("/images/icons/user_delete.gif"));
		
		this.userActionsLayout.getChildren().addAll(userAddImg, userDeleteImg);
		
		this.mainLayout.getChildren().addAll(userActionsLayout, subMenus);
		this.setContent(mainLayout);
	}
}
