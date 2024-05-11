public int[] tenRun(int[] nums) {
    int flag = 0;
    int i=0;
    int num=0;
    while(i<nums.length){
      if(nums[i] % 10 == 0){
        flag = 1;
        num = nums[i];
      }
      if(flag == 1 )
        nums[i] = num;
      i++;  
    }
    return nums;
  }
  