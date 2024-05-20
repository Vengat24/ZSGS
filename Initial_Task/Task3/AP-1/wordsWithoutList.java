public List wordsWithoutList(String[] words, int len) {
    ArrayList<String> list = new ArrayList<String>();
    for(String s : words){
      if(s.length() != len)
        list.add(s);
    }
    return list;
  }
  