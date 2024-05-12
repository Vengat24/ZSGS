public String noX(String str) {
    if(str.equals(""))
      return "";
    return noX(str.substring(0,str.length()-1)) + (str.charAt(str.length()-1) == 'x' ? "" : str.charAt(str.length()-1)) ;
  }
  