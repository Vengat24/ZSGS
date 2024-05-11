public int[] fizzArray3(int start, int end) {
    int Array[] = new int[end-start];
    int i=0;
    while(i<Array.length){
      Array[i] = start + i;
      i++;
    }
    return Array;
  }
  