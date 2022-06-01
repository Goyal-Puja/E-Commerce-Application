import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Admin {
	
	ArrayList<Product> productArr =new ArrayList<Product>();
	
	public void addProduct(Product p) {
        
        if (!find(p.getProductID())) {
            productArr.add(p);
 
        } else {
            System.out.println("Product already exists in the Store");
        }
    }
	
	 public boolean find(int ID) {
		 
	      
	        for (Product l : productArr) {
	        
	            if (l.getProductID() == ID) {
	                System.out.println(l);
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 public Product searchProduct(int idNumber) {
	       
	        for (Product l : productArr) {
	         
	            if (l.getProductID() == idNumber) {
	                return l;
	            }
	        }
	        return null;
	    }
	 
	 public void delete(int recIdNumber) {
	        Product productDel = null;
	       
	        for (Product ll : productArr) {
	           
	            if (ll.getProductID() == recIdNumber) {
	                productDel = ll;
	            }
	        }
	     
	        if (productDel == null) {
	            System.out.println("Invalid Product Id");
	        } else {
	            productArr.remove(productDel);
	            System.out.println("Successfully removed product from the Store");
	        }
	    }
	 
	 public void update(int id, Scanner input) {
		 
	        if (find(id)) {
	            Product rec = searchProduct(id);
	 
	            System.out.print("What is the new Product id Number (integer value)? ");
	            int productID = input.nextInt();
	            System.out.print("What is the new Product name : ");
	            String productName = input.nextLine();
	            input.nextLine();
	            System.out.print("What is the new Product price (integer value) ? ");
	            int productPrice = input.nextInt();
	 
	            rec.setProductID(productID);
	            rec.setProductName(productName);
	            rec.setProductPrice(productPrice);
	            System.out.println("Record Updated Successfully");
	        } else {
	            System.out.println("Record Not Found in the Record list");
	        }
	    }
	 
	    public void display() {
	        
	        if (productArr.isEmpty()) {
	            System.out.println("The list has no records\n");
	        }
	      
	        for (Product product : productArr) {
	          
	            System.out.println(product.toString());
	        }
	    }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Admin a = new Admin();
		Product p = new Product();
		
		Scanner input = new Scanner(System.in);
		 
        //Creating Option Integer Variable.
        int option = 0;
        //Do - While loop
        do {
            menu();
            option = input.nextInt();
 
            switch (option) {
                case 1:
                    System.out.print("What is the Product id Number (integer value)? ");
                    int productID = input.nextInt();
                    System.out.print("What is the Product name :");
                    String productName = input.nextLine();
                   
                    System.out.print("What is the Product Price (integer value)? ");
                    int productPrice = input.nextInt();
                   
                    p = new Product(productID, productName, productPrice);
                   
                    a.addProduct(p);
                    System.out.println(p.toString());
                    break;
                case 2:
                    System.out.print("What is the Product id number(integer value)? ");
                    int pID = input.nextInt();
                    a.delete(pID);
                    break;
                case 3:
                    System.out.print("What is the record id number(integer value)? ");
                    int pIdNo = input.nextInt();
                    a.update(pIdNo, input);
                    break;
                case 4:
                	a.display();
                	break;
              
                case 5:
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid input\n");
                    break;
 
            }
        } while (option != 5);

		
}
	public static void menu() {
		System.out.println("MENU");
        System.out.println("1: Add Product into the Store");
        System.out.println("2: Remove Product from Store");
        System.out.println("3: Update Product into the Store");
        System.out.println("4: Display all the product in the store :");
        System.out.println("5: Exit program");
        System.out.print("Enter your selection : ");
	}

	}