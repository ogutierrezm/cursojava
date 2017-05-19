package com.curso.miercoles;

public class Persona {
	int id;
	String name;
	Persona(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Empleados extends Persona{
	float salario;
	Empleados(int id, String name, float salario){
		super(id, name);
		this.salario = salario;
	}
	
	void display(){
		System.out.println(id+ " "+ name+ " "+salario);
	}
}

class PersonaTest{
	public static void main(String[] args){
		Empleados emp = new Empleados(001, "Alejandro", 100);
		emp.display();
	}
}
