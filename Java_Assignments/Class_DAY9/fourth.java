package Class_DAY9;

import java.util.ArrayList;
import java.util.List;

//4. Create a Movie DTO class
class Movie{
	private String Name;
	private String DOR;
	private String Director;
	private String Hero;
	static int Rate;
	
	Movie(String name,String dor,String director,String hero,int rate) {
		Name = name;
		DOR = dor;
		Director  = director;
		Hero = hero;
		Rate = rate;
	}
	public void getMovie() {
		System.out.println("Movie Name : "+Name);
		System.out.println("Date of Release : "+DOR);
		System.out.println("Movie Director : "+Director);
		System.out.println("Movie Hero : "+Hero);
		System.out.println("Movie Rating : "+Rate+"/10");
		System.out.println();
	}
	
	
}
public class fourth {

	public static void main(String[] args) {
		List<Movie> list = new ArrayList<>();
		list.add( new Movie("LEO", "26/7/2024", "Vetrimaran", "Dhanush", 6));
		list.add( new Movie("LEO", "18/10/2023", "Lokesh", "Vijay", 8));
		list.add( new Movie("Master", "16/1/2022", "Lokesh", "Vijay", 7));
		
		for(Movie m : list) {
			m.getMovie();
		}
	}

}
