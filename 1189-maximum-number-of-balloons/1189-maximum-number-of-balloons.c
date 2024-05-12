int maxNumberOfBalloons(char* text) {
    int count[26] = {0};
    while (*text != '\0') {
        count[*text - 'a']++;
        text++;
    }
    int result = count[0]; // 'b'
    result = result < count[1] ? result : count[1];
    result = result < count[11] / 2 ? result : count[11] / 2;
    result = result < count[14] / 2 ? result : count[14] / 2;
    result = result < count[13] ? result : count[13];
    return result;
}