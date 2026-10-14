class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
         Stack<Long> st = new Stack<>();

        for (int num : nums) {

            long curr = num;

            while (!st.isEmpty() && st.peek() == curr) {
                st.pop();
                curr = curr * 2;
            }

            st.push(curr);
        }

        return st;
        
    }
}