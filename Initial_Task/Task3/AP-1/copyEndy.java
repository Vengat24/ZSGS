public int[] copyEndy(int[] nums, int count) {
    int Out[]=new int[count];
    int i=0;
    int j =0;
    while(i<Out.length){
      if(isEndy(nums[j])){
        Out[i] = nums[j];
        i++;
      }
      j++;
    }
    return Out;
  }
  public boolean isEndy(int n){
    return ((n>=0 && n<=10 ) || (n>=90 && n<=100));
  }