public String[] wordsWithout(String[] words, String target) {
    ArrayList<String> list = new ArrayList<String>();
    for(String s : words){
      if(!s.equals(target))
        list.add(s);
    }
    String out[] = new String[list.size()];
    for(int i=0;i<list.size();i++){
      out[i] = list.get(i);  
    }
    return out;
  }
  