public int scoresSpecial(int[] a, int[] b) {
    return Largest(a) + Largest(b);
  }
  public int Largest(int[] nums){
    int large=0;
    for(int num : nums){
      if(num%10 == 0)
        large = Math.max(large,num);
    }
    return large;
  }