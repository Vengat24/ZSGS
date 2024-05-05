public boolean arrayFront9(int[] nums) {
    int len=4;
    if (nums.length<4)
      len = nums.length;
    for (int i=0;i<len;i++)
      if (nums[i] == 9)
        return true;
    return false;    
    
  }
  
