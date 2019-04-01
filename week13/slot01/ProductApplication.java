package week13.slot01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProductApplication extends Application {

	public static Stage primaryStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = 
//				new FXMLLoader(getClass().getResource("view/Login.fxml"));
				new FXMLLoader(getClass().getResource("view/ProductManagement.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		this.primaryStage = primaryStage;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
