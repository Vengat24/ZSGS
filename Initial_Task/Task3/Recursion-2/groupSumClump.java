public boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length)
      return target == 0;
    int clump=nums[start];
    int i=start+1;
    for(;i<nums.length;i++){
      if(nums[start] == nums[i])
        clump += nums[i];
      else
        break;
    }
    if(groupSumClump(i,nums,target-clump))
        return true;
    else if(groupSumClump(i,nums,target))
          return  true;
    return false;
  }
  