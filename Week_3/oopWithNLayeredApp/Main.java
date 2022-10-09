package Week_3.oopWithNLayeredApp;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import Week_3.oopWithNLayeredApp.business.CourseCategoryManager;
import Week_3.oopWithNLayeredApp.business.CourseManager;
import Week_3.oopWithNLayeredApp.core.logging.FileLogger;
import Week_3.oopWithNLayeredApp.core.logging.DatabaseLogger;
import Week_3.oopWithNLayeredApp.dataAccess.HibernateCourseDao;
import Week_3.oopWithNLayeredApp.dataAccess.JDBCCourseCategoryDao;
import Week_3.oopWithNLayeredApp.entities.Course;
import Week_3.oopWithNLayeredApp.entities.CourseCategory;
import Week_3.oopWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		CourseCategory courseCategory = new CourseCategory(1, "Backend");
		CourseCategory courseCategory2 = new CourseCategory(2, "Frontend");
		List<CourseCategory> categories = new ArrayList<>();
		categories.add(courseCategory);
		categories.add(courseCategory2);
		
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 1500.0, 1);
		Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 3500.0, 1);
 
		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		
		Instructor instructor = new Instructor(1, "engin@kodlama.io", "123456", "Engin", "Demiroğ", "İstanbul", new ArrayList<>(List.of(1,2)));
		
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), new FileLogger(), courses);
		//courseManager.add(course1);
		courseManager.add(new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 2200.0, 2));
		
		
		CourseCategoryManager categoryManager = new CourseCategoryManager(new JDBCCourseCategoryDao(), new DatabaseLogger(), categories);
		//categoryManager.add(courseCategory);
		categoryManager.add(new CourseCategory(3, "Machine Learning"));
	}

}
