public int last2(String str) {
    if (str.length() <= 2)
      return 0;
    String out = str.substring( str.length()-2,str.length());
    int count=0;
    for (int i=0;i<str.length()-1;i++)
      if(str.substring(i,i+2).equals(out))
        count++;
    return count-1;
  }
  