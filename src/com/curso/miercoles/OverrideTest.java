package com.curso.miercoles;
/**
 * Si una subclase tiene el mismo metodo que se declaro en la clase padre, se conoce como redefinicion
 * 
 * Si la subclase proporciona la implementacion especifica del metodo que ha sido previamente proporcionado en su calse padre, 
 * se conoce como redifinicacion del metodo.
 * 
 * Uso del OVerride en Java
 * 		Proporcionar implementaciones especificas a metodos heredados
 * 		Proporcionar los mecanismos que permiten el polimorfismo
 * Reglas para Override:
 * 		Mismo nombre que en la clase padre.
 * 		Mismo parametro que en la calse padre.
 * 		Relacionados IS-A 
 * @author CC-17
 *
 */
public class OverrideTest {
	public static void main(String[] args){
		Bike bici = new Bike();
		bici.run();
	}
}

class Vehiculo{
	void run(){
		System.out.println("El Vehiculo esta corriendo..");
	}
}

class Bike extends Vehiculo{
	void run(){
		System.out.println("La Bicicleta esta corriendo..");
	}
}