public boolean canBalance(int[] nums) {
    int mid = 0;
    while(mid<nums.length-1){
      int left_sum=0,right_sum=0;
      int left =0;
      while(left<= mid)
      {
        left_sum += nums[left];
        left++;
      }
      int right=mid+1;
      while(right<nums.length){
        right_sum += nums[right];
        right++;
      }
      if(left_sum == right_sum)
        return true;
      mid++;
    }
    return false;
  }
  