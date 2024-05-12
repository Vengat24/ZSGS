public String endX(String str) {
    if(str.equals(""))
      return "";
    return  str.charAt(0) == 'x'? endX(str.substring(1,str.length())) +"x" : str.charAt(0) + endX(str.substring(1,str.length()));
  } 
  