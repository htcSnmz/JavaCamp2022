package Week_3.oopWithNLayeredApp.dataAccess;

import Week_3.oopWithNLayeredApp.entities.Course;

public interface CourseDao {
	void add(Course course);
	void update(Course course);
	void delete(Course course);
	
}
