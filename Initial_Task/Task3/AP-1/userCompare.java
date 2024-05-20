public int userCompare(String aName, int aId, String bName, int bId) {
    int num  = aName.compareTo(bName);
    if(num < 0)
      return -1;
    else if(num>0)
      return 1;
    else if(aId > bId)
      return 1;
    else if(bId > aId)
      return -1;
    return 0;
  }
  