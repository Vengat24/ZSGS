public int[] maxEnd3(int[] nums) {
    int out= nums[0];
    if(nums[0]<nums[nums.length-1])
      out=nums[nums.length-1];
    int num[] = {out, out, out};
    return num;
  }
  