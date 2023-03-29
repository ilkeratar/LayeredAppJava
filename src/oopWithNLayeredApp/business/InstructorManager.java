package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.abstracts.Logger;
import oopWithNLayeredApp.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	private Instructor[] instructors = {};

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao=instructorDao;
		this.loggers=loggers;
	}
	
	public void add(Instructor instructor) throws Exception{
		for(Instructor inst: instructors) {
			if(instructor.getName()==inst.getName()) {
				throw new Exception("Instructor already exists");
			}
		}
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}
