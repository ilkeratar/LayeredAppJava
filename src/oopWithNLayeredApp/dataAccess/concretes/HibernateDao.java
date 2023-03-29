package oopWithNLayeredApp.dataAccess.concretes;

import oopWithNLayeredApp.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Instructor;



import oopWithNLayeredApp.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredApp.dataAccess.abstracts.CourseDao;

public class HibernateDao implements CategoryDao,CourseDao,InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added to database with hibernate. "+instructor.getName());
	}

	@Override
	public void add(Course course) {
		System.out.println("Added to database with hibernate. "+course.getName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Added to database with hibernate. "+category.getName());
	}

	


}
