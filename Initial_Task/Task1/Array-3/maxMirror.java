public int maxMirror(int[] nums) {
    int i=0;
    int max=0;
    while(i<nums.length){
      int j=nums.length-1;
      while(j>=0){
        if(nums[i] == nums[j] ){
          int count=0;
          int left=i;
          int right=j;
          while(left<=nums.length-1 && right>=0){
            if(nums[left] == nums[right])
              count++;
            else
              break;
            left++;
            right--;
          }
          max = Math.max(count,max);
        }
        j--;
      }
      i++;
    }
    return max;
  }
  