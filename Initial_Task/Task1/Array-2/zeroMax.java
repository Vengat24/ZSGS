public int[] zeroMax(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] == 0 ){
        int j=nums.length-1;
        int max=0;
        while(j>i){
          if(nums[j] % 2 == 1)
            max = Math.max(max,nums[j]);
          j--;
        }
        nums[i] = max;
      }
      i++;
    }
    return nums;
  }
  