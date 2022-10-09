package Week_3.oopWithNLayeredApp.entities;

import java.util.List;

public class Instructor extends Person{
	
	List<Integer> courses;
	
	public Instructor(int id, String email, String password, String firstName, String lastName, String address, List<Integer> courses) {
		super(id, email, password, firstName, lastName, address);
		this.courses = courses;
	}

	public List<Integer> getCourses() {
		return courses;
	}

	public void setCourses(List<Integer> courses) {
		this.courses = courses;
	}
}
