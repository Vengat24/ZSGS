public String changeXY(String str) {
    if(str.equals(""))
      return "";
    return changeXY(str.substring(0,str.length()-1)) + (str.charAt(str.length()-1) == 'x' ? 'y':str.charAt(str.length()-1));
  }
  