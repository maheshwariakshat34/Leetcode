class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x==0){
            return -1;
        }
        int temp=x;
        int sum=0;
        while(x>0){
            int digit=x%10;
            sum+=digit;
            x=x/10;
        }
        if(temp%sum==0){
            return sum;

        }
       return -1;
        

    }
}