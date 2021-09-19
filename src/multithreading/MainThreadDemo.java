package multithreading;

/**
 * Priorities in threads is a concept where each thread is having a priority
 * which in layman’s language one can say every object is having priority here
 * which is represented by numbers ranging from 1 to 10.
 * 
 * The default priority is set to 5 (NORM_PRIORITY) as excepted. Minimum priority is set to 0.
 * Maximum priority is set to 10.
 *
 */
//Class 1
//Main class extending thread class
public class MainThreadDemo extends Thread {

	// Main driver method
	public static void main(String[] args) {

		// Getting reference to Main thread
		Thread t = Thread.currentThread();

		// Getting name of Main thread
		System.out.println("Current thread: " + t.getName());

		// Changing the name of Main thread
		t.setName("Vishwa");
		System.out.println("After name change: " + t.getName());

		// Getting priority of Main thread
		System.out.println("Main thread priority: " + t.getPriority());

		// Setting priority of Main thread to MAX(10)
		t.setPriority(MAX_PRIORITY);

		// Print and display the main thread priority
		System.out.println("Main thread new priority: " + t.getPriority());

		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}

		// Main thread creating a child thread
		Thread ct = new Thread() {
			// run() method of a thread
			public void run() {

				for (int i = 0; i < 5; i++) {
					System.out.println("Child thread");
				}
			}
		};

		// Getting priority of child thread
		// which will be inherited from Main thread
		// as it is created by Main thread
		System.out.println("Child thread priority: " + ct.getPriority());

		// Setting priority of Main thread to MIN(1)
		ct.setPriority(MIN_PRIORITY);

		System.out.println("Child thread new priority: " + ct.getPriority());

		// Starting child thread
		ct.start();
	}
}

//Class 2
//Helper class extending Thread class
//Child Thread class
class ChildThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			// Print statement whenever child thread is
			// called
			System.out.println("Child thread");
		}
	}
}
