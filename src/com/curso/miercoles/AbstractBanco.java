package com.curso.miercoles;

abstract class Banco2{
	abstract float rangoInteres();
}

class Bancoppel2 extends Banco2{

	@Override
	float rangoInteres() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

class Bancomer2 extends Banco2{

	@Override
	float rangoInteres() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}

class Hsbc2 extends Banco2{

	@Override
	float rangoInteres() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}
public class AbstractBanco {
	public static void main(String[] args){
		Banco2 bancoppel =  new Bancoppel2();
		Banco2 bancomer = new Bancomer2();
		Banco2 hsbc = new Hsbc2();
		
		System.out.println("El rango interes para Bancoppel es: " + bancoppel.rangoInteres());
		System.out.println("El rango interes para Bancomer es: " + bancomer.rangoInteres());
		System.out.println("El rango interes para Hsbc es: " + hsbc.rangoInteres());
	}
}
