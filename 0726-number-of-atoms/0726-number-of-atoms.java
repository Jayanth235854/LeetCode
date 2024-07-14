class Solution {
    public boolean isDigit(char c) {return c >= '0' && c <= '9';}
    public boolean isUpper(char c) {return c >= 'A' && c <= 'Z';}
    public boolean isLower(char c) {return c >= 'a' && c <= 'z';}
    public String countOfAtoms(String formula) {
        char[] chars = formula.toCharArray();
        int[] stack = new int[chars.length];
        int p = 0;

        boolean[] exists = new boolean[26];
        int[] trie = new int[26]; // first trie depth
        int[][] trie2 = new int[26][26]; // second trie depth
        int roll = 1;

        int i = chars.length - 1;
        while(i >= 0)
        {
            if(chars[i] == '(')
            {
                roll /= stack[--p];
                i--;
                continue;
            }
            int num = 0;
            int base = 1;
            while(isDigit(chars[i]))
            {
                num += base * ((int) chars[i] - '0');
                base *= 10;
                i--; 
            }
            num = num == 0 ? 1 : num;

            if(chars[i] == ')')
            {
                roll *= num;
                stack[p++] = num;
            }
            else
            {
                int first = -1;
                int second = -1;
                if(isLower(chars[i]))
                    second = (int) chars[i--] - 'a';
                first = (int) chars[i] - 'A';
                num *= roll;
                if(second != -1)
                {
                    exists[first] = true;
                    trie2[first][second] += num;
                }
                else
                {
                    trie[first] += num;
                }
            }
            i--;
        }
        i = 0;
        StringBuilder res = new StringBuilder();
        for(; i < 26; i++)
        {
            if(trie[i] != 0)
            {
                res.append((char) (i + 'A'));
                if(trie[i] != 1)
                    res.append(trie[i]);
            }
            if(exists[i])
            {
                for(int j = 0; j < 26; j++)
                {
                    if(trie2[i][j] != 0)
                    {
                        res.append((char) (i + 'A'));
                        res.append((char) (j + 'a'));
                        if(trie2[i][j] != 1)
                            res.append(trie2[i][j]);
                    }
                }
            }
        }
        return res.toString();
    }
}