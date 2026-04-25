class Solution {
    public String reverseWords(String s) {
        String []arr=s.split(" ");
        int n=arr.length;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder str=new StringBuilder(arr[i]);
            str.reverse();
            res.append(str);
            if(i!=n-1) res.append(" ");
        }
        return res.toString();
    }
}