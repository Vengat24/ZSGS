public boolean either24(int[] nums) {
    boolean flag2 = false;
    boolean flag4 = false;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i] == 2 && nums[i+1] == 2)
        flag2 = true;
      else if(nums[i] ==4 && nums[i+1] == 4)
        flag4 = true;
    }
    return flag2^flag4;
  }
  