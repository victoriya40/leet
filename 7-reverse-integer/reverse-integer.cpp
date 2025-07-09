class Solution {
public:
    int reverse(int x) {
        int a=0;
        while(x!=0){
            int b=x%10;
            if(a>INT_MAX/10||(a==INT_MAX/10&& b>7)){
                return 0;
            }
            if(a<INT_MIN/10||(a==INT_MIN/10&& b<-8)){
                return 0;
            }
            a = a * 10 + b;
            x/=10;
        }
        return a;
    }
};