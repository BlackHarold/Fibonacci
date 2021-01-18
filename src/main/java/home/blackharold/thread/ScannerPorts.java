package home.blackharold.thread;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScannerPorts {
	
	private final static String HOST = "localhost";
	private static String hostName = null;

	public static void main(String[] args) {

		
		ExecutorService executorService = Executors.newFixedThreadPool(20000);
		try {
			hostName = InetAddress.getByName(HOST).getHostName();
		} catch (UnknownHostException e) {
			System.err.println("hostName error");
			e.printStackTrace();
		}

		System.out.println("All tastks submitted ----------->");
		for (int i = 0; i < 65535; i++)
			executorService.submit(new ConnectionPort(hostName, i));
		executorService.shutdown();

		
		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ConnectionPort implements Runnable {

	private String hostName;
	private int port;

	public ConnectionPort(String hostName, int i) {
		this.hostName = hostName;
		port = i;
	}

	@Override
	public void run() {
		try {
			
			Socket socket = new Socket(hostName, port);
			System.out.println(hostName + " is listening on port " + port);
			socket.close();
		} catch (IOException e) {
//			System.err.println(hostName + " is not avaliable on " + port);
//			e.printStackTrace();
		}

	}

}
