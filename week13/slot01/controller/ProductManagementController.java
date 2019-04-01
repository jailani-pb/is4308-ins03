package week13.slot01.controller;

import java.io.IOException;
import java.util.List;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import week13.slot01.ProductApplication;
import week13.slot01.model.Product;
import week13.slot01.repository.ConnectDatabase;
import javafx.scene.control.*;

public class ProductManagementController {

	@FXML Label usernameLabel;
	@FXML TextField nameTextField, priceTextField;
	@FXML ComboBox<String> categoryComboBox;
	@FXML CheckBox inStockCheckBox;
	@FXML ListView<Product> productsListView;

	public void initialize() {
		List<Product> productsList = ConnectDatabase.getAllProducts();
		if(productsList != null) {
			productsListView.getItems().addAll(productsList);
		}
	}
	
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

	@FXML public void add() {
		String name = nameTextField.getText();
		double price = Double.parseDouble(priceTextField.getText());
		String category = categoryComboBox.getSelectionModel().getSelectedItem();
		boolean inStock = inStockCheckBox.isSelected();
		if(!name.trim().equals("") && price > 0.0 
				&& !category.trim().equals("")) {
			ConnectDatabase.addProduct(name, price, category, inStock);
			Product product = new Product(name, price, category, inStock);
			productsListView.getItems().add(product);
		}
	}

	@FXML public void update() {}

	@FXML public void delete() {}

}
