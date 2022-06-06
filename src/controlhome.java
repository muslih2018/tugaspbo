

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent; 
import javafx.scene.Scene;

import javafx.stage.Stage; 
import java.awt.*;


public class controlhome {
    
private Stage stage;
private Scene scene;

public void switchtolayout (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BOOKING.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchtolayout2 (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("abotus.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}

@FXML

public void openlink3 (ActionEvent event) throws URISyntaxException, IOException {
System.out.println("link clicked");
Desktop.getDesktop().browse(new URI("https://youtu.be/b9QQjivRtpI"));
}


}
