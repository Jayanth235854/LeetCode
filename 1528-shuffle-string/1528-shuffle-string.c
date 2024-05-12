char* restoreString(char* s, int* indices, int indicesSize) {
    char* shuffled = (char*)malloc((indicesSize + 1) * sizeof(char));
    for (int i = 0; i < indicesSize; i++) {
        shuffled[indices[i]] = s[i];
    }
    shuffled[indicesSize] = '\0';
    return shuffled;
}