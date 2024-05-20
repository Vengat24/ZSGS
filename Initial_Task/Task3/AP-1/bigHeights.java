public int bigHeights(int[] heights, int start, int end) {
    int count = 0;
    for(int i =start;i<end;i++){
      count += count(heights[i],heights[i+1]);
    }
    return count;
  }
  public int count(int num1,int num2){
    if(Math.abs(num1-num2) >= 5)
      return 1;
    return 0;
    
  }