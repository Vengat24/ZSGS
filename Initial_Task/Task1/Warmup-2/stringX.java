public String stringX(String str) {
    String out="";
    for (int i=0;i<str.length();i++)
      if(str.substring(i,i+1).equals("x")){
        if(i == 0 || i == str.length()-1)
         out+=str.charAt(i);
        }
      else
        out+=str.charAt(i);
    return out;    
        
  }