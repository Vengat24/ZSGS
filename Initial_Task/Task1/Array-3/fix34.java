public int[] fix34(int[] nums) {
    int i=nums.length-1;
    int j=nums.length-1;
    int skip=0;
    while(i>=0){
      if(nums[i] == 3){
        if(nums[i+1] != 4){
          while(j>=0 ){
            if(nums[j] == 4 && skip != j){
              int temp = nums[i+1];
              nums[i+1] = nums[j];
              nums[j] = temp;
              skip=i+1;
              j--;
              break;
            }
            j--;
          }
        }
      }
      i--;
    }
    return nums;
  }
  