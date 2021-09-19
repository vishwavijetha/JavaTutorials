package multithreading;

/**
 * 1. New Thread: When a new thread is created, it is in the new state. The
 * thread has not yet started to run when thread is in this state. When a thread
 * lies in the new state, it’s code is yet to be run and hasn’t started to
 * execute.
 * 
 * 2. Runnable State: A thread that is ready to run is moved to runnable state.
 * In this state, a thread might actually be running or it might be ready run at
 * any instant of time. It is the responsibility of the thread scheduler to give
 * the thread, time to run. A multi-threaded program allocates a fixed amount of
 * time to each individual thread. Each and every thread runs for a short while
 * and then pauses and relinquishes the CPU to another thread, so that other
 * threads can get a chance to run. When this happens, all such threads that are
 * ready to run, waiting for the CPU and the currently running thread lies in
 * runnable state.
 * 
 * 3. Blocked/Waiting state:When a thread is temporarily inactive, then it’s in
 * one of the following states: Blocked Waiting For example, when a thread is
 * waiting for I/O to complete, it lies in the blocked state. It’s the
 * responsibility of the thread scheduler to reactivate and schedule a
 * blocked/waiting thread. A thread in this state cannot continue its execution
 * any further until it is moved to runnable state. Any thread in these states
 * does not consume any CPU cycle.
 * 
 * 4. Timed Waiting: A thread lies in timed waiting state when it calls a method
 * with a time out parameter. A thread lies in this state until the timeout is
 * completed or until a notification is received. For example, when a thread
 * calls sleep or a conditional wait, it is moved to a timed waiting state.
 * 
 * 5. Terminated State: A thread terminates because of either of the following
 * reasons: Because it exists normally. This happens when the code of thread has
 * entirely executed by the program. Because there occurred some unusual
 * erroneous event, like segmentation fault or an unhandled exception. A thread
 * that lies in a terminated state does no longer consumes any cycles of CPU.
 */

class thread implements Runnable {
	public void run() {
		// moving thread2 to timed waiting state
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				"State of thread1 while it called join() method on thread2 -" + ThreadLifeCycleDemo.thread1.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadLifeCycleDemo implements Runnable {
	public static Thread thread1;
	public static ThreadLifeCycleDemo obj;

	public static void main(String[] args) {
		obj = new ThreadLifeCycleDemo();
		thread1 = new Thread(obj);

		// thread1 created and is currently in the NEW state.
		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();

		// thread1 moved to Runnable state
		System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState());
	}

	public void run() {
		thread myThread = new thread();
		Thread thread2 = new Thread(myThread);

		// thread1 created and is currently in the NEW state.
		System.out.println("State of thread2 after creating it - " + thread2.getState());
		thread2.start();

		// thread2 moved to Runnable state
		System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState());

		// moving thread1 to timed waiting state
		try {
			// moving thread1 to timed waiting state
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());

		try {
			// waiting for thread2 to die
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
	}

}
