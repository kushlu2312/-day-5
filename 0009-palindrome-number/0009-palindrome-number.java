class Solution {
    public boolean isPalindrome(int x) {
       int original=x;
       if(x<0)
        return false;
      int reversed=0;
      while(x!=0){
        int digit=x%10;
        reversed=reversed*10+digit;
        x=x/10;

      }

          return original==reversed;
    }
}