package oopWithNLayeredApp.ui;
import oopWithNLayeredApp.business.CategoryManager;
import oopWithNLayeredApp.core.logging.concretes.*;
import oopWithNLayeredApp.core.logging.abstracts.*;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.dataAccess.concretes.HibernateDao;

public class Main {

	public static void main(String[] args) throws Exception {
		Category newCategory=new Category(1,"tempCat");
		Category newCategory1=new Category(2,"tempCat2");
		Category newCategory2=new Category(3,"tempCat");
		
		Logger[] loggers = {
				new DatabaseLogger(),
				new FileLogger(),
				new MailLogger()
		};
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(),loggers);
		categoryManager.add(newCategory);
		categoryManager.add(newCategory1);
		categoryManager.add(newCategory2);
	}

}
