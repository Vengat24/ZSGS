public int[] biggerTwo(int[] a, int[] b) {
    int large[] = a;
    if(a[0] + a[1] < b[0] + b[1] )
      large =b;
    return large;  
  }
  