public boolean helper(int start,int nums[], int group1, int group2){
    if(start == nums.length)
      return group1 == group2;
    if(nums[start]%5 == 0)
      return helper(start+1,nums,group1+nums[start],group2);
    else if(nums[start]%3 == 0)
      return  helper(start+1,nums,group1,group2+nums[start]);
    return helper(start+1,nums,group1+nums[start],group2) || helper(start+1,nums,group1,group2+nums[start]);
      
  }
  public boolean split53(int[] nums) {
    return helper(0,nums,0,0);
  }
  