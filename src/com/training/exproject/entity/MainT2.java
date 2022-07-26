package com.training.exproject.entity;

public class MainT2 {
	// Создйте класс Test2 двумя переменными.
	// Добавьте КОНСТРУКТОР с входными параметрами.
	// Добавьте КОНСТРУКТОР, инициализирующий члены класса по умолчанию.
	// Добавьте set- и get- МЕТОДЫ для полей экземпляра класса.

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		Test2 t22 = new Test2(1, 5);

		t2.printRezult();
		t22.printRezult();
		
		//или ...

		System.out.println("aa = " + t2.getA() + " bb = " + t2.getB() + "\n");
		System.out.println("aa = " + t22.getA() + " bb = " + t22.getB() + "\n");

	}

}
