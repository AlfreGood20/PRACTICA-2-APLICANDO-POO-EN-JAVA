package PRACTICA2;
//CODE CREADO POR J.ALFREDO L.D.C
public class Videojuego implements Entregable{
	
	private final int HORAS_ESTIMADAS=10;
	private final boolean ENTREGADO_DEFECTO=false;
	
	private String titulo;
	private int horasEstimada;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.titulo = "";
		this.horasEstimada = HORAS_ESTIMADAS;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimada) {
		this.titulo = titulo;
		this.horasEstimada = horasEstimada;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = "";
		this.compañia = "";
	}

	public Videojuego(String titulo, int horasEstimada, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimada = horasEstimada;
		this.entregado = ENTREGADO_DEFECTO;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimada() {
		return horasEstimada;
	}

	public void setHorasEstimada(int horasEstimada) {
		this.horasEstimada = horasEstimada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimada=" + horasEstimada + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
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