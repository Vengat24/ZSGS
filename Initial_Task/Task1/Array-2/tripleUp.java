public boolean tripleUp(int[] nums) {
    int i=0;
    while(i<nums.length-2){
      if(nums[i+1] == nums[i] +1 && nums[i+2] == nums[i+1] +1)
        return true;
      i++;  
    }
    return false;
  }
  