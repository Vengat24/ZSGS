public String startWord(String str, String word) {
    if(str.length()>2 && str.substring(1,word.length()).equals(word.substring(1)))
      return str.substring(0,word.length());
    else if(str.length() ==1 && word.length() ==1)
      return str;
    return "";  
  }