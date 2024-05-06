public int[] front11(int[] a, int[] b) {
    if(a.length>=1 && b.length>=1){
      int num[]= new int[2];
      num[0]=a[0];
      num[1]=b[0];
      return num;
    }
    else if(a.length<1 &&b.length>0){
      int num[]= new int[1];
      num[0]=b[0];
      return num;
    }
    else if(b.length<1 &&a.length>0){
      int num[]= new int[1];
      num[0]=a[0];
      return num;
    }
    else{
      return a;
    }
    
  }
  