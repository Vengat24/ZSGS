public String[] firstSwap(String[] strings) {
    Map<String,Integer> map = new HashMap<String,Integer>();
    for(int i=0;i<strings.length;i++){
      String start = strings[i].substring(0,1);
      if(map.containsKey(start)){
        if(map.get(start) != -1){
          int index = map.get(start);
          String temp=strings[i];
          strings[i] = strings[index];
          strings[index] =temp;
          map.put(start,-1);
        }
      }
      else{
        map.put(start,i);
      }
    }
    return strings;
  }