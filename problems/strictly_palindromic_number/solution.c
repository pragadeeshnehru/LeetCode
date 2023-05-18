int base (int,int);
bool palindrome (int);
bool isStrictlyPalindromic(int n){
    int count = 0;
    for(int i=2;i<=n-2;i++){
       int c = base(i,n);
       if(palindrome(c) == false){
           count++;
           break;
       }
    }
    if (count != 0 )
    return true;
    else
    return false;
} 

int base(int i ,int n){
    int rem = n %2;
    if ( n == 0){
        return 0;
    }
    base(i,n/i);
    return rem;    
}

bool palindrome (int n) {
    int reversed = 0 ;
    int  original = n;
    int remainder;

    while (n != 0) {
        remainder = n % 10;
        reversed = reversed * 10 + remainder;
        n /= 10;
    }

    if (original == reversed)
        return true;
    else
        return false;
}