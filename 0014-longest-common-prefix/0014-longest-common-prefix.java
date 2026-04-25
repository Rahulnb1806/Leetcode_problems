class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs.length-1;i++){
            String temp="";
            String s=strs[i];
            for(int j=0;j<s.length() && j<strs[i + 1].length();j++){
            
                if(strs[i].charAt(j)!=strs[i+1].charAt(j))
               break;
                else{
                    
                temp+=s.charAt(j);
                }
            }
               if (temp.length() < res.length()) {
                res = temp;
            }

        }
        return res;
    }
}