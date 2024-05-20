public int commonTwo(String[] a, String[] b) {
    int i=0;
    int j=0;
    ArrayList<String> list = new ArrayList<String>();
    while(i<a.length && j<b.length){
      int num = a[i].compareTo(b[j]);
      if(num <= -1)
        j--;
      else if(num >= 1)
        i--;
      else if (!(list.contains(a[i])) && num == 0)
        list.add(a[i]);
      i++;
      j++;
    }
    return list.size();
  }