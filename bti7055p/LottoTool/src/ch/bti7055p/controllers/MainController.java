package ch.bti7055p.controllers;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import ch.bti7055p.main.Main;

public final class MainController implements Initializable{

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtCurWinNr5M;

	@FXML
	private TextField txtWnr1;

	@FXML
	private TextField txtWnr2;

	@FXML
	private TextField txtYnr5MP2;

	@FXML
	private TextField txtYnr5MP1;

	@FXML
	private TextField txtYnr5MP6;

	@FXML
	private TextField txtYSN1;

	@FXML
	private TextField txtYnr5MP5;

	@FXML
	private TextField txtValSnr;

	@FXML
	private TextField txtYSN2;

	@FXML
	private TextField txtYnr5MP4;

	@FXML
	private TextField txtYnr5MP3;

	@FXML
	private TextField txtWnr3;

	@FXML
	private TextField txtWnr4;

	@FXML
	private TextField txtSourceSing;

	@FXML
	private TextField txtWnr5;

	@FXML
	private TextField txtYnr5MP7;

	@FXML
	private TextField txtYSS1MP4;

	@FXML
	private TextField txtYSS1MP3;

	@FXML
	private TextField txtYSS1MP6;

	@FXML
	private TextField txtYSS1MP5;

	@FXML
	private TextField txtYSS1MP7;

	@FXML
	private TextField txtYSS1MP2;

	@FXML
	private TabPane tpPaneDrawings;

	@FXML
	private TextField txtYSS1MP1;

	@FXML
	private TextField txtCurWinNr4M;

	@FXML
	private TextField txtValNrMP5;

	@FXML
	private TextField txtValNrMP4;

	@FXML
	private TextField txtValNrMP7;

	@FXML
	private TextField txtValNrMP6;

	@FXML
	private TextField txtValNrMP1;

	@FXML
	private TextField txtValNrMP3;

	@FXML
	private TextField txtValNrMP2;

	@FXML
	private Tab tabSingle;

	@FXML
	private TextField txtSourceMul;

	@FXML
	private TextField txtValSNMP2;

	@FXML
	private TextField txtValSNMP1;

	@FXML
	private TextField txtValSNMP6;

	@FXML
	private TextField txtValSNMP5;

	@FXML
	private TextField txtValSNMP4;

	@FXML
	private TextField txtValSNMP3;

	@FXML
	private TextField txtValSNMP7;

	@FXML
	private TextField txtCurWS;

	@FXML
	private TextField txtValSuperMP6;

	@FXML
	private TextField txtValSuperMP5;

	@FXML
	private TextField txtValSuperMP7;

	@FXML
	private TextField txtValSuperMP2;

	@FXML
	private TextField txtYnr3MP3;

	@FXML
	private TextField txtValSuperMP1;

	@FXML
	private TextField txtYnr3MP4;

	@FXML
	private TextField txtYnr3MP1;

	@FXML
	private TextField txtValSuperMP4;

	@FXML
	private TextField txtWST;

	@FXML
	private TextField txtYnr3MP2;

	@FXML
	private TextField txtValSuperMP3;

	@FXML
	private TextField txtYnr3MP7;

	@FXML
	private TextField txtYnr3MP5;

	@FXML
	private TextField txtYnr3MP6;

	@FXML
	private TextField txtYSN1MP3;

	@FXML
	private TextField txtYSN1MP2;

	@FXML
	private TextField txtYSN1MP1;

	@FXML
	private TextField txtYSN1MP7;

	@FXML
	private TextField txtYSN1MP6;

	@FXML
	private TextField txtYSN1MP5;

	@FXML
	private TextField txtYSN1MP4;

	@FXML
	private TextField txtCurWS2M;

	@FXML
	private HBox boxContent;

	@FXML
	private TextField txtValSuper;

	@FXML
	private TextField txtYSS4MP6;

	@FXML
	private TextField txtCurWS1M;

	@FXML
	private TextField txtYSS4MP7;

	@FXML
	private TextField txtYSS4MP1;

	@FXML
	private TextField txtYSS4MP4;

	@FXML
	private TextField txtYSS4MP5;

	@FXML
	private TextField txtYSS4MP2;

	@FXML
	private TextField txtYSS4MP3;

	@FXML
	private TextField txtCurWinNr3;

	@FXML
	private TextField txtCurWinNr2;

	@FXML
	private TextField txtCurWinNr1;

	@FXML
	private TextField txtCurWinNr1M;

	@FXML
	private DatePicker dpEvalDay;

	@FXML
	private TextField txtCurWinNr5;

	@FXML
	private TextField txtSourceSet;

	@FXML
	private TextField txtCurWinNr4;

	@FXML
	private TextField txtYnr1MP2;

	@FXML
	private TextField txtYnr1MP1;

	@FXML
	private TextField txtYnr1MP4;

	@FXML
	private TextField txtMessage;

	@FXML
	private TextField txtYnr1MP3;

	@FXML
	private TextField txtYnr1MP6;

	@FXML
	private TextField txtYnr1MP5;

	@FXML
	private TextField txtYnr1MP7;

	@FXML
	private TextField txtCurWSM;

	@FXML
	private ComboBox<String> comboTickets;

	@FXML
	private TextField txtYnr4MP1;

	@FXML
	private TextField txtYnr4MP4;

	@FXML
	private TextField txtYnr4MP5;

	@FXML
	private TextField txtYnr4MP2;

	@FXML
	private TextField txtYnr4MP3;

