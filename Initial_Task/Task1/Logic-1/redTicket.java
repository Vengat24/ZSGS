public int redTicket(int a, int b, int c) {
    if(a==b && b==c){
      if(a==2)
        return 10;
      return 5;
    }
    else if(a!=b && a!=c)
      return 1;
    return 0;
  }