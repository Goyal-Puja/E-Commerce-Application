
public class Product {
	
	private int productID;
	private String productName;
	private int productPrice;
	
	
	public Product() {
		
	}
	public Product(int productID,String productName,int productPrice){
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductPrice() {
		return productPrice;
	}

	
	public String toString() {
        return "Product{" + "ProductID=" + productID + ", ProductName=" + productName + ", ProductPrice=" + productPrice + '}';
	
	}
	
	
}
