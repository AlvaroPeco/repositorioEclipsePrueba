public class Libro extends Publicacion {
	private String nombreAutor;

	public Libro(int codigo, int a�o, String nombreAutor) {
		super(codigo, a�o);
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
		return "Libro [codigo=" + codigo + " a�o=" + a�o + " nombreAutor=" + nombreAutor + " prestado= " + prestado + "]";
	}

}
