public int max1020(int a, int b) {
    if (a>=10 && a<=20 || b>=10 && b<=20)
      if (a>b && a<=20 ||b>20 )
        return a;
      else
        return b;
    else
      return 0;
  }
  