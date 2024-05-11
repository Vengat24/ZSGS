public int maxSpan(int[] nums) {
  int max=1;
  if(nums.length<1)
    max=0;
  int num=0;
  for(int i=0;i<nums.length-1;i++){
    for(int j=nums.length-1;j>i;j--){
      if(nums[i] == nums[j]){
        num =  j+1-i;
        max = Math.max(max,num);
      }  
    }
  }
  return max;
}
