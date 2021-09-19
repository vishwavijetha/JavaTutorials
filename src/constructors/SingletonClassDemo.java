package constructors;

class Singleton {
	static Singleton instance = null;
	public int x = 10;

	// private constructor can't be accessed outside the class
	private Singleton() {
	}

	// Factory method to provide the users with instances
	static public Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
}

public class SingletonClassDemo {

	public static void main(String[] args) {
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		singleton1.x = singleton1.x + 10;
		System.out.println("Value of singleton1.x = " + singleton1.x); // Same
	    System.out.println("Value of singleton2.x = " + singleton2.x); // Same
	}
}
