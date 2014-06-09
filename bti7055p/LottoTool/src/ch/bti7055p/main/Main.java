package ch.bti7055p.main;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	public static Main instance = null;

	@Override
	public void start(Stage primaryStage) {
		Main.instance = this;
		this.primaryStage = primaryStage;
		try {

			this.loadView(new Locale("de", "CH"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

	public void loadView(Locale locale) {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(
					Main.class.getResource("../views/MainView.fxml"),
					ResourceBundle.getBundle("lang", locale));

			Scene scene = new Scene(root, 700, 600);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			this.primaryStage.setTitle("LottoTool");
			this.primaryStage.setResizable(false);
			this.primaryStage.setScene(scene);
			this.primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
