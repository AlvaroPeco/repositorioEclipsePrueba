public class Revista extends Publicacion {
	private int numeroRevista;

	public Revista(int codigo, int año, int numeroRevista) {
		super(codigo, año);
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
		return "Revista [codigo=" + codigo + " año=" + año + " numeroRevista=" + numeroRevista + " prestado= " + prestado + "]";
	}

}
