public String altPairs(String str) {
    String out="";
    for(int i=0;i<str.length();i++){
      if(i%4 == 0){
        out+= str.substring(i,i+1);
        if (i+1 < str.length())
          out+= str.substring(i+1,i+2);
      }
    }
    return out;  
  }
  