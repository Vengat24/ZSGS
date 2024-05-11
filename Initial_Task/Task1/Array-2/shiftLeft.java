public int[] shiftLeft(int[] nums) {
    if(nums.length <= 0)
      return nums;
    int temp = nums[0];
    int i=1;
    while(i<nums.length){
      nums[i-1] = nums[i];
      i++;
    }
    nums[i-1]=temp;
    return nums;
  }
  