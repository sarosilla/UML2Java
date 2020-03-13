package Peliculas;

public class Pelicula {
	
	private static String Pelicula = null;
	private String nombre;
	private int año;
	private String Sinopsis;
	private Enum<?> Genero;
	private String Pais;
	
	public java.util.Collection Persona = new java.util.TreeSet();

	public static String getPelicula() {
		return Pelicula;
	}

	public static void setPelicula(String pelicula) {
		Pelicula = pelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSinopsis() {
		return Sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		Sinopsis = sinopsis;
	}

	public Enum<?> getGenero() {
		return Genero;
	}

	public void setGenero(Enum<?> genero) {
		Genero = genero;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	

}
