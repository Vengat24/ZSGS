package Day3;

public class five {

	public static void main(String[] args) {
		outer : for(int i=2;i<=30;i++) {
			if(i==2||i==3)
				System.out.println(i);
			else if(i%2==0 || i%3==0|| i%5==0) {
				continue outer;
			}else {
				for(int j=5;j*j<i;j+=6) {
					if(i%j==0 || i%(j+2)==0)
						continue outer;
				}
				System.out.println(i);
			}
		}

	}

}
