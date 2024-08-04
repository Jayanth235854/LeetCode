bool buddyStrings(char* s, char* goal) {
    int len = strlen(s);
    if (strlen(goal) != len) return false;
    if (strcmp(s, goal) == 0) {
        int char_count[26] = {0};
        for (int i = 0; i < len; i++) {
            char_count[s[i] - 'a']++;
            if (char_count[s[i] - 'a'] > 1) return true;
        }
        return false;
    }
    int diff[2] = {-1, -1};
    int diff_count = 0;
    for (int i = 0; i < len; i++) {
        if (s[i] != goal[i]) {
            if (diff_count >= 2) return false;
            diff[diff_count++] = i;
        }
    }
    return (diff_count == 2 && s[diff[0]] == goal[diff[1]] && s[diff[1]] == goal[diff[0]]);
}