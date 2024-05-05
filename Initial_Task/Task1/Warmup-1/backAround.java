public String backAround(String str) {
    if (str.length()>=1){
      return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
    }
    else
     return str;
   }