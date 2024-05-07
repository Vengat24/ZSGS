public boolean twoAsOne(int a, int b, int c) {
    if(a+b == c)
      return true;
    else if(a+c ==b)
      return true;
    return (b+c == a);
  }
  
