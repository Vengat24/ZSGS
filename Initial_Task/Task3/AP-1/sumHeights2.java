public int sumHeights2(int[] heights, int start, int end) {
    int changes = 0;
    for(int i =start;i<end;i++){
      changes += change(heights[i],heights[i+1]);
    }
    return changes;
  }
  public int change(int num1,int num2){
    int mul =1;
    if(num1<num2)
      mul=2;
    return Math.abs(num1-num2) *mul;
  }