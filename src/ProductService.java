import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
	
	
	//System.out.println(product);
	List<Product> products=new ArrayList<>();
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
		products.add(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}
	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
			for(Product p:products)
			{
				if(p.getName().equals(name))
				{
					return p;
				}
			
			}
			return null;	
			}
    public List<String> outOfWarranty() {
        List<String> outOfWarrantyProducts = new ArrayList<>();
        for (Product p : products) {
            if (p.getWarranty() <= 2020) {
                outOfWarrantyProducts.add(p.getName());
            }
        }
        return outOfWarrantyProducts;
    }
    public List<Product> particularPlace(String place) {
        List<Product> particularPlace = new ArrayList<>();
        for (Product p : products) {
            if (p.getPlace().equals(place)) {
            	particularPlace.add(p);
            }
        }
        return particularPlace;
    }
	public List<Product> getProductByWord(String name) {
		// TODO Auto-generated method stub
		String newname=name.toLowerCase();
		List<Product> getProductByWord = new ArrayList<>();
			for(Product p:products)
			{
				if((p.getName().toLowerCase()).contains(newname)||(p.getType().toLowerCase()).contains(newname)||(p.getPlace().toLowerCase()).contains(newname))
				{
					getProductByWord.add(p);
				}		
			}
			return getProductByWord;	
			}
	public void removeProduct(String name) {
	    Iterator<Product> iterator = products.iterator();
	    while (iterator.hasNext()) {
	        Product product = iterator.next();
	        if (product.getName().equalsIgnoreCase(name)) {
	            iterator.remove();
	            System.out.println("Removed product: " + product);
	        }
	    }
	}
    public void updateProductById(int id, Product newProductDetails) {
        if (newProductDetails == null) {
            throw new IllegalArgumentException("Product details cannot be null");
        }

        boolean productFound = false;

        for (Product product : products) {
            if (product.getId() == id) {
                // Update fields with new product details
                product.setName(newProductDetails.getName());
                product.setType(newProductDetails.getType());
                product.setPlace(newProductDetails.getPlace());
                product.setWarranty(newProductDetails.getWarranty());
                productFound = true;
                break; // Exit the loop once the product is found and updated
            }
        }

        if (!productFound) {
            throw new RuntimeException("Product not found with ID: " + id);
        }
    }
    public void removeProductForEach(String name) {
        List<Product> productsToRemove = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                productsToRemove.add(product);
            }
        }
       
        products.removeAll(productsToRemove);
        for (Product removedProduct : productsToRemove) {
            System.out.println("Removed product: " + removedProduct);
        }
    }
		}

