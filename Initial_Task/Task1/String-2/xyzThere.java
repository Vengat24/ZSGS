public boolean xyzThere(String str) {
    int count=0;
    for(int i=0;i<str.length()-2;i++){
      if(i<=str.length()-4 && str.substring(i,i+4).equals(".xyz") )
        count--;
      else if(str.substring(i,i+3).equals("xyz"))
        count++;
    }
    return count>=1;
  }
  