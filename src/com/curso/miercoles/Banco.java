package com.curso.miercoles;

public class Banco{
	private static float rangoInteres = 0;
	float rangoInteres(){
		return rangoInteres;
	}
}

class Bancoppel extends Banco{
	private static float rangoInteres = 7;
	float rangoInteres(){
		return rangoInteres;
	}
}

class Bancomer extends Banco{
	private static float rangoInteres = 8;
	 float rangoInteres(){
		return rangoInteres;
	}
}

class Hsbc extends Banco{
	private static float rangoInteres = 9;
	 float rangoInteres(){
		
		return rangoInteres;
	}
}

class PruebaBanco{
	public static void main(String[] args){
		Bancoppel bancoppel = new Bancoppel();
		Bancomer bancomer = new Bancomer();
		Hsbc hsbc = new Hsbc();
		
		System.out.println("El rango interes para Bancoppel es: " + bancoppel.rangoInteres());
		System.out.println("El rango interes para Bancomer es: " + bancomer.rangoInteres());
		System.out.println("El rango interes para Hsbc es: " + hsbc.rangoInteres());
	}	
}
