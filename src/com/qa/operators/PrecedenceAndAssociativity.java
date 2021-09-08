package com.qa.operators;

public class PrecedenceAndAssociativity {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

		// precedence rules for arithmetic operators.
		// (* = / = %) > (+ = -)
		// prints a+(b/d)
		System.out.println("a+b/d = " + (a + b / d));

		// if same precendence then associative
		// rules are followed.
		// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
		System.out.println("a+b*d-e/f = " + (a + b * d - e / f));
		
		a = 20; b = 10; c = 0;
        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b++ + c;
        System.out.println("Value of a(b+c), "
                           + " b(b+1), c = "
                           + a + ", " + b
                           + ", " + c);
        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
	}
}
