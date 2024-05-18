public String wordAppend(String[] strings) {
    Map <String,Integer> map = new HashMap<String,Integer>();
    String out = "";
    for(String s:strings){
      if(map.containsKey(s)){
        out += s;
        map.remove(s);
      }
      else{
        map.put(s,0);
      }
    }
    return out;
  }
  