public int centeredAverage(int[] nums) {
    int min=nums[0];
    int max=0;
    int count=0;
    int sum=0;
    boolean flag1=true;
    boolean flag2=true;
    for(int i=0;i<nums.length;i++){
      min=Math.min(min,nums[i]);
      max=Math.max(max,nums[i]);
    }
    for(int i=0;i<nums.length;i++){
      if(nums[i] == min && flag1)
        flag1 = false;
      else if(nums[i] == max && flag2)  
        flag2=false;
      else
      {
        sum+=nums[i];
        count++;
      }
    }
    return sum/count;
  }
  