package com.curso.miercoles;

public class Animal2 {
	void eat(){
		System.out.println("Eating..");
	}
}

class Dog2 extends Animal2{
	void run(){
		System.out.println("Running..");
	}
}

class Cachorro extends Dog2{
	void drinkMilk(){
		System.out.println("drinking milk..");
	}
}

class Herencia{
	public static void main(String[] args){
		Cachorro  cachorro = new Cachorro();
		cachorro.drinkMilk();
		cachorro.run();
		cachorro.eat();
	}
}