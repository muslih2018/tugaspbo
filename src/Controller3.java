

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import javafx.scene.Node;


public class Controller3 implements Initializable {
    public TableView<Product> tableview;
    public TableColumn<Product,String>colName;
    public TableColumn<Product,String> colPrice;    
    public TableColumn<Product,String> colQuantity;
    public TableColumn<Product,String>colQuantity1;
    public TableColumn<Product,String>colQuantity2;

    //add data
    public TextField textfieldName;
    public TextField textfieldPrice;
    public TextField textfieldQuantity;
    public TextField textfieldQuantity1;
    public TextField textfieldQuantity2;

    
private Stage stage;
private Scene scene;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        colName.setCellValueFactory(new PropertyValueFactory<>("ProductName") );
        colPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice") );
        colQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity") );
        colQuantity1.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity1") );
        colQuantity2.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity2") );
        tableview.setItems(observableList);
    }
    ////////
    ObservableList<Product> observableList=FXCollections.observableArrayList(
        new Product("muslih","12 APRIL 2080","08.00 WIB-09.00 WIB","081342575803","Rp.100.000")
   
    );

//method button action add
public void buttonAdd(ActionEvent actionEvent) {

        Product product=new Product(textfieldName.getText(),(textfieldPrice.getText()),(textfieldQuantity.getText()),(textfieldQuantity1.getText()),("Rp."+textfieldQuantity2.getText()+"00.000"));
        tableview.getItems().add(product);}


    //method button action remove
public void buttonRemove(ActionEvent actionEvent) {
    ObservableList<Product> allProduct,SingleProduct;
    allProduct=tableview.getItems();
    SingleProduct=tableview.getSelectionModel().getSelectedItems();
    SingleProduct.forEach(allProduct::remove);
    

    
    
}


public void switchtolayout (ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BOOKING.fxml"));
    Parent root = fxmlLoader.load();
    stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(root);
    stage.setScene(scene);
    stage.show();
}


 
}
