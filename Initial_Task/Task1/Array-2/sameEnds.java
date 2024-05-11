public boolean sameEnds(int[] nums, int len) {
    int i=0;
    while(i<len){
      if(nums[i] != nums[nums.length-len+i])
        return false;
      i++;  
    }
    return true;
    
  }
  