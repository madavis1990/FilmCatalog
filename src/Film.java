public class Film {
	public enum FilmRating {
		G, PG, PG_13, R, NC_17, X, UR
	}
	private int	filmID;
	private String	title;
	private String	description;
	private String	releaseYear;
	private int	length;
	private FilmRating	filmRating;
	public Film(int filmID, String title, String description, String releaseYear, int length, FilmRating filmRating) {
		super();
		this.filmID = filmID;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.length = length;
		this.filmRating = filmRating;
	}
	public int getFilmID() {
		return filmID;
	}
	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public FilmRating getFilmRating() {
		return filmRating;
	}
	public void setFilmRating(FilmRating filmRating) {
		this.filmRating = filmRating;
	}
	@Override
	public String toString() {
		return "Film [filmID=" + filmID + ", title=" + title + ", description=" + description + ", releaseYear="
				+ releaseYear + ", length=" + length + ", filmRating=" + filmRating + "]";
	}
}
