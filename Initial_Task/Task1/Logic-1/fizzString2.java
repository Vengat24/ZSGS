public String fizzString2(int n) {
    String out=String.valueOf(n);
    if(n%3 == 0 && n%5 == 0)
      out="FizzBuzz";
    else if(n%3 == 0)
      out="Fizz";
    else if(n%5 == 0)
      out="Buzz";
    return out+"!";
  }
  