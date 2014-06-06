package ch.bti7055p.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class MainController
{
	/**
	 * Sample Skeleton for 'Main.fxml' Controller Class
	 */

	@FXML
	// ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML
	// URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML
	// fx:id="txtCurWinNr5M"
	private TextField txtCurWinNr5M; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWnr1"
	private TextField txtWnr1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWnr2"
	private TextField txtWnr2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP2"
	private TextField txtYnr5MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP1"
	private TextField txtYnr5MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP6"
	private TextField txtYnr5MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1"
	private TextField txtYSN1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP5"
	private TextField txtYnr5MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSnr"
	private TextField txtValSnr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2"
	private TextField txtYSN2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP4"
	private TextField txtYnr5MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP3"
	private TextField txtYnr5MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWnr3"
	private TextField txtWnr3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWnr4"
	private TextField txtWnr4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtSourceSing"
	private TextField txtSourceSing; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWnr5"
	private TextField txtWnr5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5MP7"
	private TextField txtYnr5MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP4"
	private TextField txtYSS1MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP3"
	private TextField txtYSS1MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP6"
	private TextField txtYSS1MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblWinningNumbers"
	private Label lblWinningNumbers; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP5"
	private TextField txtYSS1MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP7"
	private TextField txtYSS1MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblYSN"
	private Label lblYSN; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP2"
	private TextField txtYSS1MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPaneDrawings"
	private TabPane tpPaneDrawings; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1MP1"
	private TextField txtYSS1MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr4M"
	private TextField txtCurWinNr4M; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP5"
	private TextField txtValNrMP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP4"
	private TextField txtValNrMP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP7"
	private TextField txtValNrMP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP6"
	private TextField txtValNrMP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP1"
	private TextField txtValNrMP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP3"
	private TextField txtValNrMP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValNrMP2"
	private TextField txtValNrMP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="tabSingle"
	private Tab tabSingle; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtSourceMul"
	private TextField txtSourceMul; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP2"
	private TextField txtValSNMP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="mItemClose"
	private MenuItem mItemClose; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP1"
	private TextField txtValSNMP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP6"
	private TextField txtValSNMP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP5"
	private TextField txtValSNMP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP4"
	private TextField txtValSNMP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP3"
	private TextField txtValSNMP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSNMP7"
	private TextField txtValSNMP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblCurrWinSNr"
	private Label lblCurrWinSNr; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnSearchSet"
	private Button btnSearchSet; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWS"
	private TextField txtCurWS; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP6"
	private TextField txtValSuperMP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblWinningSuperStar"
	private Label lblWinningSuperStar; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP5"
	private TextField txtValSuperMP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP7"
	private TextField txtValSuperMP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP2"
	private TextField txtValSuperMP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP3"
	private TextField txtYnr3MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP1"
	private TextField txtValSuperMP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP4"
	private TextField txtYnr3MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP1"
	private TextField txtYnr3MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP4"
	private TextField txtValSuperMP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWST"
	private TextField txtWST; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP2"
	private TextField txtYnr3MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuperMP3"
	private TextField txtValSuperMP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP7"
	private TextField txtYnr3MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP5"
	private TextField txtYnr3MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3MP6"
	private TextField txtYnr3MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnActSet"
	private Button btnActSet; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP3"
	private TextField txtYSN1MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP2"
	private TextField txtYSN1MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblCurWS"
	private Label lblCurWS; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP1"
	private TextField txtYSN1MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP7"
	private TextField txtYSN1MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP6"
	private TextField txtYSN1MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP5"
	private TextField txtYSN1MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN1MP4"
	private TextField txtYSN1MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWS2M"
	private TextField txtCurWS2M; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnEvalMul"
	private Button btnEvalMul; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblInfoSet"
	private Label lblInfoSet; // Value injected by FXMLLoader

	@FXML
	// fx:id="boxContent"
	private HBox boxContent; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblValSSP1"
	private Label lblValSSP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay3"
	private Tab tpPlay3; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay2"
	private Tab tpPlay2; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay1"
	private Tab tpPlay1; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnEvalSing"
	private Button btnEvalSing; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay7"
	private Tab tpPlay7; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay6"
	private Tab tpPlay6; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay5"
	private Tab tpPlay5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtValSuper"
	private TextField txtValSuper; // Value injected by FXMLLoader

	@FXML
	// fx:id="tpPlay4"
	private Tab tpPlay4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP6"
	private TextField txtYSS4MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWS1M"
	private TextField txtCurWS1M; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP7"
	private TextField txtYSS4MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="MitemEN"
	private MenuItem MitemEN; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP1"
	private TextField txtYSS4MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP4"
	private TextField txtYSS4MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP5"
	private TextField txtYSS4MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP2"
	private TextField txtYSS4MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4MP3"
	private TextField txtYSS4MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr3"
	private TextField txtCurWinNr3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr2"
	private TextField txtCurWinNr2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr1"
	private TextField txtCurWinNr1; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblYnr"
	private Label lblYnr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr1M"
	private TextField txtCurWinNr1M; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtEvalDay"
	private TextField txtEvalDay; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr5"
	private TextField txtCurWinNr5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtSourceSet"
	private TextField txtSourceSet; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr4"
	private TextField txtCurWinNr4; // Value injected by FXMLLoader

	@FXML
	// fx:id="mItemDE"
	private MenuItem mItemDE; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP2"
	private TextField txtYnr1MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP1"
	private TextField txtYnr1MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP4"
	private TextField txtYnr1MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtOpenXML"
	private TextField txtOpenXML; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP3"
	private TextField txtYnr1MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP6"
	private TextField txtYnr1MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP5"
	private TextField txtYnr1MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="menuBar"
	private MenuBar menuBar; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblValSnr"
	private Label lblValSnr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1MP7"
	private TextField txtYnr1MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="mnuSetting"
	private Menu mnuSetting; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWSM"
	private TextField txtCurWSM; // Value injected by FXMLLoader

	@FXML
	// fx:id="choiceBoxTicket"
	private ChoiceBox<?> choiceBoxTicket; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnSearchMul"
	private Button btnSearchMul; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP1"
	private TextField txtYnr4MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP4"
	private TextField txtYnr4MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP5"
	private TextField txtYnr4MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP2"
	private TextField txtYnr4MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP3"
	private TextField txtYnr4MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP6"
	private TextField txtYnr4MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4MP7"
	private TextField txtYnr4MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP5"
	private TextField txtYSS2MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP4"
	private TextField txtYSS2MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP7"
	private TextField txtYSS2MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP6"
	private TextField txtYSS2MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="btnSearchSing"
	private Button btnSearchSing; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP1"
	private TextField txtYSS2MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP3"
	private TextField txtYSS2MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="tabMultiple"
	private Tab tabMultiple; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2MP2"
	private TextField txtYSS2MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2"
	private TextField txtYnr2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr1"
	private TextField txtYnr1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr4"
	private TextField txtYnr4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr3"
	private TextField txtYnr3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr3M"
	private TextField txtCurWinNr3M; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblEvalSing"
	private Label lblEvalSing; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtvalNr"
	private TextField txtvalNr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr5"
	private TextField txtYnr5; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblOpenXML"
	private Label lblOpenXML; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblCurrWinNr"
	private Label lblCurrWinNr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP7"
	private TextField txtYSS3MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblWinningStarNumbers"
	private Label lblWinningStarNumbers; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblEvalMul"
	private Label lblEvalMul; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP5"
	private TextField txtYSS3MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP6"
	private TextField txtYSS3MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="tabSettings"
	private Tab tabSettings; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblValSuper"
	private Label lblValSuper; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP3"
	private TextField txtYSS3MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP4"
	private TextField txtYSS3MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="mnuFile"
	private Menu mnuFile; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP1"
	private TextField txtYSS3MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3MP2"
	private TextField txtYSS3MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblYSS"
	private Label lblYSS; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWinNr2M"
	private TextField txtCurWinNr2M; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP1"
	private TextField txtYnr2MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblEvalDay"
	private Label lblEvalDay; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP3"
	private TextField txtYnr2MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP2"
	private TextField txtYnr2MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS1"
	private TextField txtYSS1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP5"
	private TextField txtYnr2MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS2"
	private TextField txtYSS2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP4"
	private TextField txtYnr2MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS3"
	private TextField txtYSS3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP7"
	private TextField txtYnr2MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSS4"
	private TextField txtYSS4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYnr2MP6"
	private TextField txtYnr2MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP4"
	private TextField txtYSN2MP4; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP3"
	private TextField txtYSN2MP3; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP2"
	private TextField txtYSN2MP2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP1"
	private TextField txtYSN2MP1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWSnr2"
	private TextField txtWSnr2; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP7"
	private TextField txtYSN2MP7; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtWSnr1"
	private TextField txtWSnr1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP6"
	private TextField txtYSN2MP6; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtYSN2MP5"
	private TextField txtYSN2MP5; // Value injected by FXMLLoader

	@FXML
	// fx:id="lblValNr"
	private Label lblValNr; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWS1"
	private TextField txtCurWS1; // Value injected by FXMLLoader

	@FXML
	// fx:id="txtCurWS2"
	private TextField txtCurWS2; // Value injected by FXMLLoader

	@FXML
	void close(ActionEvent event)
	{
		Platform.exit();
	}

	@FXML
	void searchXSD(ActionEvent event)
	{

	}

	@FXML
	void actXSD(ActionEvent event)
	{

	}

	@FXML
	void searchXML(ActionEvent event)
	{

	}

	@FXML
	void evalXML(ActionEvent event)
	{

	}

	@FXML
	void searchMultiXML(ActionEvent event)
	{

	}

	@FXML
	void evalMultiXML(ActionEvent event)
	{

	}

	@FXML
	// This method is called by the FXMLLoader when initialization is complete
	void initialize()
	{

		// assert txtCurWinNr5M != null :
		// "fx:id=\"txtCurWinNr5M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWnr1 != null :
		// "fx:id=\"txtWnr1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWnr2 != null :
		// "fx:id=\"txtWnr2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP2 != null :
		// "fx:id=\"txtYnr5MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP1 != null :
		// "fx:id=\"txtYnr5MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP6 != null :
		// "fx:id=\"txtYnr5MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1 != null :
		// "fx:id=\"txtYSN1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP5 != null :
		// "fx:id=\"txtYnr5MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSnr != null :
		// "fx:id=\"txtValSnr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2 != null :
		// "fx:id=\"txtYSN2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP4 != null :
		// "fx:id=\"txtYnr5MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP3 != null :
		// "fx:id=\"txtYnr5MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWnr3 != null :
		// "fx:id=\"txtWnr3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWnr4 != null :
		// "fx:id=\"txtWnr4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtSourceSing != null :
		// "fx:id=\"txtSourceSing\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWnr5 != null :
		// "fx:id=\"txtWnr5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5MP7 != null :
		// "fx:id=\"txtYnr5MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP4 != null :
		// "fx:id=\"txtYSS1MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP3 != null :
		// "fx:id=\"txtYSS1MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP6 != null :
		// "fx:id=\"txtYSS1MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblWinningNumbers != null :
		// "fx:id=\"lblWinningNumbers\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP5 != null :
		// "fx:id=\"txtYSS1MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP7 != null :
		// "fx:id=\"txtYSS1MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblYSN != null :
		// "fx:id=\"lblYSN\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP2 != null :
		// "fx:id=\"txtYSS1MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPaneDrawings != null :
		// "fx:id=\"tpPaneDrawings\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1MP1 != null :
		// "fx:id=\"txtYSS1MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr4M != null :
		// "fx:id=\"txtCurWinNr4M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP5 != null :
		// "fx:id=\"txtValNrMP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP4 != null :
		// "fx:id=\"txtValNrMP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP7 != null :
		// "fx:id=\"txtValNrMP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP6 != null :
		// "fx:id=\"txtValNrMP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP1 != null :
		// "fx:id=\"txtValNrMP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP3 != null :
		// "fx:id=\"txtValNrMP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValNrMP2 != null :
		// "fx:id=\"txtValNrMP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tabSingle != null :
		// "fx:id=\"tabSingle\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtSourceMul != null :
		// "fx:id=\"txtSourceMul\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP2 != null :
		// "fx:id=\"txtValSNMP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP1 != null :
		// "fx:id=\"txtValSNMP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP6 != null :
		// "fx:id=\"txtValSNMP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP5 != null :
		// "fx:id=\"txtValSNMP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP4 != null :
		// "fx:id=\"txtValSNMP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP3 != null :
		// "fx:id=\"txtValSNMP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSNMP7 != null :
		// "fx:id=\"txtValSNMP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblCurrWinSNr != null :
		// "fx:id=\"lblCurrWinSNr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnSearchSet != null :
		// "fx:id=\"btnSearchSet\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWS != null :
		// "fx:id=\"txtCurWS\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP6 != null :
		// "fx:id=\"txtValSuperMP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblWinningSuperStar != null :
		// "fx:id=\"lblWinningSuperStar\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP5 != null :
		// "fx:id=\"txtValSuperMP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP7 != null :
		// "fx:id=\"txtValSuperMP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP2 != null :
		// "fx:id=\"txtValSuperMP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP3 != null :
		// "fx:id=\"txtYnr3MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP1 != null :
		// "fx:id=\"txtValSuperMP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP4 != null :
		// "fx:id=\"txtYnr3MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP1 != null :
		// "fx:id=\"txtYnr3MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP4 != null :
		// "fx:id=\"txtValSuperMP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWST != null :
		// "fx:id=\"txtWST\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP2 != null :
		// "fx:id=\"txtYnr3MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuperMP3 != null :
		// "fx:id=\"txtValSuperMP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP7 != null :
		// "fx:id=\"txtYnr3MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP5 != null :
		// "fx:id=\"txtYnr3MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3MP6 != null :
		// "fx:id=\"txtYnr3MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnActSet != null :
		// "fx:id=\"btnActSet\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP3 != null :
		// "fx:id=\"txtYSN1MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP2 != null :
		// "fx:id=\"txtYSN1MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblCurWS != null :
		// "fx:id=\"lblCurWS\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP1 != null :
		// "fx:id=\"txtYSN1MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP7 != null :
		// "fx:id=\"txtYSN1MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP6 != null :
		// "fx:id=\"txtYSN1MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP5 != null :
		// "fx:id=\"txtYSN1MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN1MP4 != null :
		// "fx:id=\"txtYSN1MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWS2M != null :
		// "fx:id=\"txtCurWS2M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnEvalMul != null :
		// "fx:id=\"btnEvalMul\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblInfoSet != null :
		// "fx:id=\"lblInfoSet\" was not injected: check your FXML file 'Main.fxml'.";
		// assert boxContent != null :
		// "fx:id=\"boxContent\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblValSSP1 != null :
		// "fx:id=\"lblValSSP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay3 != null :
		// "fx:id=\"tpPlay3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay2 != null :
		// "fx:id=\"tpPlay2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay1 != null :
		// "fx:id=\"tpPlay1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnEvalSing != null :
		// "fx:id=\"btnEvalSing\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay7 != null :
		// "fx:id=\"tpPlay7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay6 != null :
		// "fx:id=\"tpPlay6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay5 != null :
		// "fx:id=\"tpPlay5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtValSuper != null :
		// "fx:id=\"txtValSuper\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tpPlay4 != null :
		// "fx:id=\"tpPlay4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP6 != null :
		// "fx:id=\"txtYSS4MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWS1M != null :
		// "fx:id=\"txtCurWS1M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP7 != null :
		// "fx:id=\"txtYSS4MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert MitemEN != null :
		// "fx:id=\"MitemEN\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP1 != null :
		// "fx:id=\"txtYSS4MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP4 != null :
		// "fx:id=\"txtYSS4MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP5 != null :
		// "fx:id=\"txtYSS4MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP2 != null :
		// "fx:id=\"txtYSS4MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4MP3 != null :
		// "fx:id=\"txtYSS4MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr3 != null :
		// "fx:id=\"txtCurWinNr3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr2 != null :
		// "fx:id=\"txtCurWinNr2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr1 != null :
		// "fx:id=\"txtCurWinNr1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblYnr != null :
		// "fx:id=\"lblYnr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr1M != null :
		// "fx:id=\"txtCurWinNr1M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtEvalDay != null :
		// "fx:id=\"txtEvalDay\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr5 != null :
		// "fx:id=\"txtCurWinNr5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtSourceSet != null :
		// "fx:id=\"txtSourceSet\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr4 != null :
		// "fx:id=\"txtCurWinNr4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert mItemDE != null :
		// "fx:id=\"mItemDE\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP2 != null :
		// "fx:id=\"txtYnr1MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP1 != null :
		// "fx:id=\"txtYnr1MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP4 != null :
		// "fx:id=\"txtYnr1MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtOpenXML != null :
		// "fx:id=\"txtOpenXML\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP3 != null :
		// "fx:id=\"txtYnr1MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP6 != null :
		// "fx:id=\"txtYnr1MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP5 != null :
		// "fx:id=\"txtYnr1MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert menuBar != null :
		// "fx:id=\"menuBar\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblValSnr != null :
		// "fx:id=\"lblValSnr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1MP7 != null :
		// "fx:id=\"txtYnr1MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert mnuSetting != null :
		// "fx:id=\"mnuSetting\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWSM != null :
		// "fx:id=\"txtCurWSM\" was not injected: check your FXML file 'Main.fxml'.";
		// assert choiceBoxTicket != null :
		// "fx:id=\"choiceBoxTicket\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnSearchMul != null :
		// "fx:id=\"btnSearchMul\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP1 != null :
		// "fx:id=\"txtYnr4MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP4 != null :
		// "fx:id=\"txtYnr4MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP5 != null :
		// "fx:id=\"txtYnr4MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP2 != null :
		// "fx:id=\"txtYnr4MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP3 != null :
		// "fx:id=\"txtYnr4MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP6 != null :
		// "fx:id=\"txtYnr4MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4MP7 != null :
		// "fx:id=\"txtYnr4MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP5 != null :
		// "fx:id=\"txtYSS2MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP4 != null :
		// "fx:id=\"txtYSS2MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP7 != null :
		// "fx:id=\"txtYSS2MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP6 != null :
		// "fx:id=\"txtYSS2MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert btnSearchSing != null :
		// "fx:id=\"btnSearchSing\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP1 != null :
		// "fx:id=\"txtYSS2MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP3 != null :
		// "fx:id=\"txtYSS2MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tabMultiple != null :
		// "fx:id=\"tabMultiple\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2MP2 != null :
		// "fx:id=\"txtYSS2MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2 != null :
		// "fx:id=\"txtYnr2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr1 != null :
		// "fx:id=\"txtYnr1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr4 != null :
		// "fx:id=\"txtYnr4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr3 != null :
		// "fx:id=\"txtYnr3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr3M != null :
		// "fx:id=\"txtCurWinNr3M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblEvalSing != null :
		// "fx:id=\"lblEvalSing\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtvalNr != null :
		// "fx:id=\"txtvalNr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr5 != null :
		// "fx:id=\"txtYnr5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblOpenXML != null :
		// "fx:id=\"lblOpenXML\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblCurrWinNr != null :
		// "fx:id=\"lblCurrWinNr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP7 != null :
		// "fx:id=\"txtYSS3MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblWinningStarNumbers != null :
		// "fx:id=\"lblWinningStarNumbers\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblEvalMul != null :
		// "fx:id=\"lblEvalMul\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP5 != null :
		// "fx:id=\"txtYSS3MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP6 != null :
		// "fx:id=\"txtYSS3MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert tabSettings != null :
		// "fx:id=\"tabSettings\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblValSuper != null :
		// "fx:id=\"lblValSuper\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP3 != null :
		// "fx:id=\"txtYSS3MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP4 != null :
		// "fx:id=\"txtYSS3MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert mnuFile != null :
		// "fx:id=\"mnuFile\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP1 != null :
		// "fx:id=\"txtYSS3MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3MP2 != null :
		// "fx:id=\"txtYSS3MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblYSS != null :
		// "fx:id=\"lblYSS\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWinNr2M != null :
		// "fx:id=\"txtCurWinNr2M\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP1 != null :
		// "fx:id=\"txtYnr2MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblEvalDay != null :
		// "fx:id=\"lblEvalDay\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP3 != null :
		// "fx:id=\"txtYnr2MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP2 != null :
		// "fx:id=\"txtYnr2MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS1 != null :
		// "fx:id=\"txtYSS1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP5 != null :
		// "fx:id=\"txtYnr2MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS2 != null :
		// "fx:id=\"txtYSS2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP4 != null :
		// "fx:id=\"txtYnr2MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS3 != null :
		// "fx:id=\"txtYSS3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP7 != null :
		// "fx:id=\"txtYnr2MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSS4 != null :
		// "fx:id=\"txtYSS4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYnr2MP6 != null :
		// "fx:id=\"txtYnr2MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP4 != null :
		// "fx:id=\"txtYSN2MP4\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP3 != null :
		// "fx:id=\"txtYSN2MP3\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP2 != null :
		// "fx:id=\"txtYSN2MP2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP1 != null :
		// "fx:id=\"txtYSN2MP1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWSnr2 != null :
		// "fx:id=\"txtWSnr2\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP7 != null :
		// "fx:id=\"txtYSN2MP7\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtWSnr1 != null :
		// "fx:id=\"txtWSnr1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP6 != null :
		// "fx:id=\"txtYSN2MP6\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtYSN2MP5 != null :
		// "fx:id=\"txtYSN2MP5\" was not injected: check your FXML file 'Main.fxml'.";
		// assert lblValNr != null :
		// "fx:id=\"lblValNr\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWS1 != null :
		// "fx:id=\"txtCurWS1\" was not injected: check your FXML file 'Main.fxml'.";
		// assert txtCurWS2 != null :
		// "fx:id=\"txtCurWS2\" was not injected: check your FXML file 'Main.fxml'.";

	}
}
