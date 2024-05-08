public String mixString(String a, String b) {
    String out="";
    int Len = Math.min(a.length(),b.length());
    for(int i=0;i<Len;i++){
      out=out+a.charAt(i)+b.charAt(i);
    }
    if(Len == a.length())
      return out + b.substring(Len);
    return out + a.substring(Len); 
  }
  