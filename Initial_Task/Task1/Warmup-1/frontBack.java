public String frontBack(String str) {
    if (str.length() >=2)
      return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    else
      return str;
    
  }
  