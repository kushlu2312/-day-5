class Solution {
    public int isit(int n){
        int sum=0;
        
         while(n!=0){
           int  temp=n%10;
            sum=temp*temp+sum;
            n=n/10;
        }
       return sum;
    }
    public boolean isHappy(int n) {
        //19--19%10--9--81--1
        //1--1%10--1*1+81--0
        int slow=n;
        int fast=isit(n);
        while(fast!=1 && slow!=fast){
            slow=isit(slow);
            fast=isit(isit(fast));
        }
     
     return fast==1;
    
    }

}