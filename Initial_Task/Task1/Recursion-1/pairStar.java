public String pairStar(String str) {
    if(str.length()<=1)
      return str;
    return pairStar(str.substring(0,str.length()-1)) +  (str.charAt(str.length()-2) == str.charAt(str.length()-1)? "*" : "" )+str.charAt(str.length()-1);
  }
  