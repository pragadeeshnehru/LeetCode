class Solution {
    public boolean isPalindrome(int x){
    long c,sum=0,rem;
    c=x;
    while(c > 0){
        rem = c%10;
        sum = sum*10 + rem;
        c = c /10;
    }
    if(x == sum)
    return true;

    return false;

    }
}