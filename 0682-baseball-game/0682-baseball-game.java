class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public int calPoints(String[] ops) {
        int a = 0;
        for (String op : ops) {
            if (op.equals("C")&&(!arr.isEmpty()) ) {
                    a -= arr.remove(arr.size() - 1); 
            } else if (op.equals("D")&&(!arr.isEmpty())) {
                    int temp = arr.get(arr.size() - 1);
                    arr.add(temp * 2); 
                    a += temp * 2; 
            } else if (op.equals("+")&&(arr.size() >= 2)) {
                    int temp = arr.get(arr.size() - 1);
                    int temp1 = arr.get(arr.size() - 2);
                    arr.add(temp + temp1); 
                    a += temp + temp1; 
            } else {
                int score = Integer.parseInt(op); 
                arr.add(score); 
                a += score; 
            }
        }
        return a; 
    }
}