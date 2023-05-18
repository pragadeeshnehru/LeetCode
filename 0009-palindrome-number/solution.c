bool isPalindrome(int x){
    long c,sum=0,rem;
    c=x;
    while(x > 0){
        rem = x%10;
        sum = sum*10 + rem;
        x = x /10;
    }
    if(c == sum)
    return true;

    return false;

}
