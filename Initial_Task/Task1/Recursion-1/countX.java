public int countX(String str) {
    if(str.equals(""))
      return 0;
    return ((str.charAt(str.length()-1) == 'x' )? 1 : 0 )+ countX(str.substring(0,str.length()-1) );
    
  }
  