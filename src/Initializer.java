final class Initializer {

	static void initialize() {

		FilmCatalog filmCatalog = FilmCatalog.getInstance();

		filmCatalog.add(new Film(0, "Academy Dinosaur",
				"A Epic Drama of a Feminist And a Mad Scientist who must Battle a Teacher in The Canadian Rockies",
				"2011", 86, Film.FilmRating.PG_13));

		filmCatalog.add(new Film(1, "Barefoot Manchurian",
				"A Intrepid Story of a Cat And a Student who must Vanquish a Girl in An Abandoned Amusement Park",
				"2017", 129, Film.FilmRating.G));

		filmCatalog.add(new Film(2, "Boondock Ballroom",
				"A Fateful Panorama of a Crocodile And a Boy who must Defeat a Monkey in The Gulf of Mexico", "2009",
				76, Film.FilmRating.NC_17));

		filmCatalog.add(new Film(3, "California Birds",
				"A Thrilling Yarn of a Database Administrator And a Robot who must Battle a Database Administrator in Ancient India",
				"2006", 167, Film.FilmRating.PG));

		filmCatalog.add(new Film(4, "Dalmatians Sweden",
				"A Emotional Epistle of a Moose And a Hunter who must Overcome a Robot in A Manhattan Penthouse",
				"2001", 93, Film.FilmRating.R));

		filmCatalog.add(new Film(5, "Eve Resurrection",
				"A Epic Story of a Lumberjack And a Monkey who must Confront a Pioneer in A MySQL Convention", "2001",
				142, Film.FilmRating.G));

		filmCatalog.add(new Film(6, "Frogmen Breaking",
				"An Unbelieveable Yarn of a Mad Scientist And a Cat who must Chase a Lumberjack in Australia", "2005",
				111, Film.FilmRating.PG));

		filmCatalog.add(new Film(7, "Galaxy Sweethearts",
				"A Emotional Reflection of a Womanizer And a Pioneer who must Face a Squirrel in Berlin", "2008", 128,
				Film.FilmRating.NC_17));
		
		filmCatalog.add(new Film(8, "Oklahoma Jumanji",
				"A Thoughtful Drama of a Dentist And a Womanizer who must Meet a Husband in The Sahara Desert", "2018", 58,
				Film.FilmRating.PG_13));
		
		filmCatalog.add(new Film(9, "Rushmore Mermaid",
				"A Fast-Paced Story of a Pioneer And a Astronaut who must Reach a Boat in A Baloon", "2008", 150,
				Film.FilmRating.PG_13));
	}
}
