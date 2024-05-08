public String sameEnds(String string) {
    int mid=string.length()/2;
    if(string.length() % 2 ==1)
      mid = mid+1;
    
    int i=mid;  
    for( ;i<string.length()-1;i++){
      if(string.charAt(0) == string.charAt(i))
        break;
    }  
    if( string.length()<2 || string.charAt(0) != string.charAt(i) )
      return "";
      
    int j=1;
    for( ;j<string.length()-i;j++){
      if(!(string.substring(0,j).equals(string.substring(i,i+j))))
        break;
    }
    return string.substring(0,j);
  }
  