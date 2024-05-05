public String lastChars(String a, String b) {
    String A="",B="";
    if(a.length()>=1 && b.length()>=1){
      A =a.substring(0,1);
      B = b.substring(b.length()-1);
    }
    else if (a.length()<1 && b.length()>=1){
      A ="@";
      B = b.substring(b.length()-1);
    }
    else if(b.length()<1&& a.length()>=1 ){
      A =a.substring(0,1);
      B = "@";
    }
    else{
      A="@";
      B="@";
    }
    return  A+B;
  }