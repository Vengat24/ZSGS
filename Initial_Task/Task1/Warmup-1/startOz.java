public String startOz(String str) {
    String char1="";
    String char2="";
    if(str.length()>=1 && str.charAt(0) == 'o')
      char1 = "o";
    if(str.length()>=2 && str.charAt(1) == 'z')
      char2 = "z";
    return char1+char2;  
  }
  