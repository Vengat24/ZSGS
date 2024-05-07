public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    if(equalOk && (b>=a && c>=b))
      return true;
    return b>a && c>b;
  }
  