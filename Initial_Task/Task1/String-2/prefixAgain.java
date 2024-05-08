public boolean prefixAgain(String str, int n) {
    String out = str.substring(0,n);
    for(int i=n;i<=str.length()-n;i++){
      if(out.equals(str.substring(i,i+n)))
        return true;
    }
    return false;
  }
  