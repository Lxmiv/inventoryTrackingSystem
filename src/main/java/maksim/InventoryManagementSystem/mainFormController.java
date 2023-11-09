package maksim.InventoryManagementSystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class mainFormController implements Initializable {

    @FXML
    public Label theLabel;
    @FXML
    private Label welcomeText;


    public void printHelloWorld(MouseEvent mouseEvent) {
        System.out.println("hello world");
        theLabel.setText("you clicked me");
    }

    /**
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}