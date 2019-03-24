package week11.slot01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LearningUIControlsAndEvent extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("BasicUIControls.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 1920, 1080);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
