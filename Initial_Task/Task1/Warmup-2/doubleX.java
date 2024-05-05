boolean doubleX(String str) {
    int num=str.indexOf("x");
      if (num>=0 && num < str.length()-1 && str.substring(num,num+2).equals("xx"))
        return true;
    return false;    
  }
  