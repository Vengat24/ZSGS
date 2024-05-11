public int[] withoutTen(int[] nums) {
    int New[] = new int[nums.length];
    int i=0;
    int k=0;
    while(i<nums.length){
      if(nums[i] != 10){
        New[k++] = nums[i];
      }
      i++;
    }
    return New;
  }
  