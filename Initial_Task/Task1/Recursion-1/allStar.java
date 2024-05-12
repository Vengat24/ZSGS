public String allStar(String str) {
    if(str.length() <= 1)
      return str;
    return allStar(str.substring(0,str.length()-1)) + "*" + str.charAt(str.length()-1);
  }
  