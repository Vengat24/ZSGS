public int countTriple(String str) {
    int count=0;
    if(str.length()>=3){
      for(int i=0;i<str.length()-2;i++){
        if(str.charAt(i) == str.charAt(i+1))
          if(str.charAt(i+1) == str.charAt(i+2))
            count++;
      }
    }
    return count;
  }
  