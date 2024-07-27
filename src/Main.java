import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService productService=new ProductService();
		System.out.println(productService);
		Product product=new Product("Dell","Laptop","Ooty",2023);
		//productService.addProduct(product);
		//All these are anonyms objects
		productService.addProduct(new Product(1,"Dell", "Laptop", "Ooty", 2023));
	    productService.addProduct(new Product(2,"HP", "Desktop", "Mumbai", 2022));
	    productService.addProduct(new Product(3,"Apple", "Tablet", "Delhi", 2021));
	    productService.addProduct(new Product(4,"Lenovo", "Laptop", "Bangalore", 2020));
	    productService.addProduct(new Product(5,"Asus", "Monitor", "Chennai", 2019));
        productService.addProduct(new Product(6,"Acer", "Laptop", "Hyderabad", 2018));
        productService.addProduct(new Product(7,"Samsung", "Printer", "Pune", 2017));
	    productService.addProduct(new Product(8,"Microsoft", "Desktop", "Kolkata", 2016));
	    productService.addProduct(new Product(9,"Sony", "Tablet", "Jaipur", 2015));
	    productService.addProduct(new Product(10,"Toshiba", "Monitor", "Ahmedabad", 2014));
	    productService.addProduct(new Product(11,"Toshibanew", "Laptop", "Bangalore", 2024));
		System.out.println("Get all products");
	    List<Product> productList=productService.getAllProducts();
	    
	    for(Product p:productList)
	    {
	    	System.out.println(p);
	    }
	    System.out.println("Get particular product");
	    Product productByName=productService.getProductByName("Toshiba");
	    System.out.println(productByName);
	    System.out.println("Warranty completed");
	    System.out.println(productService.outOfWarranty());
	    System.out.println(productService.particularPlace("Chennai"));
	    
	    System.out.println(productService.getProductByWord("Toshiba"));
	    
	    productService.removeProductForEach("Toshiba");
	    productService.removeProduct("Dell");
	    
	    Product updatedProduct = new Product("New Name", "New Type", "New Place", 2);
        productService.updateProductById(4, updatedProduct);
	}

}
