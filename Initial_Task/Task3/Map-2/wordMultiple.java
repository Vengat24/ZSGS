public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> map = new HashMap<String, Boolean>();
    for(String s : strings){
      if(!map.containsKey(s)){
        map.put(s,false);
      }
      else{
        map.put(s,true);
      }
    }
    return map;
  }
  