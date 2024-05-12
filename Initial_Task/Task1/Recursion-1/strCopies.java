public boolean strCopies(String str, String sub, int n) {
    if(str.length() < sub.length())
      return n==0;
    return str.substring(0,sub.length()).equals(sub)? strCopies(str.substring(1),sub,n-1) : strCopies(str.substring(1),sub,n);   
  }
  