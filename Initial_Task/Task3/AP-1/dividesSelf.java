public boolean dividesSelf(int n) {
    int Item = n;
    while(n!=0){
      int num = n%10;
      if(num == 0)
        return false;
      else if(Item%num != 0)
          return false;
      n/=10;
    }
    return true;
  }
  