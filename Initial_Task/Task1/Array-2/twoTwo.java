public boolean twoTwo(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] == 2){
        if(nums.length == 1)
          return false;
        else if(i< nums.length-1 && nums[i+1]==2)
          i+=1;
        else if(i==nums.length-1 && nums[i-1] == 2)
          i+=1;
        else 
          return false;
      }
      i+=1;
    }
    return true; 
  }
  