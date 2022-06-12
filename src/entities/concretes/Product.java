package entities.concretes;

public class Product {
	public int id;
	public String name;
	public double unitPrice;
	public int categoryId;
	
	
	
	public Product() {
		super();
	}
	
	
	public Product(int id, String name, double unitPrice, int categoryId) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.categoryId = categoryId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	

}
