public String withoutX2(String str) {
    String start="",mid="",end="";
    if(str.length()>=1 && !(str.charAt(0)=='x'))
      start=str.substring(0,1);
    if (str.length()>=2){
      end = str.substring(2);  
      if(!(str.charAt(1) =='x'))
        mid=str.substring(1,2);
    }  
    return start + mid +end;
  }
  