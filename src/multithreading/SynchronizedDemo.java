package multithreading;

class Sender {
	public void send1(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\t" + msg + "Sent\n");
	}
	
	// Way #2
	public synchronized void send2(String msg)
    {
        System.out.println("Sending\t" + msg );
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\t" + msg + "Sent\n");
    }
}

//Class for send a message using Threads
class ThreadedSend extends Thread {
	private String msg;
	Sender sender;

	// Receives a message object and a string message to be sent
	ThreadedSend(String msg, Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}

	public void run() {
		// Way #1
		// Only one thread can send a message at a time.
		synchronized (sender) {
			sender.send1(msg);
		}
	}
}

public class SynchronizedDemo {

	/**
	 * Multi-threaded programs may often come to a situation where multiple threads
	 * try to access the same resources and finally produce erroneous and unforeseen
	 * results. So it needs to be made sure by some synchronization method that only
	 * one thread can access the resource at a given point of time.
	 * 
	 * Java provides a way of creating threads and synchronizing their task by using
	 * synchronized blocks. Synchronized blocks in Java are marked with the
	 * synchronized keyword. A synchronized block in Java is synchronized on some
	 * object. All synchronized blocks synchronized on the same object can only have
	 * one thread executing inside them at a time. All other threads attempting to
	 * enter the synchronized block are blocked until the thread inside the
	 * synchronized block exits the block.
	 */

	public static void main(String args[]) {
		Sender sender = new Sender();
		ThreadedSend S1 = new ThreadedSend(" Hi ", sender);
		ThreadedSend S2 = new ThreadedSend(" Bye ", sender);

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}
