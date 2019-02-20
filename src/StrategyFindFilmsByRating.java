public class StrategyFindFilmsByRating extends SelectorStrategy {
	Film.FilmRating rating;
	StrategyFindFilmsByRating(Film.FilmRating input){
		this.rating = input;
	}
	@Override
	public boolean meetsCriteria(Film searchCandidate) {
		return ((searchCandidate.getFilmRating().compareTo(rating)) < 1) ? true : false;
	}

}
