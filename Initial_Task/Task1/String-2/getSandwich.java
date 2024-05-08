public String getSandwich(String str) {
    if(str.length()>10){ 
      int start=0;
      int end=0;
      for(int i=0;i<=str.length()/2;i++)
        if(str.substring(i,i+5).equals("bread")){
          start=i;
          break;
        }
      for(int i=str.length()/2-1;i<str.length()-4;i++)
        if(str.substring(i,i+5).equals("bread"))
          end=i;
      return str.substring(start+5,end);    
    }
    return "";
  }
  