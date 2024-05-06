public String deFront(String str) {  
    String first="",second="";
    if(str.length()>=2)
      if(str.substring(0,1).equals("a"))
        first="a";
      if (str.substring(1,2).equals("b"))
        second="b";
    return first + second + str.substring(2);    
  }