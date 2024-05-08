public boolean xyBalance(String str) {
    boolean flag = true;
    for(int i=str.length()-1;i>=0 ;i--){
      if(flag && str.charAt(i) == 'x')
        return false;
      else if(str.charAt(i) == 'y')
        flag =false;
      else if(!flag && str.charAt(i) =='x')
        return true;
    }
    return true;
  }
  