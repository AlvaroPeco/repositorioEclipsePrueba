public class Publicacion {
	protected int codigo;
	protected int año;
	protected boolean prestado;

	public Publicacion(int codigo, int año) {
		super();
		this.codigo = codigo;
		this.año = año;
		this.prestado = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", año=" + año + ", prestado=" + prestado + "]";
	}
	
	public void prestar () {
		prestado=true;
	}
	
	public void devolver () {
		prestado=false;
	}

}
