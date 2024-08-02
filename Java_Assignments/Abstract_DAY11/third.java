package Abstract_DAY11;

import java.util.ArrayList;
import java.util.List;

//4. Create a Movie DTO class
abstract class Movie{
	private String Name;
	private String DOR;
	private String Director;
	private String Hero;
	private int Rate;
	protected String Type;
	
	Movie(String name,String dor,String director,String hero,int rate) {
		Name = name;
		DOR = dor;
		Director  = director;
		Hero = hero;
		Rate = rate;
	}
	
	public abstract String getMovieType();
	
	
	public void getMovie() {
		System.out.println("Movie Name : "+Name);
		System.out.println("Movie Rating : "+getMovieType());
		System.out.println("Date of Release : "+DOR);
		System.out.println("Movie Director : "+Director);
		System.out.println("Movie Hero : "+Hero);
		System.out.println("Movie Rating : "+Rate+"/10");
		System.out.println();
	}
	
	
}

class TamilMovie extends Movie{

	TamilMovie(String name, String dor, String director, String hero, int rate) {
		super(name, dor, director, hero, rate);
	}
	public String getMovieType() {
		return "Tamil Movie";
	}
	
}
class MalayalamMovie extends Movie{

	MalayalamMovie(String name, String dor, String director, String hero, int rate) {
		super(name, dor, director, hero, rate);
	}
	public String getMovieType() {
		return "Malayalam Movie";
	}
	
}
class HindiMovie extends Movie{

	HindiMovie(String name, String dor, String director, String hero, int rate) {
		super(name, dor, director, hero, rate);
	}
	public String getMovieType() {
		return "Hindi Movie";
	}
	
}
public class third {

	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add( new TamilMovie("LEO", "19 October 2023","Lokesh Kanagaraj", "Vijay", 8));
		list.add( new MalayalamMovie("The Goat Life", "28 March 2024", "Blessy","Prithviraj Sukumaran", 8));
		list.add( new HindiMovie("Maidaan", "10 April 2024", "Amit Sharma", "Ajay Devgn", 7));
		
		for(Movie m : list) {
			m.getMovie();
		}
	}

}
