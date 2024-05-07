public int makeChocolate(int small, int big, int goal) {
    if(goal%5==0 && goal/5 <= big)
      return 0;
    else if (goal-big*5 <= small &&goal-big*5 >0 )
      return goal-big*5;
    else if(goal%5 <= small && goal/5 <= big)
      return goal%5;
    return -1;  
  }
  