char* reverseOnlyLetters(char* s) {
    int i = 0, j = strlen(s) - 1;
    while (i < j) {
        while (i < j && !isalpha(s[i]))
            i++;
        while (i < j && !isalpha(s[j]))
            j--;

        if (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    return s;
}