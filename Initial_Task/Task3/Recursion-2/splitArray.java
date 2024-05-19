public boolean helper(int start,int group1 , int group2, int nums[]){
    if(start == nums.length)
      return group1 == group2;
    return helper(start+1,group1+nums[start],group2,nums) || helper(start+1,group1,group2+nums[start],nums) ;
    
  }
  public boolean splitArray(int[] nums) {
    return  helper(0,0,0,nums); 
  }
  