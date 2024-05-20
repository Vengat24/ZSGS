public boolean scoresClump(int[] scores) {
    for(int i=0;i<=scores.length-3;i++){
      if(scores[i+1] -scores[i] + scores[i+2] - scores[i+1] == 2)
          return true;
    }
    return false;
  }
  