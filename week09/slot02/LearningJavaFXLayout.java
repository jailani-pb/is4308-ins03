package week09.slot02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LearningJavaFXLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		FXMLLoader fxmlLoader =
//			new FXMLLoader(getClass().getResource("HBoxLayout.fxml"));
//		FXMLLoader fxmlLoader =
//			new FXMLLoader(getClass().getResource("VBoxLayout.fxml"));
//		FXMLLoader fxmlLoader =
//			new FXMLLoader(getClass().getResource("FlowLayout.fxml"));
//		FXMLLoader fxmlLoader =
//			new FXMLLoader(getClass().getResource("GridLayout.fxml"));
		FXMLLoader fxmlLoader =
			new FXMLLoader(getClass().getResource("BorderLayout.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}


