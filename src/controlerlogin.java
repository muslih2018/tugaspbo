///controler scene 2 ke home





import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent; 
import javafx.scene.Scene;

import javafx.stage.Stage; 

public class  controlerlogin {



private Stage stage;
private Scene scene;



public void switchtolayout (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}

}




