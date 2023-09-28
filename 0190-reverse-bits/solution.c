uint32_t reverseBits(uint32_t n) {
    uint32_t rev = 0;
    for(int i=0;i<31;i++){
      if(n&1){
         rev+=1;
      }
      rev<<=1;
      n=n>>1;
   }
   if(n&1)rev+=1;
   return rev;
}

