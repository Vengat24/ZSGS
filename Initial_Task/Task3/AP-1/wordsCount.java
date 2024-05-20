public int wordsCount(String[] words, int len) {
    int count=0;
    for(String s : words){
      if(s.length() == len)
        count++;
    }
    return count;
  }
  