public int[] make2(int[] a, int[] b) {
    int num[] =new int[2];
    if(a.length >=2){
      num[0]=a[0];
      num[1]=a[1];
    }
    else if(a.length>=1 && b.length>=1){
      num[0]=a[0];
      num[1]=b[0];
    }
    else{
      num[0]=b[0];
      num[1]=b[1];
    }
    return num;
      
  }