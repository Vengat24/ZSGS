public boolean stringE(String str) {
    int count=0;
    for(int i = 0 ; i<str.length();i++){
      if (str.charAt(i) == 'e')
        count+=1;
    }
    if (count>=1 && count <=3)
      return true;
    else
      return false;
  }
  