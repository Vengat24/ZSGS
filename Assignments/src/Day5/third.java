package Day5;

abstract class Movie{
	public abstract void getDetails() ;
}
class RomComMovie extends Movie{
	@Override
	public void getDetails() {
		System.out.println("RomComMovie");
	}
}
protected void finalize(){

	List
}


class ThrillerMovie extends Movie{
	@Override
	public void getDetails() {
		System.out.println("ThrillerMovie");
	}
	
}




public class third {
	
	public static void main(String[] args) {
		Movie r1 = new RomComMovie();
		Movie t1 = new ThrillerMovie();
		r1.getDetails();
		t1.getDetails();
	}

}
