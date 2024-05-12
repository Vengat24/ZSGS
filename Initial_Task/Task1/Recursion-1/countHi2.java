public int countHi2(String str) {
    if(str.length() <=1)
      return 0;
    return str.substring(str.length()-2).equals("hi")? (str.length()>=3 && str.charAt(str.length()-3) == 'x')? countHi2(str.substring(0,str.length()-3)) : 1 + countHi2(str.substring(0,str.length()-2))  : countHi2(str.substring(0,str.length()-1)) ;  
  }
  