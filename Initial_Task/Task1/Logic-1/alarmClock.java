public String alarmClock(int day, boolean vacation) {
    String WD="7:00", WE = "10:00";
    if(vacation){
      WD = WE;
      WE = "off";
    }
    if(day>0 && day<6)
      return WD;
    return WE;  
  }
  