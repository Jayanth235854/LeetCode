class Solution {
    public String capitalizeTitle(String title) 
    {
        String str[]=title.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            String s=str[i];
            if(s.length()<=2)
            {
                for(int j=0;j<s.length();j++)
                {
                    char ch=Character.toLowerCase(s.charAt(j));
                    sb.append(ch);
                }
                sb.append(" ");
            }
            else
            {
                char ch=Character.toUpperCase(s.charAt(0));
                sb.append(ch);
                for(int j=1;j<s.length();j++)
                {
                    sb.append(Character.toLowerCase(s.charAt(j)));
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}