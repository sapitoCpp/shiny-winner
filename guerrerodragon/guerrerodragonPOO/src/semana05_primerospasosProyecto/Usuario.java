package semana05_primerospasosProyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	private Scanner sc = new Scanner(System.in);
	private String nombre;
	private List<Cancion> favoritos;
	private List<PlayList> playlists;

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		this.favoritos = new ArrayList<>();
		this.playlists = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}

	public List<Cancion> getFavoritos() {
		return favoritos;
	}
	
	public Cancion getFavorito(int index) {
	    return favoritos.get(index);
	}

	public List<PlayList> getPlaylists() {
		return playlists;
	}
	
	public PlayList getPlaylist(int index) {
		return playlists.get(index);
	}
	
	//Metodo adicionales
	public void agregarFavoritos(Cancion c) {
		favoritos.add(c);
	}
	
	public void mostrarCancionesFavoritos() {
		if(favoritos.size()==0) {
			System.out.println("Vacio");
			return;
		}
		int i = 1;
		for (Cancion cancion : favoritos) {
			System.out.println(i+") "+cancion);
			i++;
		}
	}
	
	public Cancion elegirCancionFavoritos(List<Cancion> favoritos) {
		mostrarCancionesFavoritos();
		System.out.print("Seleccione una cancion: ");
		int op = sc.nextInt()-1;
		if(op < 0 || op >= favoritos.size()) {
			System.out.println("Opcion invalida!!");
			elegirCancionFavoritos(favoritos);
		}
		return getFavorito(op);//Retorna cancion elegida
	}
	
	public void eliminarFavoritos(Cancion c) {
		favoritos.remove(c);
	}
	
	public void crearPlayList(String nombre) {
		playlists.add(new PlayList(nombre));
	}
	
	public void mostrarPlayLists() {
		if(playlists.size()==0) {
			System.out.println("Vacio");
			return;
		}
		int i = 1;
		for (PlayList playlist : playlists) {
			System.out.println(i+") "+playlist.getNombre());
			i++;
		}
	}
	
	public PlayList elegirPlayList(List<PlayList> playlists) {
		mostrarPlayLists();
		System.out.print("Seleccione una playlist: ");
		int op = sc.nextInt()-1;
		if(op < 0 || op >= playlists.size()) {
			System.out.println("Opcion invalida!!");
			elegirPlayList(playlists);
		}
		return playlists.get(op);
	}
	
	public void eliminarCancionPlayList(PlayList playlist) {
		playlist.eliminarCancion(playlist.elegirCancionPlayList(playlist.getCanciones()));
	}

}
