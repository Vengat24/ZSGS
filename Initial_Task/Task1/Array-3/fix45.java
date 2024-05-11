public int[] fix45(int[] nums) {
    int i=nums.length-1;
    int j=nums.length-1;
    int skip=-1;
    while(i>=0){
      if(nums[i] == 4){
        if(nums[i+1] != 5){
          while(j>=0 ){
            if(nums[j] == 5 && skip != j){
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
  
  