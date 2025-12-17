package com.justincaamano.poo.redsocial;

public class GeneradorPerfiles {
	public static PerfilRedSocial crearPerfilPrueba(String nombreUsuario) {
		PerfilRedSocial p = new PerfilRedSocial();
		p.setNombreVsible(nombreUsuario);
		p.setPais("España");
		return p;

	}

	public static PerfilRedSocial crearPerfilPruebaConPublicaciones(String nombreUsuario, int numeroPublicaciones) {
		PerfilRedSocial p = crearPerfilPrueba(nombreUsuario);
		return p;

	}
}
	