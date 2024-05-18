public Map<String, Integer> wordCount(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    for(String s: strings){
      if(map.containsKey(s)){
        int count = map.get(s);
        map.put(s,count+1);
      }else{
        map.put(s,1);
      }
    }
    return map;
  }
  