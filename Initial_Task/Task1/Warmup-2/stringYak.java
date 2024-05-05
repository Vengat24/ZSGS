public String stringYak(String str) {
    String out="";
    for(int i=0;i<str.length();i++)
      if(i+3 <= str.length() && str.substring(i,i+3).equals("yak"))
        i+=2;
      else
        out+=str.charAt(i);
    return out;
    
  }