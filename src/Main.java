import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Initializer.initialize();
		FilmCatalog catalog = FilmCatalog.getInstance();
		System.out.print("entire film catalog:\n");
		System.out.print(catalog.toString());
		System.out.print("\nSearch by title results:\n");
		printFilms(catalog.findFilmsByTitle("california"));
		System.out.print("Search by description results:\n");
		printFilms(catalog.findFilmsByDescription("scientist"));
		System.out.print("Search by length results:\n");
		printFilms(catalog.findFilmsByLength(100));
		System.out.print("Search by rating results:\n");
		printFilms(catalog.findFilmsByRating(Film.FilmRating.PG_13));
	}
	public static void printFilms(ArrayList<Film> films) {
		StringBuilder output = new StringBuilder();
		Iterator<Film> itr = films.iterator();
		Film film;
		while (itr.hasNext()) {
			film = itr.next();
			output.append(film.toString());
			output.append("\n");
		}
		System.out.print(output.toString());
		System.out.print("\n");
	}
}
