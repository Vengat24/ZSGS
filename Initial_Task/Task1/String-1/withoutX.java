public String withoutX(String str) {
    int start=0,end=str.length();
    if(str.length()>=1 && str.charAt(0)=='x')
      start = 1;
    if(str.length()>=2 && str.charAt(str.length()-1)=='x')
      end = str.length()-1;
    return str.substring(start,end);  
  }
  