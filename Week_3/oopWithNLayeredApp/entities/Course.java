package Week_3.oopWithNLayeredApp.entities;

public class Course {
	
	private int id;
	private String name;
	private double price;
	private int categoryId;
	
	
	public Course(int id, String name, double price, int categoryId) {
		this.id = id;
		this.name = name;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
