package com.curso.tarea;

public class Animal2 implements Runnable {
	
	public void run(){
		Menu ca= new Menu();
		int i = 0;
		//System.out.println("Inicia la Liebre");
		ca.EscribirArchivo("Inicia animal2");
		
		while (i< 5 ){
			try{
				Thread.sleep(2000);
				//System.out.println("Da un paso la Liebre");
				ca.EscribirArchivo("continua animal2");
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			i++;
		}
		//System.out.println("Ya llego la Liebre");
		ca.EscribirArchivo("termina animal2");

	}
	public Animal2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}
