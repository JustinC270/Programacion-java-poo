package com.justincaamano.poo.redsocial;

import java.util.ArrayList;

public class PerfilRedSocial {
	private String usuario; // @ejemplo_prueba
	private String nombreVisible; // Ejemplo Prueba
	private String biografia; // descripcion usuario
	private String pais; // de donde es
	private double numeroSeguidores; // cuanta gente le sigue
	private int numeroPublicacines; // cuantas publicaciones ha hecho
	private Estado estadoPerfil; // perfil activo o inactivo
	private boolean cuentaVerificada; // si tiene check azul o no
	

	ArrayList<Publicaciones> listaPublicaciones = new ArrayList<Publicaciones>();
	
	

	public PerfilRedSocial(ArrayList<Publicaciones> listaPublicaciones) {
		super();
		this.listaPublicaciones = listaPublicaciones;
	}

	public ArrayList<Publicaciones> getListaPublicaciones() {
		return listaPublicaciones;
	}

	public void setListaPublicaciones(ArrayList<Publicaciones> listaPublicaciones) {
		this.listaPublicaciones = listaPublicaciones;
	}

	public void crearPublicacion(String loQueQuierePublicar) {
		
	}

	public void mostrarPublicaciones() {

	}

	public void mostrarInformacion() {
		System.out.println(this.usuario);
		System.out.println(this.biografia);

	}

	public void anadirSeguidores(int nuevosSeguidores) {
		this.numeroSeguidores += nuevosSeguidores;

	}

	public void cambiarEstadoDelPerfil(Estado activoONo) {
		this.estadoPerfil = activoONo;

	}

	public void estaActivo(boolean activo) {

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombreVsible() {
		return nombreVisible;
	}

	public void setNombreVsible(String nombreVisible) {
		this.nombreVisible = nombreVisible;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getNumeroSeguidores() {
		return numeroSeguidores;
	}

	public void setNumeroSeguidores(double numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}

	public int getNumeroPublicacines() {
		return numeroPublicacines;
	}

	public void setNumeroPublicacines(int numeroPublicacines) {
		this.numeroPublicacines = numeroPublicacines;
	}

	public Estado isEstadoPerfil() {
		return estadoPerfil;
	}

	public void setEstadoPerfil(Estado estadoPerfil) {
		this.estadoPerfil = estadoPerfil;
	}

	public boolean isCuentaVerificada() {
		return cuentaVerificada;
	}

	public void setCuentaVerificada(boolean cuentaVerificada) {
		this.cuentaVerificada = cuentaVerificada;
	}

	public PerfilRedSocial(String usuario, String nombreVisible, String biografia, String pais, double numeroSeguidores,
			int numeroPublicacines, Estado estadoPerfil, boolean cuentaVerificada) {
		super();
		this.usuario = usuario;
		this.nombreVisible = nombreVisible;
		this.biografia = biografia;
		this.pais = pais;
		this.numeroSeguidores = numeroSeguidores;
		this.numeroPublicacines = numeroPublicacines;
		this.estadoPerfil = estadoPerfil;
		this.cuentaVerificada = cuentaVerificada;
		

	}

}
