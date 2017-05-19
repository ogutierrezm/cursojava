package com.curso.miercoles;
/*
 * Una clase que se declara abstracta necesita de la palabra reservada abstract
 * 
 * Abstraccion:
 * 		Proceso de ocultar los detalle de implementacion y mostrar solo la funcionabilidad al usuario
 * No conoce el procesamiento interno de la funcion
 * 
 * La abstraccion permite centrarse en lo que hace el objeto en lugar de como lo hace
 * 
 * Hay 2 maneras de lograr la abstraccion
 * 		1- Clase abstracta (0 a 100%)
 * 		2- Interface(100%)
 * 
 * Una clase que se declara abstracta no se conoce como clase abstracta. Tiene que heredar y sus metodos deben ser implementados. 
 * No puede instanciarse.
 * 
 * Un metodo se declara abstrac cuando no tiene implementacion y tiene la palabra reservada abstract
 */
public class AbstractTest extends Bike2{

	@Override
	void run() {
		System.out.println("Corriendo..");
	}
	
	public static void main(String[] args){
		Bike2 bike = new AbstractTest();
		bike.run();
	}
}


abstract class Bike2 {
	abstract void run();
}
