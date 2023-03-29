package oopWithNLayeredApp.dataAccess.concretes;

import oopWithNLayeredApp.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredApp.dataAccess.abstracts.CourseDao;
import oopWithNLayeredApp.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredApp.entities.Category;
import oopWithNLayeredApp.entities.Course;
import oopWithNLayeredApp.entities.Instructor;

public class JdbcDao implements CategoryDao,CourseDao,InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Added to database with Jdbc. "+instructor.getName());
	}

	@Override
	public void add(Course course) {
		System.out.println("Added to database with Jdbc. "+course.getName());
	}

	@Override
	public void add(Category category) {
		System.out.println("Added to database with Jdbc. "+category.getName());
	}

}
