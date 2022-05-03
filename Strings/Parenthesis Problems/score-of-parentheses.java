// https://leetcode.com/problems/score-of-parentheses/    - Medium

class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(0);
            } else {
                int sum = 0;
                while (st.peek() != 0) {
                    sum += st.pop();
                }
                sum = sum > 0 ? 2 * sum : 1;
                st.pop();
                st.push(sum);
            }
        }

        int ans = 0;
        while (!st.isEmpty()) {
            ans += st.pop();
        }
        return ans;
    }
}