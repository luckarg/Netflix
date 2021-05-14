

public class Serie  extends CinematicArts{

	private int cantTemporadas=1; //Por default, el número de temporadas es 1.

	public Serie() {
	}
	public Serie(String titulo, String creador) {
		super(titulo, creador);
	}
	public Serie(String titulo, String genero, String creador, int cantTemporadas, int duracion) {
		super(titulo, genero, creador, duracion);
		this.cantTemporadas = cantTemporadas;
	}

	public int getCantTemporadas() {
		return cantTemporadas;
	}
	public void setCantTemporadas(int cantTemporadas) {
		this.cantTemporadas = cantTemporadas;
		
	}
	@Override
	public String toString() {
		return "" + titulo + ", " + cantTemporadas + " seasons, " + duracionShort() + ", genre: " + genero + ", created by " + creador + ".";
	}
		
}
