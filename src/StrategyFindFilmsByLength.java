public class StrategyFindFilmsByLength extends SelectorStrategy {
	int length;
	StrategyFindFilmsByLength(int input){
		this.length = input;
	}
	@Override
	public boolean meetsCriteria(Film searchCandidate) {
		return (searchCandidate.getLength() <= length) ? true : false;
	}

}
