package com.training.exproject.entity;

public class Test2 {

	// Создйте класс Test2 двумя переменными.
	// Добавьте КОНСТРУКТОР с входными параметрами.
	// Добавьте КОНСТРУКТОР, инициализирующий члены класса по умолчанию.
	// Добавьте set- и get- МЕТОДЫ для полей экземпляра класса.

	private int a;
	private int b;
	
	public Test2() {
		a = 2;
		b = 3;
	}
	
	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public void printRezult() {
		System.out.println("a = " + a + " b = " + b + "\n");
		
	}

}
