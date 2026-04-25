class Solution {
    public boolean isPalindrome(String s) {
        String ns=s.replaceAll("[^a-zA-Z0-9]", "");
        String ne=ns.toLowerCase();
        System.out.println(ne);
        int i=0;
        int j=ne.length()-1;
        if(j%2 ==0){
        while(i!=j){
            if(ne.charAt(i)!= ne.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        }
        else
        while(i<(j)){
            if(ne.charAt(i)!= ne.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;

    }
}