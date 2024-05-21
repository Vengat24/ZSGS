public List<String> noX(List<String> strings) {
    strings.replaceAll(n->n.replace("x",""));
    return strings;
    
    // ArrayList<String> out = new ArrayList<String>();
    // for(String i : strings){
    //   if(i.contains("x")){
    //     String result = "";
    //     for(int j=0;j<i.length();j++){
    //       if(i.charAt(j) != 'x')
    //         result+=i.charAt(j);
    //     }
    //     out.add(result);
    //   }else{
    //     out.add(i);
    //   }
    // }
    // return out;
    
  }
  