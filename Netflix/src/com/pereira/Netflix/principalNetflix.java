package com.pereira.Netflix;

public class principalNetflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicula peliculaDefault = new Pelicula(null, null, null, 0, 0);
		Pelicula troya = new Pelicula("Troya", "David Fincher", null, 0, 0);
		
		Series serieDefault = new Series(null, null, null, 0, 0);
		
		
		peliculaDefault.mostrarTitulos();
		troya.mostrarTitulos();
		
		serieDefault.mostrarTitulos();
	}

}
