package semana05_primerospasosProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayList {
	private Scanner sc = new Scanner(System.in);
	String nombre;
	List<Cancion> canciones;
	
	public PlayList(String nombre) {
		super();
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}
	
	public Cancion getCancion(int index) {
		return canciones.get(index);
	}
	
	//Metodos adicionales
	void añadirCancion(Cancion o){
		canciones.add(o);
	}
	
	void eliminarCancion(Cancion o) {
		canciones.remove(o);
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
	
	public Cancion elegirCancionPlayList(List<Cancion> canciones) {
		mostrarCanciones();
		System.out.print("Seleccione una cancion: ");
		int op = sc.nextInt()-1;
		if(op < 0 || op >= canciones.size()) {
			System.out.println("Opcion invalida!!");
			elegirCancionPlayList(canciones);
		}
		return getCancion(op);//Retorna cancion elegida
	}
	
}
