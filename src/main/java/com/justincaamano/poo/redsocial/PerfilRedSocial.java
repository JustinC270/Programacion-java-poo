package com.justincaamano.poo.redsocial;

public class PerfilRedSocial {
	private String usuario;
	private String nombreVsible;
	private String biografia;
	private String pais;
	private double numeroSeguidores;
	private int numeroPublicacines;
	private Estado estadoPerfil;
	private boolean cuentaVerificada;

	public void mostrarInformacion() {
		System.out.println(this.usuario);
		System.out.println(this.biografia);
		
	}

	public void añadirSeguidores(int nuevosSeguidores) {
		this.numeroSeguidores+=nuevosSeguidores;

	}

	public boolean cambiarEstadoDelPerfil(boolean perfilActivoONo) {
		 return perfilActivoONo;
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
		return nombreVsible;
	}

	public void setNombreVsible(String nombreVsible) {
		this.nombreVsible = nombreVsible;
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
}
