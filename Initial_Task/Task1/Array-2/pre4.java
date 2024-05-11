public int[] pre4(int[] nums) {
    int i=0;
    while(i<nums.length){
      if(nums[i] == 4){
        int j=0;
        int New[] = new int[i];
        while(j<i){
          New[j] = nums[j];
        j++;
        }
       return New;
      }
      i++;
    }
    return nums;
  }
  