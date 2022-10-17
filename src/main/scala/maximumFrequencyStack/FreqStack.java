package maximumFrequencyStack;

import java.util.*;

// 895. Maximum Frequency Stack
class FreqStack {
    Map<Integer, Integer> counts = new HashMap<>();
    Integer maxCounts = 0;
    Map<Integer, Stack<Integer>> stack = new HashMap<>();

    public FreqStack() { }

    public void push(int val) {
        int x;
        if (counts.containsKey(val)) {
            x = counts.get(val) + 1;
        } else {
            x = 1;
        }
        counts.put(val, x);
        maxCounts = Math.max(x, maxCounts);

        Stack<Integer> st = stack.get(x);
        if (st == null) {
            st = new Stack<>();
            st.push(val);
            stack.put(x, st);
        } else {
            st.push(val);
        }
    }

    public int pop() {
        Stack<Integer> st = stack.get(maxCounts);
        int res = st.pop();
        counts.put(res, counts.get(res) - 1);
        if (st.isEmpty()) maxCounts--;
        return res;
    }
}