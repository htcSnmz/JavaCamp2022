package Week_3.oopWithNLayeredApp.business;

import java.util.List;

import Week_3.oopWithNLayeredApp.core.logging.Logger;
import Week_3.oopWithNLayeredApp.dataAccess.CourseCategoryDao;
import Week_3.oopWithNLayeredApp.entities.CourseCategory;

public class CourseCategoryManager {
	
	private CourseCategoryDao categoryDao;
	private Logger logger;
	private List<CourseCategory> categories;
	
	public CourseCategoryManager(CourseCategoryDao categoryDao, Logger logger, List<CourseCategory> categories) {
		this.logger = logger;
		this.categoryDao = categoryDao;
		this.categories = categories;
	}
	
	public void add(CourseCategory category) throws Exception {
		for(CourseCategory courseCategory : categories) {
			if(courseCategory.getName().equals(category.getName())) {
				throw new Exception("This category already saved.");
			}
		}
		categoryDao.add(category);
		logger.log(category.getName());
	}
}
