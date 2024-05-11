public boolean haveThree(int[] nums) {
    int count=0;
    for(int i=0;i<nums.length;i++){
      if(i== nums.length-1 && nums[i] ==3)
        count++;
      else if(nums[i] == 3 && i<nums.length-1){
        if(nums[i+1] == 3)
          return false;
        else 
          count++;
      }
    }
    return count==3;
  }
  