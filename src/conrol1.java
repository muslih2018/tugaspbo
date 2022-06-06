//controler untuk sceen 1
import java.io.IOException;
import java.net.URISyntaxException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;

import javafx.stage.Stage; 
import java.net.URI;
import java.awt.*;



public class conrol1 {
    //login  
    @FXML
  private TextField  nameTextfield;
  @FXML
  private TextField userPasswordField;

  @FXML
  private Label messageLabel;




  private Stage stage;
    private Scene scene;







public void login (ActionEvent event) throws IOException {
 

    if(userPasswordField.getText().equals("muslih2020")){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ggg.fxml"));
Parent root = fxmlLoader.load();



stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
scene=new Scene(root);
stage.setScene(scene);
stage.show();

    }

    else{
        messageLabel.setText("Silahkan periksa kembali password anda");

    }
  
    
 




}



///link
@FXML

private Hyperlink hyperlink;



public void openlink (ActionEvent event) throws URISyntaxException, IOException {
System.out.println("link clicked");
Desktop.getDesktop().browse(new URI("https://wa.link/q8y7gv"));
}

























}
