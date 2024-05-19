public boolean helper(int start,int[] nums,int group1, int group2){
    if(start == nums.length)
      return group1%10 == 0 && group2%2 == 1;
    return helper(start+1,nums,group1+nums[start],group2) || helper(start+1,nums,group1,group2+nums[start]);
  }
  public boolean splitOdd10(int[] nums) {
    return helper(0,nums,0,0);
  }
  