package fr.utbm.petstock.view.app.filters;

import javafx.scene.control.Tab;
import fr.utbm.petstock.view.View;

public class SilverlightTab extends Tab implements View {

	public SilverlightTab() {
		build();
	}
	
	public void build() {
		this.setText("Silverlight");
		this.setClosable(false);
	}
}
