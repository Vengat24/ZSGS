public Map<String, String> pairs(String[] strings) {
    Map <String,String> map = new HashMap<String,String>();
    for(String s: strings){
      map.put(s.substring(0,1),s.substring(s.length()-1));
    }
    return map;
  }
  