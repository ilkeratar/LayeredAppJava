package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.abstracts.Logger;
import oopWithNLayeredApp.dataAccess.abstracts.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses = {};

	public CourseManager(CourseDao courseDap, Logger[] loggers) {
		this.courseDao=courseDap;
		this.loggers=loggers;
	}
	
	public void add(Course course) throws Exception{
		for(Course cou: courses) {
			if(course.getName()==cou.getName()) {
				throw new Exception("Course already exists");
			}
		}
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
