package com.justincaamano.poo.basico;

public class TareaSimple {
	
	// Attributes
	
	int duracionHoras;
	public TareaSimple(int duracionHoras, String titulo, boolean completado) {
		this.duracionHoras = duracionHoras;
		this.titulo = titulo;
		this.completado = completado;
	}
	
	

	public TareaSimple() {
		
	}
	

	private String titulo;
	boolean completado;

	public int getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(int duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	
	public void cambiarEstado() {
		if (this.completado) {
			this.completado = false;
			
			}else {
				this.completado =	 true;
		}
	}
}
