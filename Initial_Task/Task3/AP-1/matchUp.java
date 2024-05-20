public int matchUp(String[] a, String[] b) {
    int i=0;
    int count=0;
    while(i<a.length){
      if(a[i].length()>0 && b[i].length()>0)
        if(a[i].charAt(0) == b[i].charAt(0))
          count++;
      i++;
    }
    return count;
  }
  