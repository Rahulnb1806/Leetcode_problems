class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> n=new TreeSet<>();
        for(int i:nums)
        {
            n.add(i);
        }
        ArrayList<Integer> t=new ArrayList<>(n);
        if(t.size()==3)
        {
            return t.get(0);
        }
        if(t.size()<3)
        return t.get(t.size()-1);
        return t.get(t.size()-3);
    }
}