

//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int i=1;
        int temp=n;
        int sum=0;
          int k1=n%10;
          n/=10;
          int k2=n%10;
          n/=10;
          int k3=n%10;
          n/=10;
          sum=k1*k1*k1+k2*k2*k2+k3*k3*k3;
        if(temp==sum)
        return "Yes";
        return "No";
        // code here
    }
}
