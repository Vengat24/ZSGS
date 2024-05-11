public int countClumps(int[] nums) {
    int i=0;
    int count=0;
    while(i<nums.length-1){
      if(nums[i] == nums[i+1]){
        count++;
        int j=i;
        while(j<nums.length-1){
          if(nums[j] == nums[j+1])
            j++;
          else
            break;
        }
        i=j;
      }
      i++;
    }
    return count;
  }
  