/*
trying https://codingbat.com/prob/p184004
5_March_2019
jedenfalls

Question:
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/


public boolean nearHundred(int n) {
  if(Math.abs(100-n)<11){
    return true;
  }
  else if(Math.abs(200-n)<11){
    return true;
  }
  else return false;
}
