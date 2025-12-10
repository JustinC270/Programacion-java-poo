package com.justincaamano.poo.redsocial;

import java.time.LocalTime;

public class RedSocial {
	
	//Attributes
	private String contenido;	
	private LocalTime hora;
	private int numeroLikes;
	
	public void mostrarContenidoPublicacion(String texto, LocalTime fecha, int meGusta) {
		this.hora =  LocalTime.now(); // Devuelve la hora actual 
		 
	}
	
	public void darMeGusta() {
		
	}
	
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getNumeroLikes() {
		return numeroLikes;
	}

	public void setNumeroLikes(int numeroLikes) {
		this.numeroLikes = numeroLikes;
	}

	public int verMeGusta(int tieneMeGusta) {
		return tieneMeGusta;
		
	}
}
