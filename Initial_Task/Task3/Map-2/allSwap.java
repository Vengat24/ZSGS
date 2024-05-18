public String[] allSwap(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    for(int i=0;i<strings.length;i++){
      String start = strings[i].substring(0,1);
      if(map.containsKey(start)){
        int index = map.get(start);
        String temp=strings[i];
        strings[i] = strings[index];
        strings[index] =temp;
        map.remove(start);
        
      }else{
        map.put(start,i);
      }
    }
    return strings;
  }
  