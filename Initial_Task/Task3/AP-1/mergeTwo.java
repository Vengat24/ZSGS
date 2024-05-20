public String[] mergeTwo(String[] a, String[] b, int n) {
    int i=0;
    int j=0;
    ArrayList<String> list = new ArrayList<String>();
    while(n!=0){
      int num = a[i].compareTo(b[j]);
      if(num <= -1){
        list.add(a[i]);
        i++;
      }
      else if(num >= 1){
        list.add(b[j]);
        j++;
      }
      else{
        list.add(a[i]);
        i++;
        j++;
      }
      n--;
    }
    String arr[] = new String[list.size()];
    for(int x=0;x<list.size();x++){
      arr[x] = list.get(x);
    }
    return arr;
  }
  