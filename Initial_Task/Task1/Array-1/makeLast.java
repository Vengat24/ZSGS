public int[] makeLast(int[] nums) {
    int num[] = new int[nums.length * 2];
    num[num.length-1]=nums[nums.length-1];
    return num;
  }