 
public class Pelicula extends CinematicArts{

	private int year;

	public Pelicula() {
	}
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.visto = false;	//Por default, el visto es false.
	}
	public Pelicula(String titulo, String genero, String creador, int year, int duracion) {
		super(titulo, genero, creador, duracion);
		this.year = year;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		
	}
	@Override
	public String toString() {
		return titulo + ", " + duracionShort() + ", genre: " + genero + ", directed by " + creador + ", premiered in " + year +".";
	}
}




	