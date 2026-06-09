class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size()==1 || s.size()==0){
            return s.size();
        }
        unordered_set<char> st;
        int left=0,right=1;
        int maxcount=1;
        int count=1;
        st.insert(s[left]);
        while(right<s.size()){
            while(st.find(s[right])!=st.end()){
                st.erase(s[left]);
                left++;
            }
            st.insert(s[right]);
            count=right-left+1;
            maxcount=max(count,maxcount);
            right++;
        }
        return maxcount;
    }
};
