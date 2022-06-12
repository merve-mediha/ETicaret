package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Product;

public interface ProductRepository {
	void add(Product product) ;
	void delete(Product product);
	void upDate(Product product);
	List<Product> getAll();
	Product getById(int id);
	

}

