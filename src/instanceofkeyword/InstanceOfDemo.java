package instanceofkeyword;

class Parent {}
class Child extends Parent {}
public class InstanceOfDemo {
	
	public static void main(String[] args) {
		Child childObj = new Child();
		Parent parentObj = new Parent();
		
		System.out.println(childObj instanceof Child); // true
		System.out.println(childObj instanceof Parent); // true
		System.out.println(childObj instanceof Object); // true (Object is ancestor of all classes in Java)
		
		System.out.println(parentObj instanceof Child); // false (Parent object cannot access child objets but child can)
		
		Parent childObj1 = new Child();
		System.out.println(childObj1 instanceof Child); // true
		
	}
	
	

}
