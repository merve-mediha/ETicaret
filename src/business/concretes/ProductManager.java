package business.concretes;

import java.util.List;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductRepository;
import entities.concretes.Product;

public class ProductManager implements ProductService{
	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		super();
		this.setProductRepository(productRepository);
	}

	

	private boolean isNameExists(String name) {
		boolean exist = false;
		for (Product urun : productRepository.getAll()) {
			if (urun.getName() == name) {
				exist = true;
			}

		}
		return exist;
	}
	
	
	
	private Integer isCategoryIdSame(int categoryId) {
		int count=0;
		for (Product urunler : productRepository.getAll()) {
			if(urunler.getCategoryId() == categoryId) {
				count++;
			}
		}
		return count;
	}
	
	private boolean checkUnitPrice(Product product) {
		boolean isPositive = false;
		if(product.getUnitPrice()>0) {
			isPositive=true;
			
		}
		
		return isPositive;
		
	}
	
	
	

	@Override
	public void add(Product product) {
		if (!isNameExists(product.getName())&&(checkUnitPrice(product))&&(isCategoryIdSame(product.getCategoryId())<5)) {
			productRepository.add(product);

		

		} else {
			System.out.println(product.getName() + "  Hata! Ürün Eklenemez");
		}
		
		
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);

	}

	@Override
	public void upDate(Product product) {
		productRepository.upDate(product);

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

}
