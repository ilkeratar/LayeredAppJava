package oopWithNLayeredApp.core.logging.concretes;

import oopWithNLayeredApp.core.logging.abstracts.Logger;

public class MailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logged to mail: "+message);
	}

}
