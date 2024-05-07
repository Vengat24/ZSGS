public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if(noDoubles && die1 == die2)
      die2=(die2)%6 +1;
    return die1+die2;  
  }
  