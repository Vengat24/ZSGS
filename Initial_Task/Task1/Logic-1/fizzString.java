public String fizzString(String str) {
    if(str.charAt(0) == 'f' && str.charAt(str.length()-1) == 'b')
      return "FizzBuzz";
    else if(str.charAt(0) == 'f')
      return "Fizz";
    else if(str.charAt(str.length()-1) == 'b')
      return "Buzz";
    return str;
  }
  