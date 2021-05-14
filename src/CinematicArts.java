public class CinematicArts implements Visualizable{

	String titulo, genero, creador;
	int duracion = 0;
	boolean visto;
	String esVisto;
	
	
	public CinematicArts() {
			}
	public CinematicArts(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	public CinematicArts(String titulo, String genero, String creador, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		}
	

	public String getTitulo(String titulo) {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public boolean isVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	@Override
	public void marcarVisto() {
		this.visto=true;
	}
	
	@Override
	public String esVisto() {
		return visto ? " Viewed? Yes!" : " Viewed? No!";}
	/* long style	
		  if (visto == true){
	            return " Viewed? Yes!";
	      }else{
	            return " Viewed? No!";
	        }
	    }
	*/

	@Override
	public String tiempoVisto() {		
		if (visto == true){
            	int s = getDuracion() % 60;
                int h = getDuracion() / 60;
                int m = h % 60;
                h = h / 60;
            	return "\n--------Time visualized: " + h + " hours, " + m + " minutes, " + s + " seconds.--------";
            }
		return "";
		}

	public String duracionShort() {		
                int h = getDuracion() / 60;
                int m = h % 60;
                h = h / 60;
            	return h+"h "+m+"m";
		}
}
