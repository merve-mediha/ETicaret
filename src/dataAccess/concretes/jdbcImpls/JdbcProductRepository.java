package dataAccess.concretes.jdbcImpls;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class JdbcProductRepository implements ProductRepository {

	List<Product> products;

	public JdbcProductRepository() {
		products = new ArrayList<Product>();
	} 

	@Override
	public void add(Product product) {
		System.out.println("Jdbc ile eklenen �r�n");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Jdbc ile silinen �r�n");
		
	}

	@Override
	public void upDate(Product product) {
		Product updatedProduct = getById(product.getId());
		updatedProduct.setName(product.getName());
		updatedProduct.setCategoryId(product.getCategoryId());
		updatedProduct.setUnitPrice(product.getUnitPrice());
		System.out.println("Jdbc ile g�ncellenen �r�n");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
