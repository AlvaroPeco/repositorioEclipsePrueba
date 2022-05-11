public class Revista extends Publicacion {
	private int numeroRevista;

	public Revista(int codigo, int a�o, int numeroRevista) {
		super(codigo, a�o);
		this.numeroRevista = numeroRevista;
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	@Override
	public String toString() {
		return "Revista [codigo=" + codigo + " a�o=" + a�o + " numeroRevista=" + numeroRevista + " prestado= " + prestado + "]";
	}

}
