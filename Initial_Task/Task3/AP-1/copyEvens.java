public int[] copyEvens(int[] nums, int count) {
    int Even[] = new int[count];
    int i=0;
    int j=0;
    while(i<Even.length){
      if(nums[j] % 2 == 0){
        Even[i] = nums[j];
        i++;
      }
      j++;
    }
    return Even;
  }
  