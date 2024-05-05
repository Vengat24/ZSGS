public boolean has271(int[] nums) {
    for(int i=0;i<nums.length-2;i++)
      if(nums[i]+5 == nums[i+1])
        if(nums[i]-1+2 >= nums[i+2] && nums[i]-1-2 <= nums[i+2])
          return true;
    return false;      
  }
  