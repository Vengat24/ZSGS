public List<Integer> square56(List<Integer> nums) {
    return nums.stream().map(n->n*n+10).filter(n->n%10!=5 && n%10!=6).collect(Collectors.toList()); 
   }
   