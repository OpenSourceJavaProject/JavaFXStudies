package fxml.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Rameez
 */
public class sampleController implements Initializable {
    
    @FXML
    private Label label;
    public Button button;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("run some code the user doesn't see");
        button.setText("Stop touching me");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
