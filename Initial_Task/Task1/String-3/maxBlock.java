public int maxBlock(String str) {
  
    int max=0;
    for(int i=0;i<str.length();i++){
      int count=0;
      for(int j=i;j<str.length();j++){
        if(str.charAt(i) == str.charAt(j))
          count++;
        else
          break;
      }
      max=Math.max(count,max);
    }
    return max;
  }
  