package fr.utbm.petstock.view.app.filters;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import fr.utbm.petstock.model.Society;
import fr.utbm.petstock.view.View;

public class AlertsTab extends Tab implements View {
	private VBox mainLayout;
	private GridPane formPane;
	
	private Label nameLabel;
	private TextField nameTextField;
	private Label mailLabel;
	private TextField mailTextField;
	private Label volumeLabel;
	private TextField volumeTextField;
	private Label creationDateLabel;
	private TextField creationDateTextField;
	private Label hourLabel;
	private TextField hourTextField;
	
	private Label importantLabel;
	private CheckBox maxCheckBox;
	private CheckBox minCheckBox;
	private CheckBox neutralCheckBox;
	private Label actionModeLabel;
	private RadioButton realTimeRadioButton;
	private RadioButton differedRadioButton;
	private Label descriptionLabel;
	private TextArea descritpionTextArea;
	
	
	public AlertsTab() {
		this.mainLayout = new VBox();
		this.formPane = new GridPane();
		
		this.nameLabel = new Label("Nom de l'alerte:");
		this.nameTextField = new TextField();
		this.mailLabel = new Label("Email à notifier:");
		this.mailTextField = new TextField();
		this.volumeLabel = new Label("Volume:");
		this.volumeTextField = new TextField();
		this.creationDateLabel = new Label("Date de création:");
		this.creationDateTextField = new TextField();
		this.hourLabel = new Label("Heure:");
		this.hourTextField = new TextField();
		
		this.importantLabel = new Label("Important:");
		this.maxCheckBox = new CheckBox("Max");
		this.minCheckBox = new CheckBox("Min");
		this.neutralCheckBox = new CheckBox("Neutre");
		this.actionModeLabel = new Label("Mode d'action:");
		this.realTimeRadioButton = new RadioButton("Temps réel");
		this.differedRadioButton = new RadioButton("Différé");
		this.descriptionLabel = new Label("Description:");
		this.descritpionTextArea = new TextArea();
		
		build();
	}

	public void build() {
		this.setText("Alerts");
		this.setClosable(false);
		
		this.formPane.setVgap(3);
		
		this.formPane.add(nameLabel, 0, 1);
		this.formPane.add(nameTextField, 1, 1);
		this.formPane.add(mailLabel, 0, 2);
		this.formPane.add(mailTextField, 1, 2);
		this.formPane.add(volumeLabel, 0, 3);
		this.formPane.add(volumeTextField, 1, 3);
		this.formPane.add(creationDateLabel, 0, 4);
		this.formPane.add(creationDateTextField, 1, 4);
		this.formPane.add(hourLabel, 0, 5);
		this.formPane.add(hourTextField, 1, 5);
		
		HBox importantLineLayout = new HBox();
		importantLineLayout.getChildren().addAll(maxCheckBox, minCheckBox, neutralCheckBox);
		importantLineLayout.setSpacing(10);
		
		HBox actionModeLayout = new HBox();
		actionModeLayout.getChildren().addAll(realTimeRadioButton, differedRadioButton);
		actionModeLayout.setSpacing(10);
		
		this.formPane.add(importantLabel, 0, 6);
		this.formPane.add(importantLineLayout, 1, 6);
		this.formPane.add(actionModeLabel, 0, 7);
		this.formPane.add(actionModeLayout, 1, 7);
		this.formPane.add(descriptionLabel, 0, 8);
		this.formPane.add(descritpionTextArea, 1, 8);
		
		this.mainLayout.setSpacing(10);
		this.mainLayout.getChildren().add(formPane);
		
		buildTable();
		
		this.setContent(mainLayout);
	}
	
	private void buildTable() {
		final ObservableList<Society> datas = FXCollections.observableArrayList(
            new Society("ACCOR", 28.76f,  -0.05f,  42106,   28.935f),
            new Society("AIR LIQUIDE", 93.44f,   0.54f,  158842,  93.65f),
            new Society("ALCATEL-LUCENT", 1.307f,  -0.017f, 7035122, 1.328f),
            new Society("ALSTOM", 33.965f,  0.435f, 550066,  34.15f),
            new Society("ARCELORMITTAL REG", 13.10f,   0.045f, 465370,  13.105f),
            new Society("AXA", 13.685f, -0.04f,  1185388, 13.815f),
            new Society("BNP PARIBAS-A-", 46.685f, -0.98f,  1212295, 47.915f),
            new Society("BOUYGUES", 22.06f,   0.005f, 445974,  22.32f),
            new Society("CAP GEMINI", 36.105f, -0.775f, 358816,  36.945f),
            new Society("CARREFOUR", 21.305f, -0.185f, 583035,  21.555f),
            new Society("DANONE", 51.80f,   0.26f,  219529,  51.97f),
            new Society("DNG CONSULTING", 80.1f,    40.2f,  1000000, 120.5f),
            new Society("EADS", 35.555f, -0.18f,  531570,  35.795f),
            new Society("EDF", 14.41f,  -0.02f,  378469,  14.55f)
        );
		
		TableColumn<Society, String> societyName = new TableColumn<Society, String>("Société");
		societyName.setCellValueFactory(new PropertyValueFactory<Society, String>("name"));
		
		TableColumn<Society, Float> societyRate = new TableColumn<Society, Float>("Cours");
		societyRate.setCellValueFactory(new PropertyValueFactory<Society, Float>("rate"));
		
		TableColumn<Society, Float> societyVariation = new TableColumn<Society, Float>("Variation");
		societyVariation.setCellValueFactory(new PropertyValueFactory<Society, Float>("variation"));
		
		TableColumn<Society, Integer> societyVolume = new TableColumn<Society, Integer>("Volume");
		societyVolume.setCellValueFactory(new PropertyValueFactory<Society, Integer>("volume"));
		
		TableColumn<Society, Float> societyHigher = new TableColumn<Society, Float>("Plus haut");
		societyHigher.setCellValueFactory(new PropertyValueFactory<Society, Float>("higher"));
		
		TableView<Society> tableView = new TableView<Society>();
		tableView.setItems(datas);
		tableView.getColumns().addAll(societyName, societyRate, societyVariation, societyVolume, societyHigher);
		
		this.mainLayout.getChildren().add(tableView);
	}
}
