public Map<String, String> firstChar(String[] strings) {
    Map<String,String> map =new HashMap<String,String>();
    for(String s:strings){
      if(map.containsKey(s.substring(0,1))){
        String out = map.get(s.substring(0,1));
        map.put(s.substring(0,1), out+s);
      }
      else{
        map.put(s.substring(0,1),s);
      }
    }
    return map;
  }
  