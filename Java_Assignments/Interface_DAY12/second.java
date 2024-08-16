package Interface_DAY12;
/*2. Define an interface named Playable with methods
 *like play() , pause() , and stop() . Implement this
 *interface in classes representing different types 
 *of music players such as MP3Player , CDPlayer , and
 *StreamingPlayer . Allow the user to control the playback
 *of these players through the implemented interface.*/

interface Playable{
	void play();
	void pause();
	void stop();
}
class MP3Player implements Playable{
	public void play() {
		System.out.println("MP3 Player is Playing");
	}
	public void pause() {
		System.out.println("MP3 Player is Paused");
	}
	public void stop() {
		System.out.println("MP3 Player is Stopped");
	}
	public void funsuper() {
		play();
	}
	
}
class CDPlayer implements Playable{
	public void play() {
		System.out.println("CD Player is Playing");
	}
	public void pause() {
		System.out.println("CD Player is Paused");
	}
	public void stop() {
		System.out.println("CD Player is Stopped");
	}
	
}
class StreamingPlayer implements Playable{
	public void play() {
		System.out.println("Streaming Player is Playing");
	}
	public void pause() {
		System.out.println("Streaming Player is Paused");
	}
	public void stop() {
		System.out.println("Streaming Player is Stopped");
	}
	
}
public class second {

	public static void main(String[] args) {
		Playable p1 = new MP3Player();
		Playable p2 = new CDPlayer();
		Playable p3 = new StreamingPlayer();
		p1.play();
		p1.pause();
		p1.stop();
		p1.funsuper();
		p2.play();
		p2.pause();
		p2.stop();
		p3.play();
		p3.pause();
		p3.stop();

	}

}
