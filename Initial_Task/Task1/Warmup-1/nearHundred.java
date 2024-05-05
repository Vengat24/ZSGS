public boolean nearHundred(int n) {
    if (10 >= Math.abs(n-100) || 10>= Math.abs(n-200))
      return true;
    else
      return false;
  }
  