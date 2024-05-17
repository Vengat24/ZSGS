
public class Main
{
    public static int sub(String str1,String str2){
        int len=str2.length();
        int i=0;
        while(i<str1.length()-len){
            if(str1.substring(i,i+len).equals(str2))
                return i;
            i++;
        }
        return -1;
    }
	public static void main(String[] args) {
	    String str1= "test123string";
        String str2 = "123";
        
		System.out.println(sub(str1,str2));
	}
}
