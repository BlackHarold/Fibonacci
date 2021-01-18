package home.blackharold.exceptions;

public class InheritingExceptions {

	public void f() throws SimpleException {
		System.out.println("Start SimpleException from f()");
		throw new SimpleException();
	}
	
	public void g() throws SimpleException {
		System.out.println("Start SimpleException from g()");
		throw new SimpleException("Exception from g() ");
	}
	
	public void l() throws LoggingException {
		System.out.println("Start LoggingException from l()");
		throw new LoggingException();
	}

	public static void main(String[] args) {
		InheritingExceptions ie = new InheritingExceptions();
		
		try {
			ie.l();
		} catch (LoggingException e1) {
			e1.printStackTrace();
		}
			
		
		
		try {
				ie.f();
			} catch (SimpleException e) {
				e.printStackTrace(System.out);
			}			
		
		
		try {
			ie.g();
		} catch (SimpleException e) {
			e.printStackTrace();
		}

	}

}
