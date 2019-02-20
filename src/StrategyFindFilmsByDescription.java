import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrategyFindFilmsByDescription extends SelectorStrategy{
	
	String term;
	StrategyFindFilmsByDescription(String input){
		this.term = input;
	}
	@Override
	public boolean meetsCriteria(Film searchCandidate) {
		//used a regex to perform search since its more challenging and a bit cleaner
		Pattern pattern = Pattern.compile(term, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(searchCandidate.getDescription());
		return (matcher.find());
	}
	
}
