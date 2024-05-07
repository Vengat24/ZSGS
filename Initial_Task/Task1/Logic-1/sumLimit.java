public int sumLimit(int a, int b) {
    int sum = a+b;
    if(String.valueOf(a).length() == String.valueOf(sum).length())
      return sum;
    return a;
  }
  