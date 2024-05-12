public String changePi(String str) {
    if(str.length() <=1)
      return str;
    else if (str.substring(str.length()-2).equals("pi")) 
     return changePi(str.substring(0,str.length()-2)) +"3.14";
    return  changePi(str.substring(0,str.length()-1)) + str.charAt(str.length()-1) ;
  }
  