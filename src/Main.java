import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.hibernateImpls.HibernateProductRepository;
import entities.concretes.Product;

public class Main {

public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductRepository());
		
		Product product1 = new Product(1, "iPhone", 1000.0, 11);
		Product product2 = new Product(2, "Samsung", 750.0, 11);
		Product product3 = new Product(3, "Solante", 30.0, 12);
		Product product4 = new Product(4, "Avene", 18.0, 12);
		Product product5 = new Product(5, "Nike", 79.9, 13);
		Product product6 = new Product(6, "Adidas", 65.0, 13);
		Product product7 = new Product(7, "Adidas", 65.0, 13);
		Product product8 = new Product(8, "Avene", 18.0, 12);
		Product product9 = new Product(9, "Missha", 20.0, 12);
		Product product10 = new Product(1, "Solante", 17.0, 12);
		Product product11 = new Product(11, "Sun", 15.0, 12);
		Product product12 = new Product(12, "SunPro", 13.9, 12);
		Product product13 = new Product(13, "SunOz", 13.5, 12);
		Product product14 = new Product(14, "New", -55, 13);

		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		productService.add(product5);
		productService.add(product6);
		productService.add(product7);
		productService.add(product8);
		productService.add(product9);
		productService.add(product10);
		productService.add(product11);
		productService.add(product12);
		productService.add(product13);
		productService.add(product14);
		
		
		
		
		System.out.println("\n");

		for (Product product : productService.getAll()) {
			System.out.println(product.getName() + "  " + product.getUnitPrice() + " $" + "\t" + "Kategori No: "+product.getCategoryId());

		}

	}


}
