public int countHi(String str) {
    if(str.length() <=1 )
      return 0;
    return (str.substring(str.length()-2).equals("hi") ? 1:0 ) + countHi(str.substring(0,str.length()-1));
  }
  