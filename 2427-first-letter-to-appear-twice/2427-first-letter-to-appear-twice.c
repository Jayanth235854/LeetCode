char repeatedCharacter(char* s) {
    int index[26];
    memset(index, -1, sizeof(index)); // Initialize index array with -1

    int length = strlen(s);

    for (int i = 0; i < length; i++) {
        int charIndex = s[i] - 'a';
        if (index[charIndex] != -1) {
            return s[i];
        }
        index[charIndex] = i;
    }
    return '\0';   
}