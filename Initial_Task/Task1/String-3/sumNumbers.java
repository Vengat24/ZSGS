public int sumNumbers(String str) {
    int sum=0;
    int i=0;
    while(i<str.length()){
      String out="";
      if(Character.isDigit(str.charAt(i))){
        int j=i;
        while(j<str.length()){
          if(Character.isDigit(str.charAt(j)))
            out=out+str.charAt(j);
          else 
            break;
          j++;  
        }
        sum+= Integer.parseInt(out);
        i=j;
      }
      else
        i+=1;
    }
    return sum;
  }
  