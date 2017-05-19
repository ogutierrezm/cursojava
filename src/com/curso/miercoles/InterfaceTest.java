package com.curso.miercoles;

/*
 * Tiene constantes estaticas y metodo abstractos
 * Es un mecanismo que permite laabstraccion
 * solo puede contener metodo abstractos
 * permite la herencia multiple
 * no se puede instanciar como clase abstracta
 * 
 * Razones para usar interfaces
 * 		Por interface podemos apoyar la funcionabilidad de herencia multiple
 * 		se ultilza para lograr el desacoplamiento
 *  *java 8: Puede contener metodos predeterminados eststicos
 */

interface show{
	void print();
	
}
public class InterfaceTest implements show{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
	}
	
	public static void main(String[] args){
		InterfaceTest test = new InterfaceTest();
		test.print();
	}

}
