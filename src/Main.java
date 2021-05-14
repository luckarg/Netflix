import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Serie> series = new ArrayList<Serie>();
		series.add(new Serie("Hannibal","suspense","Bryan Fuller",3,39*40*60));
		series.add(new Serie("V","adventure","Kenneth Johnson",1,19*40*60));
		series.add(new Serie("The Simpsons","comedy","Matt Groening",34,731*22*60));
		series.add(new Serie("Family Guy","comedy","Seth MacFarlane",21,369*22*60));
		series.add(new Serie("Homeland","drama","Alex Gansa",8,96*55*60));
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(new Pelicula("Star Wars","sci-fi","George Lucas",1977,7285));
		peliculas.add(new Pelicula("The Empire Strikes Back","sci-fi","Irvin Kershner",1980,7483));
		peliculas.add(new Pelicula("Return of the Jedi","sci-fi","Richard Marquand",1983,7989));
		peliculas.add(new Pelicula("The Force Awakens","sci-fi","J.J. Abrams",2015,8125));
		peliculas.add(new Pelicula("The Last Jedi","sci-fi","Rian Johnson",2017,9017));

		int film=0;
		int ss=0;
		int recent=0;
		int season=0;
	
		
		try {
			peliculas.get(1).marcarVisto();
			peliculas.get(3).marcarVisto();
			series.get(2).marcarVisto();
			series.get(3).marcarVisto();
			
			System.out.println("Movies already seen:");
			for (int i=0; i<peliculas.size();i++) {
				if(peliculas.get(i).visto) {
					System.out.println(peliculas.get(i).toString()+peliculas.get(i).tiempoVisto());
				}
				if(peliculas.get(i).getYear()>recent) {
					recent=peliculas.get(i).getYear();
					film=i;
				}
			}
			
			System.out.println("Series already seen:");
			for(int i=0; i<series.size();i++) {
				if(series.get(i).visto) {
					System.out.println(series.get(i).toString()+series.get(i).tiempoVisto());
				}
				if(series.get(i).getCantTemporadas()>season) {
					season=series.get(i).getCantTemporadas();
					ss=i;
				}
			}
			
			recent=peliculas.get(0).getYear();
			System.out.println("More recent film: \n" +peliculas.get(film).toString()+peliculas.get(film).esVisto());	

			season=series.get(0).getCantTemporadas();
			System.out.println("Serie with more seasons: \n"+series.get(ss).toString()+series.get(ss).esVisto());
		} catch (Exception e) {
			System.out.println("Ooops, something went wrong!");
		}
		
	}

}
