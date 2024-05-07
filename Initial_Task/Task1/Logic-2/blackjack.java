public int blackjack(int a, int b) {
    int num1=21-a;
    int num2=21-b;
    if((num1 < num2 && num1>=0) || a<=21 && b>21) 
      return a;
    else if((num2 < num1 && num2>=0) || a>21 && b<=21)
      return b;
    return 0;
      
  }
  