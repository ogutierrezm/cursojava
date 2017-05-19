package com.curso.miercoles;

abstract class Shape{
	abstract void draw();
}

//En un escenario real, la implementacion la provee algo mas
class Rectabgle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("dibujando rectangulos xD");
	}
}

class Circule extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("dibujando circulos xD");
	}
}

// En un escenario real, el metodo es llamado por el programador
public class AbstractTest2 {
	public static void main(String[] args){
		Shape s = new Circule();
		s.draw();
		new Rectabgle().draw();
	}
}

