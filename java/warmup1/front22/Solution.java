public String front22(String str) {
  if(str.length()>2){
    String add = str.substring(0,2);
    return add+str+add;
  }
  else{
    return str+str+str;
  }
}
