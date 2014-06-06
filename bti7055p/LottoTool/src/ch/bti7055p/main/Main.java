package ch.bti7055p.main;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.PopupWindow.AnchorLocation;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../views/MainView.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("LottoTool");
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

package application;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


//public class Main extends Application {
//	
//	private static Locale locale = new Locale("de", "CH");
//	
//	@Override
//	public void start(Stage primaryStage) {
//		try {
//			//AnchorPane root = (AnchorPane)FXMLLoader.load(Main.class.getResource("Main.fxml"));
//			
//			AnchorPane root = (AnchorPane)FXMLLoader.load(
//					Main.class.getResource("Main.fxml"),
//					ResourceBundle.getBundle("lang", locale));
//			
//			Scene scene = new Scene(root,600,600);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.setTitle("Lotto");
//			primaryStage.setResizable(false);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void main(String[] args) {
//		launch(args);
//	}
//}

