public boolean nearHundred(int n) {
  if(Math.abs(100-n)<11){
    return true;
  }
  else if(Math.abs(200-n)<11){
    return true;
  }
  else return false;
}
