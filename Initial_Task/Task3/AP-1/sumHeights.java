public int sumHeights(int[] heights, int start, int end) {
    int changes = 0;
    for(int i =start;i<end;i++){
      changes += change(heights[i],heights[i+1]);
    }
    return changes;
  }
  public int change(int num1,int num2){
    return Math.abs(num1-num2);
  }