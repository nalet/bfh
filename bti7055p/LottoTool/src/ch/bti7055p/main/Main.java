package ch.bti7055p.main;
	
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Locale locale = new Locale("de", "CH");
	
	@Override
	public void start(Stage primaryStage) {
		try {			
			AnchorPane root = (AnchorPane)FXMLLoader.load(
					Main.class.getResource("../views/MainView.fxml"),
					ResourceBundle.getBundle("lang", locale));
			
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("LottoTool");
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

