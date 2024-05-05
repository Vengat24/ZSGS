public boolean array123(int[] nums) {
    for(int i=0;i<nums.length-2;i++)
      if (nums[i] == 1 )
        if(nums[i+1] == 2)
          if(nums[i+2] == 3)
            return true;
    return false;        
  }