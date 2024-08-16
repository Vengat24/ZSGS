package Exception_DAY14;

public class five {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

	}

}
