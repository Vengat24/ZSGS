public int[] squareUp(int n) {
    int New[] = new int[n*n];
    int i= New.length - 1;
    int num = n;
    while(i>=0){
      int j=1;
      while(j<=num){
        New[i] = j;
        j++;
        i--;
      }
      i= i-n+num;
      num--;
    }
    return New;
  }
  