class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sc = new StringBuilder("");
        while(columnNumber>0){
            columnNumber--;
            sc.insert(0,(char)(columnNumber % 26 +'A'));
            columnNumber /= 26;
        }
        return sc.toString();
    }
}