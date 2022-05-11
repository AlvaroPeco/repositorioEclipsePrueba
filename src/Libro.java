public class Libro extends Publicacion {
	private String nombreAutor;

	public Libro(int codigo, int año, String nombreAutor) {
		super(codigo, año);
		this.nombreAutor = nombreAutor;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + " año=" + año + " nombreAutor=" + nombreAutor + " prestado= " + prestado + "]";
	}

}
