public String mirrorEnds(String string) {
    String out="";
    for(int i=0;i<string.length();i++){
      if(string.charAt(i) == string.charAt(string.length()-i-1))
       out=out+string.charAt(i);
     else 
       break;
    }
    return out;
   }
   