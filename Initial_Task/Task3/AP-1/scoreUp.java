public int scoreUp(String[] key, String[] answers) {
    int score = 0;
    int i=0;
    while(i<key.length){
      if(key[i].equals(answers[i]))
        score+=4;
      else if(answers[i].equals("?"))
        score+=0;
      else
        score-=1;
      i++;
    }
    return score;
  }
  