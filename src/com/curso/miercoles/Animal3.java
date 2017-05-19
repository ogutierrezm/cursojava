package com.curso.miercoles;

public class Animal3 {
	void eat(){
		System.out.println("Comiendo");
	}
}
class Cat extends Animal3{
	void meow(){
		System.out.println("Mauyando..");
	}
}

class Perro extends Animal3{
	void run(){
		System.out.println("Corriendo..");
	}
}
class HerencciaJerarquica{
	public static void main(String[] args){
		Cat c = new Cat();
		c.meow();
		c.eat();
	}
}
