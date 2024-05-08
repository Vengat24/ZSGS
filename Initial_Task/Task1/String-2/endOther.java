public boolean endOther(String a, String b) {
    String A =a;
    String B = b;
    if(a.length()<b.length()){
      A=b;
      B=a;
    }
    return A.substring(A.length()-B.length()).toLowerCase().equals(B.substring(0).toLowerCase());
  }
  