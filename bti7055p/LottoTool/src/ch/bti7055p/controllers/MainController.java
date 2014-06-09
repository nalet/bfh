package ch.bti7055p.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
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

public final class MainController
{
	
	private List<I18NNodes> nodeList = new ArrayList<I18NNodes>();

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
	private Label lblWinningNumbers;

	@FXML
	private TextField txtYSS1MP5;

	@FXML
	private TextField txtYSS1MP7;

	@FXML
	private Label lblYSN;

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
	private Label lblCurrWinSNr;

	@FXML
	private Button btnSearchXSD;

	@FXML
	private TextField txtCurWS;

	@FXML
	private TextField txtValSuperMP6;

	@FXML
	private Label lblWinningSuperStar;

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
	private Button btnActSet;

	@FXML
	private TextField txtYSN1MP3;

	@FXML
	private TextField txtYSN1MP2;

	@FXML
	private Label lblCurWS;

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
	private Button btnEvalMul;

	@FXML
	private Label lblInfoSet;

	@FXML
	private HBox boxContent;

	@FXML
	private Label lblValSSP1;

	@FXML
	private Tab tpPlay3;

	@FXML
	private Tab tpPlay2;

	@FXML
	private Tab tpPlay1;

	@FXML
	private Button btnEvalSing;

	@FXML
	private Tab tpPlay7;

	@FXML
	private Tab tpPlay6;

	@FXML
	private Tab tpPlay5;

	@FXML
	private TextField txtValSuper;

	@FXML
	private Tab tpPlay4; 

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
	private Label lblYnr;

	@FXML
	private TextField txtCurWinNr1M;

	@FXML
	private TextField txtEvalDay;

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
	private TextField txtOpenXML;

	@FXML
	private TextField txtYnr1MP3;

	@FXML
	private TextField txtYnr1MP6;

	@FXML
	private TextField txtYnr1MP5;

	@FXML
	private Label lblValSnr;

	@FXML
	private TextField txtYnr1MP7;

	@FXML
	private TextField txtCurWSM;

	@FXML
	private ChoiceBox<?> choiceBoxTicket;

	@FXML
	private Button btnSearchMul;

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
	private Button btnSearchSing;

	@FXML
	private TextField txtYSS2MP1; 

	@FXML
	private TextField txtYSS2MP3;

	@FXML
	private Tab tabMultiple;

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
	private Label lblEvalSing;

	@FXML
	private TextField txtvalNr;
	
	@FXML
	private TextField txtYnr5; 
	
	@FXML
	private Label lblOpenXML;

	@FXML
	private Label lblCurrWinNr;

	@FXML
	private TextField txtYSS3MP7;

	@FXML
	private Label lblWinningStarNumbers;

	@FXML
	private Label lblEvalMul; 

	@FXML
	private TextField txtYSS3MP5;

	@FXML
	private TextField txtYSS3MP6;

	@FXML
	private Tab tabSettings;

	@FXML
	private Label lblValSuper;

	@FXML
	private TextField txtYSS3MP3;

	@FXML
	private TextField txtYSS3MP4;

	@FXML
	private TextField txtYSS3MP1;

	@FXML
	private TextField txtYSS3MP2;

	@FXML
	private Label lblYSS;

	@FXML
	private TextField txtCurWinNr2M;

	@FXML
	private TextField txtYnr2MP1;

	@FXML
	private Label lblEvalDay;

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
	private Label lblValNr;

	@FXML
	private TextField txtCurWS1;

	@FXML
	private TextField txtCurWS2;
	
	@FXML
	private Button btnDE;
	
	@FXML
	private Button btnEN;
	
	@FXML
	private Button btnClose;

	@FXML
	void close(ActionEvent event)
	{
		Platform.exit();
	}
	
   @FXML
   void setDe(ActionEvent event) {
   	Locale locale = new Locale("de", "CH");
   	Helper.applyI18N("lang", locale, nodeList);
   }

   @FXML
   void setEn(ActionEvent event) {
   	Locale locale = new Locale("en", "EN");
   	Helper.applyI18N("lang", locale, nodeList);
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
	
	// This method is called by the FXMLLoader when initialization is complete
	void initialize()
	{
		nodeList.add(new I18NNodes(btnClose,"btnClose"));
		nodeList.add(new I18NNodes(btnDE,"btnDE"));
		nodeList.add(new I18NNodes(btnEN,"btnEN"));
//		nodeList.add(new I18NNodes(tabSettings,"tabSettings"));
		nodeList.add(new I18NNodes(lblInfoSet,"lblInfoSet"));
		nodeList.add(new I18NNodes(btnSearchXSD,"btnSearchXSD"));
		nodeList.add(new I18NNodes(btnActSet,"btnActSet"));
		nodeList.add(new I18NNodes(lblWinningNumbers,"lblWinningNumbers"));
		nodeList.add(new I18NNodes(lblWinningSuperStar,"lblWinningSuperStar"));
		nodeList.add(new I18NNodes(lblWinningStarNumbers,"lblWinningStarNumbers"));
		nodeList.add(new I18NNodes(lblEvalDay,"lblEvalDay"));
//		nodeList.add(new I18NNodes(tabSingle,"tabSingle"));
		nodeList.add(new I18NNodes(lblValSuper,"lblValSuper"));
		nodeList.add(new I18NNodes(lblValSnr,"lblValSnr"));
		nodeList.add(new I18NNodes(lblValNr,"lblValNr"));
		nodeList.add(new I18NNodes(lblCurWS,"lblCurWS"));
		nodeList.add(new I18NNodes(lblCurrWinSNr,"lblCurrWinSNr"));
		nodeList.add(new I18NNodes(lblCurrWinNr,"lblCurrWinNr"));
		nodeList.add(new I18NNodes(lblYSS,"lblYSS"));
		nodeList.add(new I18NNodes(lblYSN,"lblYSN"));
		nodeList.add(new I18NNodes(lblYnr,"lblYnr"));
		nodeList.add(new I18NNodes(lblEvalSing,"lblEvalSing"));
		nodeList.add(new I18NNodes(btnSearchSing,"btnSearchSing"));
		nodeList.add(new I18NNodes(btnEvalSing,"btnEvalSing"));
//		nodeList.add(new I18NNodes(tabMultiple,"tabMultiple"));
		nodeList.add(new I18NNodes(lblEvalMul,"lblEvalMul"));
		nodeList.add(new I18NNodes(btnSearchMul,"btnSearchMul"));
		nodeList.add(new I18NNodes(btnEvalMul,"btnEvalMul"));
		nodeList.add(new I18NNodes(tpPaneDrawings,"tpPaneDrawings"));
//		nodeList.add(new I18NNodes(tpPlay1,"tpPlay1"));
//		nodeList.add(new I18NNodes(tpPlay2,"tpPlay2"));
//		nodeList.add(new I18NNodes(tpPlay3,"tpPlay3"));
//		nodeList.add(new I18NNodes(tpPlay4,"tpPlay4"));
//		nodeList.add(new I18NNodes(tpPlay5,"tpPlay5"));
//		nodeList.add(new I18NNodes(tpPlay6,"tpPlay6"));
//		nodeList.add(new I18NNodes(tpPlay7,"tpPlay7"));
		nodeList.add(new I18NNodes(lblOpenXML,"lblOpenXML"));

//		Locale locale = new Locale("en", "EN");
//		Helper.applyI18N("lang", locale, nodeList);

	}
}
