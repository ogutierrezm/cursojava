package com.curso.jueves;
/*
 * (Paralelismo) Multihilos en Java: Es el proceso para ejecutar muchos hilos de manera simultanea.
 * Hilo: Subproceso ligero, unidad muy pequeña de procesamiento
 * (Concurrencia) Multiprocesamiento y multihilo se utilizan para lograr la multitarea, en la concurrencia pueden o no ser
 * multiprocesamiento.
 * 
 * Ventajas usar Hilos:
 * 		No bloqueamos al usuariopor que son tareas independientes y se opueden realizar muchas tareas al mismo tiempo.
 * 		Podemos realizar muchas tareas a la vez
 * 		Los hilos al ser independientes no se afectan entre si, en caso de ocurrir una excepcion en un hilo
 * 			los demas funcionan igual.
 * 
 * Multitarea: Proceso de ejecucion de muchas tareas, usamos la multitarea para utilizar el CPU. La multitarea se logra de 2 maneras:
 * 	1- Multitarea basada en procesos (Multiproceso)
 * 		*Cada proceso tiene su propia direccion en memoria,
 * 		 es decir cada proceso asigna un area separada de memoria
 * 		
 * 		*EL proceso es pesado:
 * 			El costo de la comunicacion entre el proceso es alto.
 * 			Cambiar de un procesoa otro requiere de tiempo para guardar y cargar registros, mapas de memorias, listas de actualizacion etc...
 * 
 * 	2- Multitarea basada en hilos( Multihilos)
 * 		*Los hilos comparten los mismos espacios de memoria para direcciones .
 * 		*El hilo es ligero
 * 		*Eñ costo de cmunicacion entre hilos es bajo
 * 
 * Un hilo es un subproceso ligero, es independientes, si se producde una excepcion en un hilo no afeca a los demas hilos 
 * 	y comparten un area de memoria en comun		
 * 
 * Ciclo de vida de un hilo
 * 		1- New: El hilo esta en este estado, si se crea una instancia de la clase Thread, pero antes de la invocacion del metodo start().
 * 		2- Runnable: El hilo esta en este estado, despues de la invocacoin del metodo start(), pero el thread scheduler (administrador de hilos)
 * 			no lo ha seleccionado como el hilo en ejecucion.
 * 		3- Running: El hilo esta en este estado cuando el thread scheduler lo ha seleccionado
 * 		4- Non-Runnable(Blocked): Es elestado cuando el hilo sigue sin embargo no es arto para ejecutarse
 * 		5- Terminated: Es ele stado cuando ha finalizado el hilos
 * 
 * Hay 2 formas de crear un hilo:
 * 	1- Extender de la clase Thread
 * 	2- Al implementar la interface Runnable
 * 
 * Clase Thread
 * 	Proporciona los constructres y metodos para crear y realizar operacions en un hilo. 
 * 	La clase Thread extiende de la clase Object e implementa la interface Runnable.
 * Constructores de la clase Thread
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r, String name)
 * 
 * Runnable
 * 	La interfaz Runnable debe ser implementada por cualquier clase cuyas instancias esten destinadas a ser ejecutadas
 * 	por un hilo.
 *  La interfaz Runnable tiene un solo metodo denominado run().
 *  public void run(): Es usado para realizar las operaciones del hilo.
 */
public class HilosT extends Thread{
	public void run(){
		System.out.println("Soy un hilo corriendo");
	}
	
	public static void main(String[] args){
		HilosT t1 = new HilosT();
		t1.start();
		
		new Hilos().run();
		
		Hilos t = new Hilos();
		Thread thread = new Thread(t);
		thread.start();
		
		Thread currThread = Thread.currentThread();
		
		System.out.println("current thread = " + currThread);
		System.out.println("isAlive = " + currThread.isAlive());
		Thread.State state = Thread.currentThread().getState();
	      System.out.println(Thread.currentThread().getName());
	      System.out.println("state = " + state);
	      System.out.println("id = " + currThread.getId());
	}
}

class Hilos implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Soy un hilo corriendo 2");
	}
	
}