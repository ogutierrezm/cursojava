package com.curso.tarea;
public class Animal1 extends Thread{

	public void run(){
		Menu ca= new Menu();
		int i = 0;
		//System.out.println("Inicia la tortuga");
		ca.EscribirArchivo("Inicia animal1");
		while (i<= 5 ){
			try{
				Thread.sleep(5000);
				//
				ca.EscribirArchivo("continua animal1");
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			i++;
		}
		//System.out.println("Ya llego la tortuga");
		ca.EscribirArchivo("termino animal1");
	}
	public Animal1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
