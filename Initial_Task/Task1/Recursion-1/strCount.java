public int strCount(String str, String sub) {
    if(str.length() <sub.length())
      return 0;
    return str.substring(0,sub.length()).equals(sub)? (1+ strCount(str.substring(sub.length()),sub)) : strCount(str.substring(1),sub);
  }
  