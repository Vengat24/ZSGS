public int[] seriesUp(int n) {
    int New[] = new int[n*(n+1)/2];
    int i=0;
    int range =1;
    while(i<New.length){
      int j=1;
      while(j<=range){
        New[i] = j;
        i++;
        j++;
      }
      range++;
    }
    return New;
  }
  