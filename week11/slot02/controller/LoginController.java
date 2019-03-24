package week11.slot02.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import week11.slot02.ProductApplication;

public class LoginController {

	@FXML
	TextField usernameTextField;
	@FXML
	PasswordField passwordPasswordField;
	@FXML
	Label messageLabel;
	
	@FXML public void login() throws IOException {
		String username = usernameTextField.getText().trim().toLowerCase();
		String password = passwordPasswordField.getText();
		if(username.equalsIgnoreCase("jailani") && password.equals("rahman")) {
//			messageLabel.setStyle("-fx-background-color: green");
//			messageLabel.setText("Correct Username and Password");
			FXMLLoader fxmlLoader = 
				new FXMLLoader(getClass()
						.getResource("../view/ProductManagement.fxml"));
			Parent root = fxmlLoader.load();
			
			ProductManagementController pmc = fxmlLoader.getController();
			pmc.setUsername(username);
			
			Scene scene = new Scene(root, 800, 600);
			ProductApplication.primaryStage.setScene(scene);
			ProductApplication.primaryStage.show();
		} else {
			messageLabel.setStyle("-fx-background-color: red");
			messageLabel.setText("Wrong Username and Password");
		}
	}

	@FXML public void clear() {
		usernameTextField.setText("");
		passwordPasswordField.setText("");
		messageLabel.setText("");
		messageLabel.setStyle("-fx-background-color: light-gray");
	}
	
}
