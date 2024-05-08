public String notReplace(String str) {
    String out="";
    int i=0;
    while(i<str.length()){
      if(str.equals("is"))
        return "is not";
      else if(i<1 && str.substring(i,i+2).equals("is") && !(Character.isLetter(str.charAt(i+2)))){
        out+= "is not";
        i+=1;
      }
      else if(i>=1 && i< str.length()-2 && str.substring(i,i+2).equals("is") &&  !(Character.isLetter(str.charAt(i-1)))&& !(Character.isLetter(str.charAt(i+2)))){
        out+= "is not";
        i+=1;
      }
      else if(i==str.length()-2 && str.substring(str.length()-2).equals("is") &&!(Character.isLetter(str.charAt(i-1)))){
        out+= "is not";
        i+=1;
      }
      else 
      out= out + str.charAt(i);
      i+=1;
    }
    return out;
  }
  