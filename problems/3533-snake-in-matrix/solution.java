class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int count =0;
        for(String command : commands) {
            if(command.equals("UP")) {
                count -= n;
            } else if(command.equals("LEFT")) {
                count-=1;
            } else if(command.equals("DOWN")) {
                count += n;
            } else if(command.equals("RIGHT")) {
                count+=1;
            } 
        }
        return count;
    }
}
