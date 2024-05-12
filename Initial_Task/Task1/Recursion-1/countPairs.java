public int countPairs(String str) {
    if(str.length() <=2)
      return 0;
    return (str.charAt(0) == str.charAt(2)? 1:0 )  + countPairs(str.substring(1,str.length()));
  }
  