char* addBinary(char* a, char* b) {
    int lenA = strlen(a);
    int lenB = strlen(b);
    int maxLength = lenA > lenB ? lenA : lenB;

    char* result = (char*)malloc((maxLength + 1) * sizeof(char));
    memset(result, '0', maxLength);
    result[maxLength] = '\0';
    
    int carry = 0;
    
    for (int i = 1; i <= maxLength; ++i) {
        int digitA = (i <= lenA) ? a[lenA - i] - '0' : 0;
        int digitB = (i <= lenB) ? b[lenB - i] - '0' : 0;
        int sum = digitA + digitB + carry;
        result[maxLength - i] = (sum % 2) + '0';
        carry = sum / 2;
    }

    if (carry) {
        char* finalResult = (char*)malloc((maxLength + 2) * sizeof(char));
        finalResult[0] = '1';
        strcpy(finalResult + 1, result);
        free(result);
        return finalResult;
    } else {
        return result;
    }
}