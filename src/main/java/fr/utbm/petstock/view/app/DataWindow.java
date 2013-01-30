package fr.utbm.petstock.view.app;

import fr.utbm.petstock.view.View;
import fr.utbm.petstock.view.app.filters.FiltersTabPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;

public class DataWindow extends TitledPane implements View {
	public TabPane filtersTabPane;
	

	public DataWindow() {
		this.filtersTabPane = new FiltersTabPane();
		
		build();
	}
	
	public void build() {
		this.setText("Application financière");
		this.setCollapsible(false);
		
		this.setContent(filtersTabPane);
	}
}
