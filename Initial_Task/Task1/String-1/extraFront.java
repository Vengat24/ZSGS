public String extraFront(String str) {
    String out="";
    if(str.length()>=2)
      out=str.substring(0,2);
    else
      out=str;
    return out+out+out;  
  }
  