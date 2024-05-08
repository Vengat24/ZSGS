public String repeatSeparator(String word, String sep, int count) {
    String out="";
    for(int i=0;i<count;i++){
      out = out + word;
      if(i != count-1)
        out=out + sep;
    }
    return out;
  }
  