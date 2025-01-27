class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int a = s.pop();
                int b = s.peek();
                s.push(a);
                s.push(a+b);
            } else if(op.equals("D")){
                s.push(s.peek()*2);
            } else if(op.equals("C")){
                s.pop();
            } else {
                s.push(Integer.parseInt(op));
            }
        }

        int sum =0;
        while(!s.isEmpty()){
            sum += s.pop();
        }

        return sum;
    }
}
