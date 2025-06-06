package semana05_primerospasosProyecto;

public class Cancion {
	String nombre="Guachinanga";
	String artista="Tu papá";
	String genero="Clasico";
	
	public Cancion(String artista, String nombre, String genero) {
	    this.nombre = nombre;
	    this.artista = artista;
	    this.genero = genero;
	}
	
	@Override
	public String toString() {
		return "Cancion [nombre: " + nombre + ", artista: " + artista + ", genero: " + genero + "]";
	}
	
	void mostrarInfo() {
		System.out.println(toString());
	}
}
