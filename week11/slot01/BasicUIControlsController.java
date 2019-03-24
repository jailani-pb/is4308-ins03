package week11.slot01;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BasicUIControlsController {

	@FXML
	TextField usernameTextField;
	@FXML
	PasswordField passwordPasswordField;
	@FXML
	Label messageLabel;
	
	@FXML public void login() {
		String username = usernameTextField.getText().trim().toLowerCase();
		String password = passwordPasswordField.getText();
		if(username.equalsIgnoreCase("jailani") && password.equals("rahman")) {
			messageLabel.setStyle("-fx-background-color: green");
			messageLabel.setText("Correct Username and Password");
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
