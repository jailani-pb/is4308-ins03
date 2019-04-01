package week13.slot01.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import week13.slot01.ProductApplication;
import javafx.scene.control.Label;

public class ProductManagementController {

	@FXML Label usernameLabel;

	@FXML public void logout() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("../view/Login.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root, 800, 600);
		ProductApplication.primaryStage.setScene(scene);
		ProductApplication.primaryStage.show();
	}
	
	public void setUsername(String username) {
		usernameLabel.setText(username);
	}

}
