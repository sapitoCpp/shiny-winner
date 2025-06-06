package semana05_primerospasosProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	private Scanner sc = new Scanner(System.in);
	private List<Cancion> canciones;

	public Biblioteca() {
		this.canciones = new ArrayList<>();
	}
	
	public List<Cancion> getCanciones(){
		return this.canciones;
	}
	
	public Cancion getCancion(int index) {
		return canciones.get(index);
	}
	
	//Metodos adicionales
	void cargarCanciones() {
		canciones.add(new Cancion("Queen", "Bohemian Rhapsody", "Rock"));
	    canciones.add(new Cancion("Ed Sheeran", "Shape of You", "Pop"));
	    canciones.add(new Cancion("The Beatles", "Hey Jude", "Rock"));
	    canciones.add(new Cancion("Michael Jackson", "Thriller", "Pop"));
	    canciones.add(new Cancion("Led Zeppelin", "Stairway to Heaven", "Rock"));
	    canciones.add(new Cancion("Daft Punk", "Get Lucky", "Electronic"));
	    canciones.add(new Cancion("Adele", "Hello", "Pop"));
	    canciones.add(new Cancion("Nirvana", "Smells Like Teen Spirit", "Grunge"));
	    canciones.add(new Cancion("Coldplay", "Yellow", "Alternative"));
	    canciones.add(new Cancion("Norah Jones", "Don't Know Why", "Jazz"));
	    /*canciones.add(new Cancion("Pink Floyd", "Comfortably Numb", "Rock"));
	    canciones.add(new Cancion("Radiohead", "Creep", "Alternative"));
	    canciones.add(new Cancion("Queen", "Don't Stop Me Now", "Rock"));
	    canciones.add(new Cancion("Ed Sheeran", "Thinking Out Loud", "Pop"));
	    canciones.add(new Cancion("The Beatles", "Let It Be", "Rock"));
	    canciones.add(new Cancion("Michael Jackson", "Billie Jean", "Pop"));
	    canciones.add(new Cancion("Led Zeppelin", "Kashmir", "Rock"));
	    canciones.add(new Cancion("Daft Punk", "One More Time", "Electronic"));
	    canciones.add(new Cancion("Adele", "Rolling in the Deep", "Pop"));
	    canciones.add(new Cancion("Nirvana", "Come As You Are", "Grunge"));
	    canciones.add(new Cancion("Coldplay", "Fix You", "Alternative"));
	    canciones.add(new Cancion("Norah Jones", "Sunrise", "Jazz"));
	    canciones.add(new Cancion("Taylor Swift", "Love Story", "Pop"));
	    canciones.add(new Cancion("Arctic Monkeys", "Do I Wanna Know?", "Indie Rock"));
	    canciones.add(new Cancion("Billie Eilish", "Bad Guy", "Alternative Pop"));
	    canciones.add(new Cancion("Bruno Mars", "Uptown Funk", "Funk"));
	    canciones.add(new Cancion("The Rolling Stones", "Paint It Black", "Rock"));
	    canciones.add(new Cancion("Bob Dylan", "Like a Rolling Stone", "Folk Rock"));
	    canciones.add(new Cancion("Katy Perry", "Firework", "Pop"));
	    canciones.add(new Cancion("Maroon 5", "Sugar", "Pop Rock"));
	    canciones.add(new Cancion("Eminem", "Lose Yourself", "Rap"));
	    canciones.add(new Cancion("Drake", "Hotline Bling", "Hip Hop"));
	    canciones.add(new Cancion("Luis Fonsi", "Despacito", "Latin Pop"));
	    canciones.add(new Cancion("Shakira", "Hips Don't Lie", "Latin Pop"));
	    canciones.add(new Cancion("The Weeknd", "Blinding Lights", "Synthpop"));
	    canciones.add(new Cancion("Imagine Dragons", "Radioactive", "Alternative Rock"));
	    canciones.add(new Cancion("Beyoncé", "Halo", "R&B"));
	    canciones.add(new Cancion("Harry Styles", "As It Was", "Pop Rock"));*/
	}
	
	public void mostrarCanciones() {
		if(canciones.size()==0) {
			System.out.println("Vacio");
			return;
		}
		int i = 1;
		for (Cancion cancion : canciones) {
			System.out.println(i+") "+cancion);
			i++;
		}
	}
	
	public Cancion elegirCancion(List<Cancion> canciones) {
		mostrarCanciones();
		System.out.print("Seleccione una cancion: ");
		int op = sc.nextInt()-1;
		if(op < 0 || op >= canciones.size()) {
			System.out.println("Opcion invalida!!");
			elegirCancion(canciones);
		}
		return getCancion(op);//Retorna cancion elegida
	}
}
