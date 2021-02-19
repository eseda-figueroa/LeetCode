// Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without repeating characters.

class Solution
{
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> substring = new HashSet<>();
        int oldMax = 0, max = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (substring.contains(s.charAt(i)))
            {
                substring.clear();
                if (max > oldMax) oldMax = max;
                max = 0;
            }
            substring.add(s.charAt(i));
            max++;
        }
        if (max > oldMax)
            return max;
        return oldMax;
    }
}
