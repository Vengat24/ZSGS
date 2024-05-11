public int[] zeroFront(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] != 0){
        int j=i+1;
        while(j<nums.length){
          if(nums[j] == 0){
            int temp=nums[i];
            nums[i] = nums[j];
            nums[j] =temp;
          }
          j++;
        }
      }
      i++;
    }
    return nums;
  }
  