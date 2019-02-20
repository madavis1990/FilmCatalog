import java.util.Iterator;

import java.util.ArrayList;

public class FilmCatalog {
	private static FilmCatalog instance=null;
	private ArrayList<Film> films = new ArrayList<>();
	
	private FilmCatalog() {
		
	}
	public static FilmCatalog getInstance() {
		if(instance==null) {
			instance = new FilmCatalog();
		}
		return instance;
	}
	public void add(Film film) {
		films.add(film);
	}
	public Film get(int index) {
		return films.get(index);
	}
	public ArrayList<Film> findFilmsByDescription(String description){
		ArrayList<Film> list = new ArrayList<>();
		SelectorStrategy strategy = new StrategyFindFilmsByDescription(description);
		list = findFilmsByStrategy(strategy);
		return list;
	}
	public ArrayList<Film> findFilmsByLength(int length){
		ArrayList<Film> list = new ArrayList<>();
		SelectorStrategy strategy = new StrategyFindFilmsByLength(length);
		list = findFilmsByStrategy(strategy);
		return list;
	}
	public ArrayList<Film> findFilmsByRating(Film.FilmRating rating){
		ArrayList<Film> list = new ArrayList<>();
		SelectorStrategy strategy = new StrategyFindFilmsByRating(rating);
		list = findFilmsByStrategy(strategy);
		return list;
	}
	public ArrayList<Film> findFilmsByTitle(String title){
		ArrayList<Film> list = new ArrayList<>();
		SelectorStrategy strategy = new StrategyFindFilmsByTitle(title);
		list = findFilmsByStrategy(strategy);
		return list;
	}
	private ArrayList<Film> findFilmsByStrategy(SelectorStrategy strategy) {
		Iterator<Film> itr = films.iterator();
		ArrayList<Film> list = new ArrayList<>();
		Film film;
		while (itr.hasNext()) {
			film = itr.next();
			if(strategy.meetsCriteria(film)) {
				list.add(film);
			}
	    }
		return list;
	}
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		Iterator<Film> itr = films.iterator();
		Film film;
		while (itr.hasNext()) {
			film = itr.next();
			output.append(film.toString());
			output.append("\n");
		}
		return output.toString();
	}
}
