public int stringMatch(String a, String b) {
    int len=a.length(),count=0;
    if(a.length()>b.length())
      len=b.length();
    for(int i=0;i<len-1;i++)
      if (a.substring(i,i+2).equals(b.substring(i,i+2)))
        count++;
    return count;    
  }