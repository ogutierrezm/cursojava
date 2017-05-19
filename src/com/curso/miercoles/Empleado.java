package com.curso.miercoles;

public class Empleado {
	float salario = 4000;
}

class Programador extends Empleado{
	int bono = 10000;
	
	public static void main(String[] args){
		Programador programador = new Programador();
		
		System.out.println("El salario de un programador es: " + programador.salario);
		
		System.out.println("El bono es: " + programador.bono);
	}
}