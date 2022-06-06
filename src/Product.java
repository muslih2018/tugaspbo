



import javafx.beans.property.SimpleStringProperty;
// Membuat class untuk enkapsulasi properti 
public class Product {
    private SimpleStringProperty productName;
    private SimpleStringProperty productPrice;
    private SimpleStringProperty productQuantity;
    private SimpleStringProperty productQuantity1;
    private SimpleStringProperty productQuantity2;


//construktor
    public Product(String productName, String productPrice, String productQuantity,String productQuantity1,String productQuantity2) {
        this.productName =new SimpleStringProperty(productName) ;
        this.productPrice = new SimpleStringProperty(productPrice);
        this.productQuantity = new SimpleStringProperty(productQuantity);
        this.productQuantity1 = new SimpleStringProperty(productQuantity1);
        this.productQuantity2 = new SimpleStringProperty(productQuantity2);
    }
//getter and setter
    public String  getProductName() {
		return productName.get();
	}

    public void setProductName(String productName) {
        this.productName =new SimpleStringProperty(productName) ;
	}


    
    public String  getProductPrice() {
		return productPrice.get();
	}

    public void setProductPrice(String productPrice) {
        this.productPrice = new SimpleStringProperty(productPrice);
	}

       
    public String  getProductQuantity() {
		return productQuantity.get();
	}

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = new SimpleStringProperty(productQuantity);
	}
    public String  getProductQuantity1() {
		return productQuantity1.get();
	}

    public void setProductQuantity1(String productQuantity1) {
        this.productQuantity1 = new SimpleStringProperty(productQuantity1);
	}
    public String  getProductQuantity2() {
		return productQuantity2.get();
	}

    public void setProductQuantity2(String productQuantity2) {
        this.productQuantity2 = new SimpleStringProperty(productQuantity2);
	}



	
}
