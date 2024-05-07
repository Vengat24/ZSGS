public int caughtSpeeding(int speed, boolean isBirthday) {
    int speed1 = 60, speed2 = 80;
    if(isBirthday){
      speed1+=5;
      speed2+=5;
    }
    if(speed<=speed1)
      return 0;
    else if (speed<=speed2)
      return 1;
    else
      return 2;
  }
  