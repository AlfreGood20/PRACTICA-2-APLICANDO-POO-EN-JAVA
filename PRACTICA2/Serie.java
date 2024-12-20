package PRACTICA2;
//CODE CREADO POR J.ALFREDO L.D.C
public class Serie implements Entregable {
	private final int NUMERO_DE_TEMPORADA_POR_DEFECTO=3;
	private final boolean ENTREGADO_DEFECTO=false;
	
	//ATRIBUTOS
	private String titulo;
	private int nDeTemporada;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//CONSTRUCTOR POR DEFECTO
	public Serie() {
		this.titulo = "";
		this.nDeTemporada = NUMERO_DE_TEMPORADA_POR_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	
	//CONSTRUCTOR CON TITULO Y CREADOR
	public Serie(String titulo,String creador) {
		this.titulo = titulo;
		this.nDeTemporada = NUMERO_DE_TEMPORADA_POR_DEFECTO;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}
	
	//CONSTRUCTOR TODOS LOS ATRIBUSTOS Y MENOS DE ENTREGADO
	public Serie(String titulo, int nDeTemporada, String genero, String creador) {
		this.titulo = titulo;
		this.nDeTemporada = nDeTemporada;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnDeTemporada() {
		return nDeTemporada;
	}

	public void setnDeTemporada(int nDeTemporada) {
		this.nDeTemporada = nDeTemporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", nDeTemporada=" + nDeTemporada + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	@Override
	public void entregar() {
		entregado = true;
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return entregado;
	}
}