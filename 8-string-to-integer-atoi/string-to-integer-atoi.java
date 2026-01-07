class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        long ans=0;
        int neg=1;
        int i=0;
        if(s.length()!=0 && (s.charAt(0)=='-' || s.charAt(0)=='+')){
            if(s.charAt(0)=='-')neg=-1;
            i++;
        }
        while(i<s.length() && s.charAt(i)=='0')i++;
        while(i<s.length()){
            char x=s.charAt(i);
            if(isDigit(x)){
                ans=ans*10 + (x-'0');
                if (ans > (Math.pow(2,31)-1)) {
                    return (neg==1) ? 2147483647 : -2147483648;
                }
                i++;
            }else{
                break;
            }
        }
        return (int)ans*neg;
    }
    
    public static boolean isDigit(char x){
        return x>='0' && x<='9';
    }
}