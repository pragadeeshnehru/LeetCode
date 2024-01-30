class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(int i = 0;i< tokens.length ;i++){
            if(isNumeric(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            } else { 
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(tokens[i]){
                    case "+":
                    stack.push(num2+num1); 
                    break;   

                    case "-":
                    stack.push(num2-num1); 
                    break;

                    case "*":
                    stack.push(num1*num2); 
                    break;

                    case "/":
                    stack.push(num2/num1); 
                    break;   
                }
            }
        }
        return stack.pop();
    }

    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}