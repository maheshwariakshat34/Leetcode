class Solution {
    public String reversePrefix(String s, int k) {
        int left=0;
        int right=k-1;
        char[] ch=s.toCharArray();
        if(k==1){
            return s;
        }
       while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);

        
    }
}