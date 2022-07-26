package com.training.exproject.entity;

public class Test1 {

	// Создайте класс Test1 двумя переменными.
	// Добавьте метод вывода на экран и методы изменения этих переменных.
	// Добавьте метод, который находит сумму значений этих переменных,
	// и метод, который находит наибольшее значение из этих двух переменных.

	private int a;
	private int b;

	public void init(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int maxNumber() {
		if (a > b) {
			return a;
		}
		if (a < b) {
			return b;
		}
		if (a == b) {
			throw new RuntimeException("Numbers is equal");
		}
		return 0;
	}
	
	public int sum() {
		int z = a + b;

		return z;
	}
	
	public void printRezult() {
		System.out.println("a = " + a + " b = " + b + "\n");		
		System.out.println("a + b = " + sum());
		System.out.println("max number = " + maxNumber());
	}
	

}
