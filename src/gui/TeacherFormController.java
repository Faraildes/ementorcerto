package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TeacherFormController implements Initializable {

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtCpf;
	
	@FXML
	private TextField txtPhone;
	
	@FXML
	private TextField txtSalary;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Label labelErrorCpf;
	
	@FXML
	private Label labelErrorPhone;
	
	@FXML
	private Label labelErrorSalary;
	
	@FXML
	private Button btCancel;
	
	@FXML
	private Button btSave;
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("onBtCancelAction");
	}
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("onBtSaveAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
		Constraints.setTextFieldMaxLength(txtCpf, 11);
		Constraints.setTextFieldMaxLength(txtPhone, 15);
		Constraints.setTextFieldDouble(txtSalary);
	}
}
