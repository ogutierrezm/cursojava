package com.curso.miercoles;

public class Animal {
	void eat(){
		System.out.println("Comiendo...");
	}
}
class Dog extends Animal{
	void run(){
		System.out.println("corriendo...");
	}
}
class Prueba{
	public static void main(String [] args){
		Dog d = new Dog();
		d.eat();
		d.run();
	}
}
