class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int x : asteroids){
            if(x>0) {
                stack.push(x);
            } else {
                while(!stack.isEmpty() && stack.peek() >0 && stack.peek()< -x) {
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek() < 0) {
                    stack.push(x);
                }

                if(stack.peek() == -x) {
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        int i = stack.size() - 1;

        while(!stack.isEmpty()) {
            res[i--] = stack.pop();
        }

        return res;
    }
}
