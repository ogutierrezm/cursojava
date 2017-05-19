package com.curso.miercoles;

/**
 * Si una clase tiene varios metodos que tiene el mismo nombre pero diferentes en parametros, se conoce como sobrecarga
 * Si tenemos que realizar una sola operacion, tener el mismo nombre de los metodos aumenta la legibilidad
 * del programa
 * @author CC-17
 * Ventaja:	
 * 		Aumenta la legibilidad del programa
 *  	Diferentes maneras de sobrecargar un metodo
 * Formas de sobrecargar un metodo:
 *  	Cambiando el numero de argumentos
 *  	Cambiando el tipo de datos
 * 
 * 	
 */
public class OverloadTest {
	public static void main(String[] args){
		System.out.println(AddArguments.add(11, 23));
		System.out.println(AddArguments.add(23, 14, 19));
		
		System.out.println(AddType.add(11,23));
		System.out.println(AddType.add(10.1, 6.1));
	}
}

class AddArguments{
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b, int c){
		return a+b+c;
	}
}

class AddType{
	static int add(int a, int b){
		return a+b;
	}
	
	static double add(double a, double b){
		return a+b;
	}
}