	@FXML
	private TextField txtYnr4MP6;

	@FXML
	private TextField txtYnr4MP7;

	@FXML
	private TextField txtYSS2MP5;

	@FXML
	private TextField txtYSS2MP4;

	@FXML
	private TextField txtYSS2MP7;

	@FXML
	private TextField txtYSS2MP6;

	@FXML
	private TextField txtYSS2MP1;

	@FXML
	private TextField txtYSS2MP3;

	@FXML
	private TextField txtYSS2MP2;

	@FXML
	private TextField txtYnr2;

	@FXML
	private TextField txtYnr1;

	@FXML
	private TextField txtYnr4;

	@FXML
	private TextField txtYnr3;

	@FXML
	private TextField txtCurWinNr3M;

	@FXML
	private TextField txtvalNr;

	@FXML
	private TextField txtYnr5;

	@FXML
	private TextField txtYSS3MP7;

	@FXML
	private TextField txtYSS3MP5;

	@FXML
	private TextField txtYSS3MP6;

	@FXML
	private TextField txtYSS3MP3;

	@FXML
	private TextField txtYSS3MP4;

	@FXML
	private TextField txtYSS3MP1;

	@FXML
	private TextField txtYSS3MP2;

	@FXML
	private TextField txtCurWinNr2M;

	@FXML
	private TextField txtYnr2MP1;

	@FXML
	private TextField txtYnr2MP3;

	@FXML
	private TextField txtYnr2MP2;

	@FXML
	private TextField txtYSS1;

	@FXML
	private TextField txtYnr2MP5;

	@FXML
	private TextField txtYSS2;

	@FXML
	private TextField txtYnr2MP4;

	@FXML
	private TextField txtYSS3;

	@FXML
	private TextField txtYnr2MP7;

	@FXML
	private TextField txtYSS4;

	@FXML
	private TextField txtYnr2MP6;

	@FXML
	private TextField txtYSN2MP4;

	@FXML
	private TextField txtYSN2MP3;

	@FXML
	private TextField txtYSN2MP2;

	@FXML
	private TextField txtYSN2MP1;

	@FXML
	private TextField txtWSnr2;

	@FXML
	private TextField txtYSN2MP7;

	@FXML
	private TextField txtWSnr1;

	@FXML
	private TextField txtYSN2MP6;

	@FXML
	private TextField txtYSN2MP5;

	@FXML
	private TextField txtCurWS1;

	@FXML
	private TextField txtCurWS2;
	
	@FXML
	private TabPane mainTab;
	

	@FXML
	void close(ActionEvent event) {
		Platform.exit();
	}
	
	@FXML
	void actXSD(ActionEvent event) {

	}

	@FXML
	void evalXML(ActionEvent event) {

	}

	@FXML
	void searchMultiXML(ActionEvent event) {

	}

	@FXML
	void evalMultiXML(ActionEvent event) {

	}

	@FXML
	public void handleSearchXSD(Event e) {
		File file = getFileChooser("XSD files (*.xsd)", "*.xsd");

		if (file != null) {
			txtSourceSet.setText(file.getPath());
			displayMessage("Loaded file: " + file.getPath());
		}
	}

	@FXML
	public void handleSearchXML(Event e) {
		File file = getFileChooser("XML files (*.xml)", "*.xml");

		if (file != null) {
			txtSourceSet.setText(file.getPath());
			displayMessage("Loaded file: " + file.getPath());
		}

	}

	@FXML
	public void handleSetDe(Event e) {
		Main.instance.loadView(new Locale("de", "CH"));
	}

	@FXML
	public void handleSetEn(Event e) {
		Main.instance.loadView(new Locale("en", "EN"));
	}

	void displayMessage(String m) {
		txtMessage.setText(m);
	}

	static File getFileChooser(String filter_description,
			String filter_extension) {
		FileChooser fileChooser = new FileChooser();

		fileChooser
				.setInitialDirectory(new File(System.getProperty("user.dir")));

		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
				filter_description, filter_extension);
		fileChooser.getExtensionFilters().add(extFilter);

		return fileChooser.showOpenDialog(Main.instance.getPrimaryStage());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainTab.getSelectionModel().selectedItemProperty().addListener(
			    new ChangeListener<Tab>() {
			        @Override
			        public void changed(ObservableValue<? extends Tab> ov, Tab t, Tab t1) {
			            txtCurWS.setText(txtWST.getText());
			            txtCurWinNr1.setText(txtWnr1.getText());
			            txtCurWinNr2.setText(txtWnr2.getText());
			            txtCurWinNr3.setText(txtWnr3.getText());
			            txtCurWinNr4.setText(txtWnr4.getText());
			            txtCurWinNr5.setText(txtWnr5.getText());
			            txtCurWS1.setText(txtWSnr1.getText());
			            txtCurWS2.setText(txtWSnr2.getText());
			            
			            txtCurWSM.setText(txtWST.getText());
			            txtCurWinNr1M.setText(txtWnr1.getText());
			            txtCurWinNr2M.setText(txtWnr2.getText());
			            txtCurWinNr3M.setText(txtWnr3.getText());
			            txtCurWinNr4M.setText(txtWnr4.getText());
			            txtCurWinNr5M.setText(txtWnr5.getText());
			            txtCurWS1M.setText(txtWSnr1.getText());
			            txtCurWS2M.setText(txtWSnr2.getText());
			        }
			    }
			);
		
		dpEvalDay.setValue(LocalDate.now());
	}
}
