public String plusOut(String str, String word) {
    String out="";
    int i=0;
    int len = word.length();
    while(i<str.length()){
      if(i<=str.length() -len && str.substring(i,i+len).equals(word)){
        out+= word;
        i+=len;
      }
      else
      {
        out+="+";
        i+=1;
      }
    }
    return out;
  }
  