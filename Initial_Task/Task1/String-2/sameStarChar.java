public boolean sameStarChar(String str) {
    int star=0,count=0;
    for(int i=1;i<str.length()-1;i++){
      if(str.charAt(i) == '*'){
        star++;
        if( str.charAt(i-1) == str.charAt(i+1))
          count++;
      }
    }
    return star == count;
  }
  