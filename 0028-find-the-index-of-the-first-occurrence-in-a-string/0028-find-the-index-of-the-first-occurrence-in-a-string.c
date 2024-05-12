int strStr(char* haystack, char* needle) {
    int hay_len = strlen(haystack);
    int needle_len = strlen(needle);

    for (int i = 0; i <= hay_len - needle_len; ++i) {
        int j;
        for (j = 0; j < needle_len; ++j) {
            if (haystack[i + j] != needle[j]) {
                break;
            }
        }

        if (j == needle_len) {
            return i;
        }
    }

    return -1;
}