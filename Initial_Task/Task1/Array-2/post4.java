public int[] post4(int[] nums) {
    int i = nums.length-1;
    while(i>=0){
      if(nums[i] == 4){
        int New[] = new int[nums.length-i-1];
        int j=0;
        while(i<nums.length-1){
          New[j] = nums[i+1];
          j++;
          i++;
        }
        return New;
      }
      i--;
    }
    return nums;
  }
  