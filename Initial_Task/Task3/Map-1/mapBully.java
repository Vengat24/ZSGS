public Map<String, String> mapBully(Map<String, String> map) {
  if(map.containsKey("a")){
    String name = map.get("a");
    map.put("b",name);
    map.put("a","");
  }
  
  return map;
}
