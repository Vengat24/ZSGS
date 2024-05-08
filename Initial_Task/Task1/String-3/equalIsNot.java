public boolean equalIsNot(String str) {
    int Is =0;
    int Not = 0;
    for(int i=0;i<str.length();i++){
      if(i<str.length()-1 && str.substring(i,i+2).equals("is"))
        Is++;
      else if(i<str.length()-2 && str.substring(i,i+3).equals("not"))
        Not++;
    }
    return Is==Not;
  }
  