public boolean isEverywhere(int[] nums, int val) {
    for(int i=0;i<nums.length-1;i++){
      if(nums[i] != val){
        if(i<1 && nums[i+1] != val)
          return false;
        else if(i>=nums.length-1 && nums[i-1] != val)
          return false;
        else if(i>1 && i<nums.length-1 && (nums[i-1] != val || nums[i+1] != val ))
          return false;
      }
    }
    return true;
  }
  