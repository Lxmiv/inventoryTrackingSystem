package maksim.InventoryManagementSystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public Label theLabel;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("It has been clicked!@");
    }

    public void printHelloWorld(MouseEvent mouseEvent) {
        System.out.println("hello world");
        theLabel.setText("you clicked me");
    }
}