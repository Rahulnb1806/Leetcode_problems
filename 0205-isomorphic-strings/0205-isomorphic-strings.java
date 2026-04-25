class Solution {
    public boolean isIsomorphic(String s, String t) {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            char ch1=arr1[i];
            char ch2=arr2[i];
            int cnt1=0;
            int cnt2=0;
            for(int j=i+1;j<arr2.length;j++)
            {
                if(ch1==arr1[j]) cnt1++;
                if(ch2==arr2[j]) cnt2++;
                if(cnt1!=cnt2) return false;
            }
        }
        return true;
    }
}