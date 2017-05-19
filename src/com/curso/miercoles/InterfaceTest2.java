package com.curso.miercoles;

interface Shape2{
	void draw();
}

class Rectabgle2 implements Shape2{


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("dibujando rectangulos xD");
	}
}

class Circule2 implements Shape2{


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("dibujando circulos xD");
	}
}
public class InterfaceTest2 {
	public static void main(String[] args){
		Shape2 a = new Rectabgle2();
		a.draw();
		
		new Circule2().draw();
	}
	

}
