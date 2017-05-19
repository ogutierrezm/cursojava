package com.curso.miercoles;

public class TestException {
	public static void main(String[] args){
		try{
			int data;
			
			data = 50/0;
			
			System.out.println(data);
		}catch(ArithmeticException e){
			System.out.print(e);
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
}
