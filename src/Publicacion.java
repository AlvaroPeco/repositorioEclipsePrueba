public class Publicacion {
	protected int codigo;
	protected int a�o;
	protected boolean prestado;

	public Publicacion(int codigo, int a�o) {
		super();
		this.codigo = codigo;
		this.a�o = a�o;
		this.prestado = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", a�o=" + a�o + ", prestado=" + prestado + "]";
	}
	
	public void prestar () {
		prestado=true;
	}
	
	public void devolver () {
		prestado=false;
	}

}
