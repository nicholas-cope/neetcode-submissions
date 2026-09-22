class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            // if c is a closing parenthesis, check for correct opening parenthesis else invalid
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            // if c is an opening parenthesis, push to stack
            else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
