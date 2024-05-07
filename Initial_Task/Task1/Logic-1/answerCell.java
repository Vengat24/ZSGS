public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if(isMorning)
      return isMom &&!(isAsleep);
    return !(isAsleep);  
  }
  