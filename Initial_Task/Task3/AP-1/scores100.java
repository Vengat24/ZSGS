public boolean scores100(int[] scores) {
    for(int i=0;i<scores.length;i++){
      if(scores[i] == 100 && i<scores.length-1)
        if(scores[i+1] == 100)
          return true;
    }
    return false;
  }
  