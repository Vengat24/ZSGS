public String stringBits(String str) {
    String out="";
    for (int i=0;i<str.length();i++)
      if (i%2 ==0)
        out+=str.charAt(i);
    return out;    
  }