public String left2(String str) {
    String out ="";
   if(str.length()>2)
     out=str.substring(2);
   return out + str.substring(0,2); 
 }
 