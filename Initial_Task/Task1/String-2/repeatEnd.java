public String repeatEnd(String str, int n) {
    String out="";
    for(int i=0;i<n;i++){
      out=out + str.substring(str.length()-n);
    }
    return out;
  }
  