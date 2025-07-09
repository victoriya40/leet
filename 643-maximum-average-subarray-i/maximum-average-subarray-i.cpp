class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
    double window_sum=0;
    for(int i=0;i<k;i++){
        window_sum+=nums[i];//1 +2 +3 =6 
    }double max_sum=window_sum;
    for(int i=k;i<nums.size();i++){
        window_sum+=nums[i]-nums[i-k];
        max_sum=max(max_sum, window_sum);
        }
    return max_sum/k;
    }
};