public String[] fizzBuzz(int start, int end) {
    String New[] = new String[end - start];
    int i=start;
    while(start<end){
      if(start%3 ==0 && start%5 == 0)
        New[start-i] = "FizzBuzz";
      else if(start%3 == 0)
        New[start-i] = "Fizz";
      else if(start%5 == 0)
        New[start-i] = "Buzz";
      else 
        New[start-i] =String.valueOf(start);
      start++;  
    }
    return New;
  }
  