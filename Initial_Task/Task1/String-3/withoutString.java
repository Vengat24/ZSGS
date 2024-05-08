public String withoutString(String base, String remove) {
    String out="";
    int len = remove.length();
    int i=0;
    while(i<base.length()){
      if(i<= base.length()-len && base.substring(i,i+len).toLowerCase().equals(remove.toLowerCase()))
        i+=len;
      else 
      {
        out=out+base.charAt(i);
        i+=1;
      }
      
    }
    return out;
  }
  