public boolean makeBricks(int small, int big, int goal) {
  if(goal%5==0 && goal/5 <= big)
    return true;
  else if (goal-big*5 <= small &&goal-big*5 >0 )
    return true;
  else if(goal%5 <= small && goal/5 <= big)
    return true;
  return false;
}
