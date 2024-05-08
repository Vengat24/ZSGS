public String zipZap(String str) {
    if(str.length()<=2)
      return str;
    String out ="";
    int i=0;
    while(i<str.length()){
      if(i<=str.length()-2 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
        out=out+"zp";
        i+=3;
      }
      else{
        out=out+str.charAt(i);
        i+=1;
      }
      
    }
    return out;
  }
  