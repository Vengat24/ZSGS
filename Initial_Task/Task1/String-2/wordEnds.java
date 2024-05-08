public String wordEnds(String str, String word) {
    String out="";
    int len =word.length();
    int i=0;
    while(i<=str.length()-len){
      if(str.equals(word))
        return "";
      else if(i>0 && i<str.length()-len && str.substring(i,i+len).equals(word))
        out=out+ str.charAt(i-1) +str.charAt(len+i);
      else if(i<=0 && str.substring(i,i+len).equals(word))
        out=out+ str.charAt(len+i);
      else if(i>=str.length()-len && str.substring(i,i+len).equals(word))
        out=out+str.charAt(i-1);
      i++;
    }
    return out;
  }
  