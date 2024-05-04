public String everyNth(String str, int n) {
    String out ="";
    for (int i=0;i<str.length();i++)
     if (i%n == 0)
       out += str.charAt(i);
   return out;    
   }