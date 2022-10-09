package Week_3.oopWithNLayeredApp.dataAccess;

import Week_3.oopWithNLayeredApp.entities.CourseCategory;

public class HibernateCourseCategoryDao implements CourseCategoryDao{

	@Override
	public void add(CourseCategory category) {
		System.out.println("The course added by Hibernate: " + category.getName());
		
	}

	@Override
	public void update(CourseCategory category) {
		
		
	}

	@Override
	public void delete(CourseCategory category) {
		
		
	}

}
