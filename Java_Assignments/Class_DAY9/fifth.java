package Class_DAY9;
/*5. Write two DTO classes to exhibit the 
 * has-a relationship given in the diagram.
 */

class Team{
	protected String Name;
	protected String City;
	protected String Division;
	public void setTeam(String name,String city,String division) {
		Name  = name;
		City = city;
		Division = division;
	}
	public void playGame(){
		System.out.println(Name + " is Playing Game");
	}
	public void hireCoach() {
		System.out.println("Coach is Hired!");
	}
}
class Player extends Team{
	protected String Position;
	protected int JerseyNo;
	public void setPlayer(String name,String city,String division,String position,int jerseyNo) {
		Name = name;
		City = city;
		Division = division;
		Position = position;
		JerseyNo = jerseyNo;
	}
	public void playGame(){
		System.out.println(Name + " is Playing Game");
	}
	public void train(){
		System.out.println(Name + " started Training..");
	}
}
public class fifth {

	public static void main(String[] args) {
		Player p = new Player();
		Team t = new Team();
		p.setPlayer("Vengatesh ", "Chennai", "Injambakkam", "Defence", 7);
		t.setTeam("Vengat", "Chennai", "Injambakkam");
		p.playGame();
		t.playGame();
	}

}
