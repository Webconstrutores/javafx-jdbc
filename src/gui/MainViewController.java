package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem MenuItemAboud;
	
	@FXML
	public void onMenuItemSeller() {
		System.out.println("onMenuItemSeller");
	}
	
	@FXML
	public void onMenuItemDepartment() {
		System.out.println("onMenuItemDepartmentr");
	}
	
	@FXML
	public void onMenuItemAbout() {
		System.out.println("onMenuItemAbout");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
}
