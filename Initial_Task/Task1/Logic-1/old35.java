public boolean old35(int n) {
    if(n%3 == 0 && n%5 !=0)
      return true;
    return (n%5 == 0 && n%3 != 0);
  }
  