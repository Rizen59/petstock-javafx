package fr.utbm.petstock.view.vmenu;

import fr.utbm.petstock.view.View;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SubVerticalMenus extends Accordion implements View {
	private final TitledPane filtersPane;
	private final TitledPane parametersPane;
	private final TitledPane customListPane;
	private final TitledPane graphPane;
	
	private final TreeItem<String> filtersTree;
	private final TreeItem<String> categoriesTree;

	
	public SubVerticalMenus() {
		this.filtersPane = new TitledPane("Filtre de valeurs", null);
		this.parametersPane = new TitledPane("Paramètres", null);
		this.customListPane = new TitledPane("Liste personnalisée", null);
		this.graphPane = new TitledPane("Graphiques", null);
	
		Image folderImg = new Image("/images/icons/folder.gif");
		
		this.filtersTree = new TreeItem<String>("Filtres", new ImageView(folderImg));
		this.categoriesTree = new TreeItem<String>("Catégories", new ImageView(folderImg));
		
		build();
	}
	
	public void build() {
		buildFiltersPane();
		buildParametersPane();
		buildCustomListPane();
		buildGraphPane();
		
		this.getPanes().addAll(filtersPane, parametersPane, customListPane, graphPane);
	}
	
	private void buildFiltersPane() {
		VBox vLayout = new VBox();
		
		Image userImg = new Image("/images/icons/user.gif");
		Image userFemaleImg = new Image("/images/icons/user_female.gif");
		
		this.filtersTree.getChildren().addAll(
					     new TreeItem<String>("toutes", new ImageView(userImg)),
					     new TreeItem<String>("DNG Consulting", new ImageView(userImg)),
					     new TreeItem<String>("Carrefour", new ImageView(userImg)),
					     new TreeItem<String>("Vivendi", new ImageView(userImg)),
					     new TreeItem<String>("Total", new ImageView(userImg)),
					     new TreeItem<String>("Vinci", new ImageView(userImg))
					 );
		this.filtersTree.setExpanded(true);
		
		this.categoriesTree.getChildren().addAll(
			     new TreeItem<String>("distribution", new ImageView(userImg)),
			     new TreeItem<String>("télécom", new ImageView(userFemaleImg)),
			     new TreeItem<String>("services", new ImageView(userFemaleImg)),
			     new TreeItem<String>("autres", new ImageView(userFemaleImg))
			 );
		this.categoriesTree.setExpanded(true);
		
		final TreeView<String> filtersTreeView = new TreeView<String>();
		filtersTreeView.setRoot(filtersTree);
		filtersTreeView.setShowRoot(true);
		
		final TreeView<String> categoriesTreeView = new TreeView<String>();
		categoriesTreeView.setRoot(categoriesTree);
		categoriesTreeView.setShowRoot(true);
		
		vLayout.getChildren().addAll(filtersTreeView, categoriesTreeView);
		
		this.filtersPane.setContent(vLayout);
	}

	private void buildParametersPane() {
		Image chartImg = new Image("/images/buttons/chart.png");
		
		Button systemParameterButton = new Button("Paramètre système", new ImageView(chartImg));
		Button moneyConfigButton = new Button("Configuration monnaie", new ImageView(chartImg));
		Button securityButton = new Button("Sécurité", new ImageView(chartImg));
		
		VBox vLayout = new VBox();
		vLayout.getChildren().addAll(systemParameterButton, moneyConfigButton, securityButton);
		
		this.parametersPane.setContent(vLayout);
	}
	
	private void buildCustomListPane() {
		Image tableImg = new Image("/images/buttons/table.png");
		
		Button createListButton = new Button("Créer ma liste", new ImageView(tableImg));
		Button modifyListButton = new Button("Modifier ma liste", new ImageView(tableImg));
		
		VBox vLayout = new VBox();
		vLayout.getChildren().addAll(createListButton, modifyListButton);
		
		this.customListPane.setContent(vLayout);
	}
	
	private void buildGraphPane() {
		Image chartImg = new Image("/images/buttons/chart.png");
		
		Button barGraphButton = new Button("Graphiques en bar", new ImageView(chartImg));
		Button pieChartButton = new Button("Graphiques en camembert", new ImageView(chartImg));
		Button curveGraphButton = new Button("Graphiques en courbes", new ImageView(chartImg));
		
		VBox vLayout = new VBox();
		vLayout.getChildren().addAll(barGraphButton, pieChartButton, curveGraphButton);
		
		this.graphPane.setContent(vLayout);
	}
}
