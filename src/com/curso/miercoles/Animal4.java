package com.curso.miercoles;
/*
 * La palabra reservada super es una variable de referencia al objeto inmediato de la clase padre.
 * Siempre que se crea la instancia de la subclase, se crea una instancia de la superclase implicitamente
 * a la que se refiere por super-variable.
 * 
 * 		Uso de la palabra reservada SUPER
 * 			super refiereala variable de instancia del padre
 * 			super invoca al metodo de la clase padre
 * 			super() invoca al constructor de la clase padre
 * 
 * used to refer inmediate parent class instance variable
 */
public class Animal4 {
	String color = "Blanco";
}

class Dog4 extends Animal4{
	String color = "Negro";
	void imprimir(){
		System.out.println(color);
		System.out.println(super.color);
	}
}


//super can be used to invoke parent class method
class Animal5{
	void eat(){
		System.out.println("Eating..");
	}
}
class Dog5 extends Animal5{
	void eat(){
		System.out.print("eating bread..");
	}
	
	void run(){
		System.out.print("running away..");
	}
	
	void takeShower(){
		System.out.print("taking shower..");
	}
	void sample(){
		eat();
		run();
		takeShower();
		super.eat();
	}
}

class Animal6{
	Animal6(){
		System.out.println("Animal is created..");
	}
	
}

class Dog6 extends Animal6{
	Dog6(){
		super();
		System.out.println("dog6");
	}
	
}

class PruebaAnimal{
	public static void main(String[] args){
		Dog4 dog = new Dog4();
		dog.imprimir();
		
		Dog5 dog5 = new Dog5();
		dog5.sample();
		
		Dog6 dog6 = new Dog6();
	}
	
}