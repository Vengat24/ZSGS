public int greenTicket(int a, int b, int c) {
    if(a==b && b==c)
      return 20;
    else if(a==b || a==c || b==c )
      return 10;
    return 0;
  }