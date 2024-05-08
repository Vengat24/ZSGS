public String starOut(String str) {
    if(str.length() <=1 && str!="*")
      return str;
    String out="";
    int i=0;
    while(i<str.length()){
      if(i<1 && str.charAt(i) !='*' && str.charAt(i+1) !='*')
        out=out+str.charAt(i);
      else if(i>=1 && i< str.length()-1 && str.charAt(i-1) != '*' && str.charAt(i) != '*' && str.charAt(i+1) != '*' )
        out=out+str.charAt(i);
      else if(i>=str.length()-1 && str.charAt(i) != '*' && str.charAt(i-1) !='*')
        out=out+str.charAt(i);
      i++;  
    }
    return out;
  }
  