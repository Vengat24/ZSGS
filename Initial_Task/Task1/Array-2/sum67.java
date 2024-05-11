public int sum67(int[] nums) {
    int sum=0;
    int i=0;
    while(i<nums.length){
      if(nums[i] == 6){
        while(i<nums.length){
          if(nums[i] == 7)
            break;
          i++;  
        }
        if(i<=nums.length-1)
          i++;
      }
      else{
        sum+=nums[i];
        i++;
      }
    }
    return sum;
  }
  