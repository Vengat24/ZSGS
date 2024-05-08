public boolean xyzMiddle(String str) {
    if(str.length()>3){
      for(int i=str.length()/2-2;i<=str.length()/2;i++){
        if(str.length()>=3 &&  str.substring(i,i+3).equals("xyz"))
          return Math.abs(i - (str.length()-i-3) ) <=1;
      }
    }
    return str.equals("xyz");
  }
  