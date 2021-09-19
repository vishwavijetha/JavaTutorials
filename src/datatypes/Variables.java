package datatypes;

public class Variables {
	
	// Instance variable - One copy for each objects created
	String text;
	
	// Static varible - One copy for all the objects created
	static int count;

	public static void main(String[] args) {
		
		Variables var1 = new Variables();
		var1.text = "First text";
		System.out.println(var1.text); // prints text
		
		Variables var2 = new Variables();
		System.out.println(var2.text); // prints null
		
		new Variables();
		System.out.println(Variables.count); // prints default 0
		count++;
		System.out.println(count); // prints 1
		
		new Variables();
		System.out.println(count); // prints 1 - copying and storing previous value
	}

}
