char* toHex(int num) {
    if (num == 0) {
        return "0";
    }
    char* hex = (char*)malloc(9 * sizeof(char));
    hex[8] = '\0';
    for (int i = 7; i >= 0; i--) {
        int nibble = (num >> (4 * i)) & 0xf;
        if (nibble < 10) {
            hex[7 - i] = nibble + '0';
        } else {
            hex[7 - i] = nibble - 10 + 'a';
        }
    }
    int start = 0;
    while (hex[start] == '0') {
        start++;
    }
    return &hex[start];
}