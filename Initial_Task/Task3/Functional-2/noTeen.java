public List<Integer> noTeen(List<Integer> nums) {
    return nums.stream().filter(n->n<=12||n>=20).collect(Collectors.toList());
    
  }
  