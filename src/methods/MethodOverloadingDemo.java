package methods;

public class MethodOverloadingDemo {
	
	// Same method name but different signatures like data types,no. of params etc

	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	
	public double add(double num1, float num2) {
		return num1 + num2;
	}
 
	public static void main(String[] args) {
		
		MethodOverloadingDemo m1 = new MethodOverloadingDemo();
		System.out.println(m1.add(10, 20));
		System.out.println(m1.add(10.5f, 20.5f));
		System.out.println(m1.add(10.123, 20.5f));
		System.out.println(m1.add(10, 20, 30));
	}

}
