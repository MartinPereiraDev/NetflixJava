package com.pereira.Netflix;

public class principalNetflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula peliculaDefault = new Pelicula();
		Pelicula troya = new Pelicula("Troya", "David Fincher");
		
		Series serieDefault = new Series();
		
		
		peliculaDefault.mostrarTitulos();
		troya.mostrarTitulos();
		
		serieDefault.mostrarTitulos();
	}

}
