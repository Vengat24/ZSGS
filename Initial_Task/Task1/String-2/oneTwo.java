public String oneTwo(String str) {
    String out="";
    for(int i=0;i<str.length()-2;i=i+3){
      out=out+str.substring(i+1,i+3) + str.charAt(i);
    }
    return out;
  }
  