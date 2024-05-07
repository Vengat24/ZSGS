public boolean evenlySpaced(int a, int b, int c) {
    if(a==b && b==c){
      return true;
    }
    else if(a<b && a<c){
      if(b<c)
        return b-a == c-b;
      return c-a == b-c;
    }
    else if(b<c && b<a)
    {
      if(a<c)
        return a-b == c-a;
      return c-b == a-c;
    }
    else if(c<a && c<b){
      if(a<b)
        return a-c == b-a;
      return b-c == a-c;
    }
    return false;
  }