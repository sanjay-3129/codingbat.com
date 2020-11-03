public String endUp(String str) {
  if(str.length()<=3){
    return str.toUpperCase();
  }
  else{
    String a = str.substring(0,str.length()-3);
    String c = str.substring(str.length()-3);
    return a + c.toUpperCase();
    
  }
}
