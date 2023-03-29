package oopWithNLayeredApp.business;


import oopWithNLayeredApp.core.logging.abstracts.Logger;
import oopWithNLayeredApp.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories = {};

	public CategoryManager(CategoryDao categorydao, Logger[] loggers) {
		this.categoryDao=categorydao;
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception{
		for(Category cat: categories) {
			if(category.getName()==cat.getName()) {
				throw new Exception("Category already exists");
			}
		}
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

}
