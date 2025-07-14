class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char, int> lastIndex; 
        int maxLength = 0;
        int start = 0;  
 for (int end = 0; end < (int)s.size(); ++end) {
            char c = s[end];
            if (lastIndex.count(c) && lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }
lastIndex[c] = end;  // update last seen index
            maxLength = max(maxLength, end - start + 1);
        }
        return maxLength;
    }
};
