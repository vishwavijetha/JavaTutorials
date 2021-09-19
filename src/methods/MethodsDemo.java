package methods;

public class MethodsDemo {

	static int noOfObjectsCreated;
	MethodsDemo() {
		noOfObjectsCreated++;
	}
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		System.out.println(new MethodsDemo().add(10, 20));
		new MethodsDemo();
		new MethodsDemo();
		System.out.println(MethodsDemo.noOfObjectsCreated);
	}

}
