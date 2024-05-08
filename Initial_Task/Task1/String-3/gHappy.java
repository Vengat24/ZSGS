public boolean gHappy(String str) {
  
    for(int i=0;i<str.length();i++){
      if(str.equals("g"))
        return false;
      else if(str.charAt(i) == 'g'){
        if(i>=1 && i< str.length()-1  && !(str.charAt(i-1) == 'g' || str.charAt(i+1)== 'g'))
          return false;
        else if(i<1 && !(str.charAt(i+1) == 'g'))
          return false;
        else if(i>=str.length()-1  && !(str.charAt(i-1) == 'g'))
          return false;
      }
    }
    return true;
  }
  