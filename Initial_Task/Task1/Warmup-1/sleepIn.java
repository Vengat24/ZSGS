public boolean sleepIn(boolean weekday, boolean vacation) {
    if(vacation == false && weekday == true )
      return false;
    else
      return true;
  }