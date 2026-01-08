class Solution {
    public int pivotInteger(int n) {
    
        int pre[] = new int[n];
        int suf[] = new int[n];
        int k =2;
        if(n==1) return 1;
        pre[0] = 1;

        for(int i =1 ;i<n ;i++){
            pre[i] = pre[i-1]+k;
            k++;
        }

        k = n-1;
        suf[n-1] = n;

        for(int i =n-2 ;i>=0 ;i--){
            suf[i] = suf[i+1]+k;
            k--;
        }

        for(int i =0;i<n ;i++){
            if(pre[i] == suf[i]){
                return i+1;
            }
        }

        return -1;
    }
}