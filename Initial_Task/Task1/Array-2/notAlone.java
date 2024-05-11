public int[] notAlone(int[] nums, int val) {
    int i=1;
    while(i<nums.length-1){
      if(nums[i] == val){
        if(nums[i-1] != val && nums[i+1] != val){
          nums[i] = Math.max(nums[i-1],nums[i+1]);
        }
      }
      i++;
    }
    return nums;
  }
  