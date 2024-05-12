char* removeDuplicateLetters(char* s) {
    int count[26] = {0};
    int visited[26] = {0};
    int len = strlen(s);
    
    for (int i = 0; i < len; i++) {
        count[s[i] - 'a']++;
    }

    char result[len + 1];
    int top = -1;

    for (int i = 0; i < len; i++) {
        count[s[i] - 'a']--;

        if (visited[s[i] - 'a']) {
            continue;
        }
        while (top >= 0 && s[i] < result[top] && count[result[top] - 'a'] > 0) {
            visited[result[top] - 'a'] = 0;
            top--;
        }

        result[++top] = s[i];
        visited[s[i] - 'a'] = 1;
    }

    result[top + 1] = '\0';

    char* finalResult = (char*)malloc((top + 2) * sizeof(char));
    strcpy(finalResult, result);

    return finalResult;
}