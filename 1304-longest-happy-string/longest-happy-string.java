class Solution {
    class Pair{
        int c;
        char ch;
        Pair(int c,char ch){
            this.c = c;
            this.ch=ch;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> p2.c - p1.c);
        if(a > 0) pq.add(new Pair(a,'a'));
if(b > 0) pq.add(new Pair(b,'b'));
if(c > 0) pq.add(new Pair(c,'c'));

        StringBuilder str = new StringBuilder();
        int maxStreak = 0,
        maxStreak_b = 0,
        maxStreak_c = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            if(str.length() >= 2 && str.charAt(str.length()-1)==curr.ch && str.charAt(str.length()-2)==curr.ch){
                if(pq.isEmpty())    break;
                Pair secondCurr = pq.poll();
                str.append(secondCurr.ch);
                secondCurr.c--;
                if(secondCurr.c > 0){
                    pq.add(new Pair(secondCurr.c,secondCurr.ch));
                }
                pq.add(curr);
            }
            else{
                str.append(curr.ch);
                curr.c--;
                if(curr.c > 0){
                    pq.add(new Pair(curr.c,curr.ch));
                }
            }
            
        }
        return str.toString();
    }
}