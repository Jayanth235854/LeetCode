bool canConstruct(char* ransomNote, char* magazine) {
    int magazineCount[26] = {0};
    while (*magazine != '\0') {
        magazineCount[*magazine - 'a']++;
        magazine++;
    }
    while (*ransomNote != '\0') {
        if (magazineCount[*ransomNote - 'a'] == 0) {
            return false; 
        }
        magazineCount[*ransomNote - 'a']--;
        ransomNote++;
    }
    return true;
}