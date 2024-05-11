public boolean has77(int[] nums) {
    for(int i=0; i<nums.length; i++){
      if(nums[i] == 7 ){
        if(nums.length - i -1>= 1 && nums[i+1]==7)
          return true;
        else if(nums.length-i-1 >= 2 && nums[i+2] == 7)
          return true;
      }
    }
    return false;
  }
  