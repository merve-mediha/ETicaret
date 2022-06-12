package dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository {

	List<Product> products;
	public HibernateProductRepository() {
		products = new ArrayList<Product>();
	}
	

	@Override
	public void add(Product product) {
		products.add(product);
		System.out.println("Hibernate ile eklenen ürün");
		
		
	}

	@Override
	public void delete(Product product) {
		products.remove(product);
		System.out.println("Hibernate ile silinen ürün");
		
	}

	@Override
	public void upDate(Product product) {
		Product productUpDate= getById(product.getId());
		productUpDate.setName(product.getName());
		productUpDate.setUnitPrice(product.getUnitPrice());
		productUpDate.setCategoryId(product.getCategoryId());
		System.out.println("Hibernate ile güncellenen ürün");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public Product getById(int id) {
		Product findToProduct = null;
		for(Product product:products) {
			if(product.getId()==id) {
				findToProduct=product;
			}
		}
		return findToProduct;
	}
}
