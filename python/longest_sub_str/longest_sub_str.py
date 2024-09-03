class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        if n == 0:
            return 0
        max_length = 0
        start_index = 0
        char_map = {}
        for i in range(n):
            if s[i] in char_map and char_map[s[i]] >= start_index:
                start_index = char_map[s[i]] + 1
            char_map[s[i]] = i
            max_length = max(max_length, i - start_index + 1)

        return max_length

s = "pwwkew"
# s = "bbbbb"
# s = "abcabcbb"
solution = Solution()
print(solution.lengthOfLongestSubstring(s)) 