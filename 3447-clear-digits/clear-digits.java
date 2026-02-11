class Solution {
    public String clearDigits(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                stack[++top] = ch;
            } 
            else {
                if (top >= 0) top--;
            }
        }
        String ans = "";
        for (int i = 0; i <= top; i++) {
            ans += stack[i];
        }
        return ans;
    }
}
