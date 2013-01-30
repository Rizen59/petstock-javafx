package fr.utbm.petstock.view.app.filters;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import fr.utbm.petstock.view.View;

public class FiltersTabPane extends TabPane implements View {
	private Tab cac40Tab;
	private Tab alertsTab;
	private Tab silverlightTab;
	

	public FiltersTabPane() {
		this.cac40Tab = new FinancialTab();
		this.alertsTab = new AlertsTab();
		this.silverlightTab = new SilverlightTab();
		
		build();
	}
	
	public void build() {
		this.getTabs().addAll(cac40Tab, alertsTab, silverlightTab);
	}
}
