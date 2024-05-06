public String minCat(String a, String b) {
    int len=a.length();
    if(a.length()>b.length())
      len=b.length();
    return a.substring(a.length()-len) + b.substring(b.length()-len);
  }
  