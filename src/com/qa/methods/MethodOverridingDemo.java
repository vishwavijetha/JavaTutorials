package com.qa.methods;

class Bank {
	public double getROI() {
		return 0.0;
	}
}

class SBI extends Bank {
	public double getROI() {
		return 8.25;
	}
}

class HDFC extends Bank {
	public double getROI() {
		return 8.50;
	}
}

class ICICI extends Bank {
	public double getROI() {
		return 8.75;
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.getROI());
		Bank sbi = new SBI();
		System.out.println(sbi.getROI());
		SBI sbi1 = new SBI();
		System.out.println(sbi1.getROI());
		Bank hdfc = new HDFC();
		System.out.println(hdfc.getROI());
		Bank icici = new ICICI();
		System.out.println(icici.getROI());
	}
}
