int findComplement(int num) {
    int mask = 0;
    while((num & ~mask) != 0){
        mask = (mask << 1) | 1;
    }

    return num^mask;
}
