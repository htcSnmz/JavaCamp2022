package Week_3.oopWithNLayeredApp.dataAccess;

import Week_3.oopWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("The course added by Hibernate: " + course.getName());
		
	}

	@Override
	public void update(Course course) {
		
	}

	@Override
	public void delete(Course course) {
		
		
	}

}
