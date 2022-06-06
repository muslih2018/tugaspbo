
import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent; 
import javafx.scene.Scene;

import javafx.stage.Stage; 

public class controlbooking {
    
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


public void switchtolayout2 (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("abotus.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}

public void switchtolayoutbooking1 (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("table.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}
public void switchtolayoutbooking2 (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("table2.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}
public void switchtolayoutbooking3 (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("table3.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}
}
