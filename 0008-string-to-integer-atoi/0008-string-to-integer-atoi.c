int myAtoi(char* s) {
    while (*s == ' ') {
        s++;
    }
    int sign = 1;
    if (*s == '-' || *s == '+') {
        sign = (*s++ == '-') ? -1 : 1;
    }
    long long result = 0;
    while (*s >= '0' && *s <= '9') {
        result = result * 10 + (*s++ - '0');
        if (result * sign > INT_MAX) {
            return INT_MAX;
        } else if (result * sign < INT_MIN) {
            return INT_MIN;
        }
    }
    result *= sign;
    return (int)result;
}