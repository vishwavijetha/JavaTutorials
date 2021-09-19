package multithreading;

public class ThreadCreationDemo {

	/**
	 * Multithreading is a Java feature that allows concurrent execution of two or
	 * more parts of a program for maximum utilization of CPU. Each part of such
	 * program is called a thread. So, threads are light-weight processes within a
	 * process.
	 * 
	 * Threads can be created by using two mechanisms :
	 * 
	 * Extending the Thread class Implementing the Runnable Interface
	 */
	public static void main(String[] args) {
		int n = 3; // Number of threads
		System.out.println("Thread creation by implementing Runnable interface: \n");
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new MultithreadingDemo2());
			object.start();
		}
		System.out.println("\n\nThread creation by extending Thread class: \n");
		for (int i = 0; i < n; i++) {
			MultithreadingDemo1 object = new MultithreadingDemo1();
			object.start();
		}
	}

}

class MultithreadingDemo1 extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			Thread.sleep(2000);
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

class MultithreadingDemo2 implements Runnable {
	@Override
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
