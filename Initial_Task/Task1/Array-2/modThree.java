public boolean modThree(int[] nums) {
    int i=0;
    while(i<nums.length-2){
      if(nums[i] %2 == 0 && nums[i+1] %2 ==0 && nums[i+2] %2 ==0)
        return true;
      else if(nums[i]%2 == 1 && nums[i+1] %2 ==1 && nums[i+2] %2 == 1)
        return true;
      i++;  
    }
    return false;
  }
  