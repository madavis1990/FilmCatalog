import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrategyFindFilmsByTitle extends SelectorStrategy {
	String title;
	StrategyFindFilmsByTitle(String input){
		this.title = input;
	}
	@Override
	public boolean meetsCriteria(Film searchCandidate) {
		//used a regex to perform search since its more challenging and a bit cleaner
		Pattern pattern = Pattern.compile(title, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(searchCandidate.getTitle());
		return (matcher.find());
		
	}

}
