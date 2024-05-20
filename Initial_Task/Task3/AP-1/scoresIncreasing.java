public boolean scoresIncreasing(int[] scores) {
  int i=0;
  while(i<scores.length-1){
    if(!(scores[i]<=scores[i+1]))
      return false;
    i++;
  }
  return true;
}
