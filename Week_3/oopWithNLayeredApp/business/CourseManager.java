package Week_3.oopWithNLayeredApp.business;

import java.util.List;

import Week_3.oopWithNLayeredApp.core.logging.Logger;
import Week_3.oopWithNLayeredApp.dataAccess.CourseDao;
import Week_3.oopWithNLayeredApp.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger logger;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger logger, List<Course> courses) {
		this.logger = logger;
		this.courseDao = courseDao;
		this.courses = courses;
	}
	
	public void add(Course course) throws Exception {
		if(course.getPrice() < 0) {
			throw new Exception("The price of the course cannot be below zero.");
		}
		
		for(Course c: courses) {
			if(c.getName().equals(course.getName())) {
				throw new Exception("This course already saved.");
			}	
		}
		courseDao.add(course);
		logger.log(course.getName());
	}

}
