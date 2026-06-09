class Solution {
public:
    vector<int> findAnagrams(string s2, string s1) {
        if (s1.size()>s2.size()){
            return vector<int> {};
        }
        vector<int> ans1(26,0);
        vector<int> ans2(26,0);
        for(auto i : s1){
            ans1[i-'a']++;
        }
        int left = 0;
        int right = s1.size()-1;
        vector<int> ans;
        for(int i = 0 ; i <=right;i++){
            ans2[s2[i]-'a']++;
        }
        while(right<s2.size()-1){
            if(ans1==ans2){
                ans.push_back(left);
            }
            ans2[s2[left]-'a']--;
            ans2[s2[right+1]-'a']++;
            left++;
            right++;
        }
        if(ans1==ans2){
            ans.push_back(left);
        }
        return ans;
    }
};
