class Solution {
    public String reverseVowels(String s) {
       char[] str=s.toCharArray();
       int l=0,r=s.length()-1;
       String vowels="aeiouAEIOU";
       while(l<r) {
        while(l<r && vowels.indexOf(str[l])==-1){
            l++;
        }
        while(l<r && vowels.indexOf(str[r])==-1){
            r--;
        }
        char temp=str[l];
        str[l]=str[r];
        str[r]=temp;

        l++;
        r--;
       }
       String res=new String(str);
       return res;
    }
}