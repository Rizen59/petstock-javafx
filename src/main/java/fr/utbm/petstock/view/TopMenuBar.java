package fr.utbm.petstock.view;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TopMenuBar extends MenuBar implements View {
	private final Menu fileMenu;
	private MenuItem saveItem;
	private MenuItem openItem;
	private MenuItem generateGraphItem;
	private MenuItem printItem;
	private MenuItem optionsItem;
	private MenuItem quitItem;
	
	private final Menu editMenu;
	private MenuItem copyItem;
	private MenuItem pasteItem;
	private MenuItem cutItem;
	private MenuItem cancelItem;
	
	private final Menu helpMenu;
	private MenuItem docItem;
	
	
	public TopMenuBar() {
		// Menus instanciation
		this.fileMenu = new Menu("Fichier");
		this.editMenu = new Menu("Edition");
		this.helpMenu = new Menu("Aide");
		
		// Items instanciation
		this.saveItem = new MenuItem("Sauvegarder");
		this.openItem = new MenuItem("Ouvrir un fichier");
		this.generateGraphItem = new MenuItem("Générer graphiques");
		this.printItem = new MenuItem("Imprimer");
		this.optionsItem = new MenuItem("Mes options");
		this.quitItem = new MenuItem("Quitter");
	
		this.copyItem = new MenuItem("Copier");
		this.pasteItem = new MenuItem("Coller");
		this.cutItem = new MenuItem("Couper");
		this.cancelItem = new MenuItem("Annuler");
		
		this.docItem = new MenuItem("Documentation");
		
		build();
	}

	public void build() {
		this.fileMenu.getItems().addAll(saveItem, openItem, generateGraphItem, printItem, optionsItem, quitItem);
		this.editMenu.getItems().addAll(copyItem, pasteItem, cutItem, cancelItem);
		this.helpMenu.getItems().addAll(docItem);
		
		this.getMenus().addAll(fileMenu, editMenu, helpMenu);
	}
}
