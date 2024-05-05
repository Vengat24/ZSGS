public boolean posNeg(int a, int b, boolean negative) {
    if (negative == true && a<0 && b<0)
      return true;
    else if (negative == false)
      if (a<0 && b>0)
        return true;
      else if(a>0 && b<0)
        return true;
      else
        return false;
    else
      return false;
  }