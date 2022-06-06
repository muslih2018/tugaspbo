
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent; 
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage; 
import java.awt.*;






public class controlaboutus {
    private Stage stage;
    private Scene scene;
    @FXML

private Hyperlink hyperlink;


    public void switchtolayout (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Home.fxml"));
        Parent root = fxmlLoader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchtolayout2 (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BOOKING.fxml"));
        Parent root = fxmlLoader.load();
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    ///link


@FXML
public void openlink1 (ActionEvent event) throws URISyntaxException, IOException {
System.out.println("link clicked");
Desktop.getDesktop().browse(new URI("https://www.instagram.com/p/CUPgv2Hl5bS/?igshid=YmMyMTA2M2Y="));
}

@FXML
public void openlink2 (ActionEvent event) throws URISyntaxException, IOException {
System.out.println("link clicked");
Desktop.getDesktop().browse(new URI("https://wa.link/q8y7gv"));
}

@FXML
public void openlink3 (ActionEvent event) throws URISyntaxException, IOException {
System.out.println("link clicked");
Desktop.getDesktop().browse(new URI("https://youtube.com/channel/UCJElhojQEysl1BYwLJXuCLw"));
}





   
}
