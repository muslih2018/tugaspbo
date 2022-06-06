
import javafx.application.Application; 

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage; 






                                                                                                         
public class App extends Application{ 
@Override 
public void start(Stage stage) {
   try{

   Parent root = FXMLLoader.load(getClass().getResource("oop.fxml"));
  Scene scene=new Scene(root);
  stage.setScene(scene);
  stage.setTitle("Smart rental");
  Image icon=new Image(getClass().getResourceAsStream("20220524_174502.png"));
  stage.getIcons().add(icon);
  stage.show()





 ;

}
catch(Exception e){
   e.printStackTrace();

}


}


public static void main(String[]args) throws Exception { 
   launch(args);}
   
}
