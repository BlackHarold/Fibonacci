package home.blackharold.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException extends Exception {

	private static Logger logger = Logger.getLogger("Logging Exception");
	
	LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
