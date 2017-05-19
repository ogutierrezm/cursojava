package com.curso.tarea;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	static String sNombreArchivo="C:\\testio\\"; 
	static String sArchivo="miarchivo.txt";
	static final String LINE_SEPARATOR = System.getProperty("line.separator");
	private static Scanner scanner;
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    
	    System.out.println("Selecciona opcion");
        System.out.println("-------------------------\n");
        System.out.println("1 - Opcion | Escribir y leer");
        System.out.println("2 - Opcion | Escribir");
        System.out.println("3 - Opcion | Leer");
        System.out.println("4 - Opcion | Salir");
        Animal1 t = new Animal1();
		Thread	t2 = new Thread(new Animal2());
		Thread	t3 = new Thread(new Hilo());
		
		scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
        
        switch (choice) {
	        case 1:
	        	t.start();
	        	t2.start();
	    		t3.start();
	    		System.out.println("Escribir y leer");
	            break;
	        case 2:
	        	t.start();
	        	t2.start();
	        	System.out.println("Solo escribir");
	            break;
	        case 3:
	        	t3.start();
	        	System.out.println("Solo Leer");
	            break;
	        case 4:
	        	System.out.println("Salir sistema");
	            break;
	        default:
	    }
		
		
	}
	public void EscribirArchivo(String msg){
		try{
			File file = new File(sNombreArchivo+ sArchivo);
			if (!file.exists()) {
			file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file,true);
			msg = msg +LINE_SEPARATOR;
			fos.write(msg.getBytes());
			fos.close();
		}catch (IOException ioe) {
			// TODO: handle exception
		}
	}
	
	public static void LeerArchivo(){
		try{
			FileInputStream fis = new FileInputStream(sNombreArchivo+ sArchivo);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i = bis.read()) != -1 ){
				System.out.println((char)i);
			}
			bis.close();
			fis.close();
		}catch (IOException ioe) {
			// TODO: handle exception
		}
	}
}
