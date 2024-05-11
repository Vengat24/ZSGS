public boolean linearIn(int[] outer, int[] inner) {
    int i=0;
    while(i<inner.length){
      int count=0;
      int j=0;
      while(j<outer.length){
        if(outer[j] == inner[i])
          count++;
        j++;  
      }
      if(count == 0)
        return false;
      i++;
    }
    return true;
  }
  