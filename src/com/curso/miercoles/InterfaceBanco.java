package com.curso.miercoles;

/*
 * 	Abstract:
 * 		Tene metodos abstractos y no abstractos
 * 		Usa palabra reservada abstract
 * 		puede proveer la implementacion de una interface
 * 		no soporta la herencia multiple
 * 		puede tener variables static, finales, no finales y no static
 * 
 *  Interface:
 *  	Solo puede contener metodos abstractos
 *  	j8 tiene por metodos default y static
 *  	soporta herencia multiple
 *  	solo tiene variables static y finales
 *  	no puede proveer la implementacionde una clase abstracta
 *  	usa palabra reservada interface
 * 
 */
interface Banco3{
	
	float rangoInteres();
}
class Bancoppel3 implements Banco3 {

	@Override
	public float rangoInteres() {
		// TODO Auto-generated method stub
		return 8;
	}

}

class Bancomer3 implements Banco3{

	@Override
	public float rangoInteres() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}

class Hsbc3 implements Banco3{

	@Override
	public float rangoInteres() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}
public class InterfaceBanco{
	public static void main(String[] args){
		Banco3 a = new Bancoppel3();
		Banco3 b = new Bancomer3();
		Banco3 c = new Hsbc3();
		
		System.out.println("El rango interes para Bancoppel es: " + a.rangoInteres());
		System.out.println("El rango interes para Bancomer es: " + b.rangoInteres());
		System.out.println("El rango interes para Hsbc es: " + c.rangoInteres());
	}
}