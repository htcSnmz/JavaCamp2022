package Week_3.oopWithNLayeredApp.dataAccess;

import Week_3.oopWithNLayeredApp.entities.CourseCategory;

public interface CourseCategoryDao {
	void add(CourseCategory category);
	void update(CourseCategory category);
	void delete(CourseCategory category);
}
