int reverse(int x){
       int reverse = 0;
    while (x != 0) 
     {
        int r = x%10;
        x = x / 10;
        if (reverse > 2147483647/10 || (reverse == 2147483647/ 10 && r > 7)) return 0;
        if(reverse < -2147483648/10 || (reverse == -2147483648/ 10 && r < -8)) return 0;
        reverse = reverse * 10 + r;
     }
  return reverse;

}