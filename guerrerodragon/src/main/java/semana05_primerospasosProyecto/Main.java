package semana05_primerospasosProyecto;

public class Main {
	public static void main(String[] args) {
		   
		//Parte 1: Añadir cancion a favoritos.
		/*
		Usuario u = new Usuario("Pepito");
	    Biblioteca b = new Biblioteca();
	    b.cargarCanciones();
	    System.out.println("Seleccionando una cancion para agregar a favoritos:");
	    u.agregarFavoritos(b.elegirCancion(b.getCanciones()));
	    System.out.println("Mostrando canciones de favoritos:");
	    u.mostrarCancionesFavoritos();
		*/
		//Parte 2: Eliminar cancion de favoritos
	    
		Usuario u = new Usuario("Pepito");
	    Biblioteca b = new Biblioteca();
	    b.cargarCanciones();
		u.agregarFavoritos(new Cancion("a","b","c"));
		u.agregarFavoritos(new Cancion("z","b","c"));
		u.agregarFavoritos(new Cancion("a","b","c"));
		u.agregarFavoritos(new Cancion("a","b","c"));
		u.agregarFavoritos(new Cancion("a","b","c"));
		System.out.println("Amtes de eliminar: ");
		u.mostrarCancionesFavoritos();
		System.out.println("Eliminando: ");
		u.eliminarFavoritos(u.elegirCancionFavoritos(u.getFavoritos()));
		System.out.println("Despues de eliminar: ");
		u.mostrarCancionesFavoritos();
		
		//Parte 3: Añadir cancion a una playlist seleccionada.
		/*
		Usuario u = new Usuario("Pepito");
	    Biblioteca b = new Biblioteca();
	    b.cargarCanciones();
		u.crearPlayList("PlayList A");
		u.crearPlayList("PlayList B");
		System.out.println("Eligiendo una playlist para agrecar cancion"); 
		u.elegirPlayList(u.getPlaylists()).añadirCancion(b.elegirCancion(b.getCanciones()));
		System.out.println("Eligiendo una playlist para mostrar sus canciones");
		u.elegirPlayList(u.getPlaylists()).mostrarCanciones();
		*/
		//Parte 4: Eliminar cancion de una playlist seleccionada.
		/*
		Usuario u = new Usuario("Pepito");
	    Biblioteca b = new Biblioteca();
	    b.cargarCanciones();
		u.crearPlayList("PlayList A");
		u.getPlaylist(0).añadirCancion(new Cancion("a","b","c"));
		u.getPlaylist(0).añadirCancion(new Cancion("q","b","c"));
		u.getPlaylist(0).añadirCancion(new Cancion("w","b","c"));
		u.getPlaylist(0).añadirCancion(new Cancion("e","b","c"));
		u.crearPlayList("PlayList B");
		u.getPlaylist(1).añadirCancion(new Cancion("z","b","c"));
		u.getPlaylist(1).añadirCancion(new Cancion("x","b","c"));
		u.getPlaylist(1).añadirCancion(new Cancion("v","b","c"));
		System.out.println("Eligiendo una playlist para eliminar cancion"); 
		u.eliminarCancionPlayList(u.elegirPlayList(u.getPlaylists()));
		System.out.println("Eligiendo una playlist para mostrar sus canciones");
		u.elegirPlayList(u.getPlaylists()).mostrarCanciones();
		*/
	}
	
	public static void asdasd() {
		System.out.println("Iniciando...");
		 /*Usuario u = new Usuario("Pepito");
	    Biblioteca b = new Biblioteca();
	    b.cargarCanciones();
	    System.out.println(b.getCanciones().size());
	    //Cancion c = b.elegirCancion(b.getCanciones());
	    //u.agregarFavoritos(c);
	    //System.out.println(u.getFavoritos().get(0));
	    u.crearPlayList("sapito");
	    u.getPlaylists().get(0).añadirCancion(b.elegirCancion(b.getCanciones()));
	    u.getPlaylists().get(0).añadirCancion(b.elegirCancion(b.getCanciones()));
	    u.getPlaylists().get(0).añadirCancion(b.elegirCancion(b.getCanciones()));
	    //System.out.println(u.getPlaylists().get(0).canciones.get(0));
	    u.getPlaylists().get(0).mostrarCanciones();
	    System.out.println("Eliminando");
	    u.getPlaylists().get(0).eliminarCancion(b.elegirCancion(b.getCanciones()));
	    System.out.println("Eliminado");
	    u.getPlaylists().get(0).mostrarCanciones();*/
	}
}
