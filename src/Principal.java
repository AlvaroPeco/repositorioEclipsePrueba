import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir = false;
		int opcion;
		ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

		crearObjetos(listaPublicaciones);

		do {

			System.out.println("------ EFA Teca -------");
			System.out.println("1. Todas las publicaciones");
			System.out.println("2. Filtrar por libros/revistas");
			System.out.println("3. Publicaciones prestadas");
			System.out.println("4. Publicaciones no prestadas");
			System.out.println("5. Prestar publicacion");
			System.out.println("6. Devolver publicacion");
			System.out.println("7. Salir");
			System.out.println("-------------------------------");
			System.out.println("Elige una opcion");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1:
				imprimirPublicaciones(listaPublicaciones);
				break;
			case 2:
				filtrarLibrosRevistas (listaPublicaciones);
				break;
			case 3:
				filtrarPrestado (listaPublicaciones);
				break;
			case 4:
				publicacionesNoPrestadas (listaPublicaciones);
				break;
			case 5:
				prestarPublicacion (listaPublicaciones);
				break;
			case 6:
				devolverPublicacion (listaPublicaciones);
				break;
			case 7:
				System.out.println("Hasta pronto");
				salir = true;
				break;
			}
		} while (salir == false);
	}

	public static void crearObjetos(ArrayList<Publicacion> listaPublicaciones) {
		listaPublicaciones.add(new Revista(1, 2004, 1));
		listaPublicaciones.add(new Revista(2, 2008, 2));
		listaPublicaciones.add(new Revista(3, 2020, 3));
		listaPublicaciones.add(new Libro(1, 2006, "Alberto"));
		listaPublicaciones.add(new Libro(2, 2004, "Alvaro"));
		listaPublicaciones.add(new Libro(3, 2006, "Jesus"));
	}

	public static void imprimirPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
		for (int i = 0; i < listaPublicaciones.size(); i++) {
			System.out.println(listaPublicaciones.get(i).toString());
		}
	}
	
	public static void filtrarLibrosRevistas (ArrayList<Publicacion> listaPublicaciones) {
		int opcion;
		
		do {
			System.out.println("Que quieres ver");
			System.out.println("1. Libros ");
			System.out.println("2. Revistas");
			System.out.println("Elige una opcion");
			opcion=lector.nextInt();
		} while (opcion!=1 && opcion!=2);
		
		if (opcion==1) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if(listaPublicaciones.get(i).getClass()==Libro.class) {
					Libro libro = (Libro) listaPublicaciones.get(i);
					System.out.println(libro.toString());
				}
			}
		}
		
		if (opcion==2) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if(listaPublicaciones.get(i).getClass()==Revista.class) {
					Revista revista = (Revista) listaPublicaciones.get(i);
					System.out.println(revista.toString());
				}
			}
		}
	}
	
	public static void filtrarPrestado (ArrayList<Publicacion> listaPublicaciones) {
		int opcion;
		
		do {
			System.out.println("Que quieres ver");
			System.out.println("1. Libros ");
			System.out.println("2. Revistas");
			System.out.println("Elige una opcion");
			opcion=lector.nextInt();
		} while (opcion!=1 && opcion!=2);
		
		if (opcion==1) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if (listaPublicaciones.get(i).prestado==true) {
					if(listaPublicaciones.get(i).getClass()==Libro.class) {
						Libro libro = (Libro) listaPublicaciones.get(i);
						System.out.println(libro.toString());
					}
				}
			}
		}
		
		if (opcion==2) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if (listaPublicaciones.get(i).prestado==true) {
					if(listaPublicaciones.get(i).getClass()==Revista.class) {
						Revista revista = (Revista) listaPublicaciones.get(i);
						System.out.println(revista.toString());
					}
				}
			}
		}
	}
	
	public static void publicacionesNoPrestadas (ArrayList<Publicacion> listaPublicaciones) {
		int opcion;
		
		do {
			System.out.println("Que quieres ver");
			System.out.println("1. Libros ");
			System.out.println("2. Revistas");
			System.out.println("Elige una opcion");
			opcion=lector.nextInt();
		} while (opcion!=1 && opcion!=2);
		
		if (opcion==1) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if (listaPublicaciones.get(i).prestado==false) {
					if(listaPublicaciones.get(i).getClass()==Libro.class) {
						Libro libro = (Libro) listaPublicaciones.get(i);
						System.out.println(libro.toString());
					}
				}
			}
		}
		
		if (opcion==2) {
			for (int i=0; i<listaPublicaciones.size(); i++) {
				if (listaPublicaciones.get(i).prestado==false) {
					if(listaPublicaciones.get(i).getClass()==Revista.class) {
						Revista revista = (Revista) listaPublicaciones.get(i);
						System.out.println(revista.toString());
					}
				}
			}
		}
	}
	
	public static void prestarPublicacion (ArrayList <Publicacion> listaPublicaciones) {
		int opcion;
		System.out.println("Seleciona la opcion que quieras prestar");
		
		for (int i=0; i<listaPublicaciones.size(); i++) {
			System.out.println(i + ". " + listaPublicaciones.get(i).toString());
		}
		
		opcion=lector.nextInt();
		
		listaPublicaciones.get(opcion).prestar();
		
		System.out.println("Se ha prestado correctamente");
	}
	
	public static void devolverPublicacion (ArrayList <Publicacion> listaPublicaciones) {
		int opcion;
		System.out.println("Seleciona la opcion que quieras prestar");
		
		for (int i=0; i<listaPublicaciones.size(); i++) {
			System.out.println(i + ". " + listaPublicaciones.get(i).toString());
		}
		
		opcion=lector.nextInt();
		
		listaPublicaciones.get(opcion).devolver();
		
		System.out.println("Se ha devuelto correctamente");
	}

}
