package home.blackharold.thread.push_pull;

public class Main {

	public static void main(String[] args) {
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(c.getCount()<5) {
					c.setCount();
				}
				c.setStop();
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!c.isStop()) {
					c.setFlag();
					
				}
				
			}
		});

		t1.start();
		t2.start();
	}

}
