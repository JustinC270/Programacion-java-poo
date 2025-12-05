package com.justincaamano.poo.basico;

public class MainTareaSimple {

	public static void main(String[] args) {
		TareaSimple objeto1 = new TareaSimple();
		objeto1.setTitulo("Nuevo titulo"); 
		System.out.println(objeto1.getTitulo());
		
		TareaSimple objeto2 = new TareaSimple(1,"Otra tarea", false);
		System.out.println(objeto2.getTitulo());
		
		
		
		
		
	}

}
