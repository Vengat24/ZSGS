public boolean has12(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] == 1){
        int j=i+1;
        while(j<nums.length){
          if(nums[j] == 2)
            return true;
          j++;  
        }
        return false;
      }
      else 
        i++;
    }
    return false;
  }
  