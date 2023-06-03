package com.ty;

public class Calculator {
	
	int balance = 100;

	public void add() {
		int a = 10;
		balance = balance + a;
		System.out.println(balance);
	}

	public void sub() {
		int a = 10;
		balance = balance - a;
		System.out.println(balance);
	}

	public void mul() {
		int a = 10;
		balance = balance * a;
		System.out.println(balance);
	}

	public void div() {
		int a = 10;
		balance = balance / a;
		System.out.println(balance);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}

}
