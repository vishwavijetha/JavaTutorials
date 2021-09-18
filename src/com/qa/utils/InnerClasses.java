package com.qa.utils;

class OuterClass {
	int x = 10;

	class InnerClass {
		int y = 5;
	}
	
	static class StaticClass {
		int z = 20;
	}
}

public class InnerClasses {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
		
		OuterClass.StaticClass staticClass = new OuterClass.StaticClass();
	    System.out.println(staticClass.z);
	}
}

/**
 * If you try to access a private inner class from an outside class, an error
 * occurs:
 */

