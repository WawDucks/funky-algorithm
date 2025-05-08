from typing import List


def lengthOfLIS(nums: List[int]) -> int:
    dp = [nums[0]]
    for num in nums[1:]:
        if num > dp[-1]:
            dp.append(num)
        else:
            l, r = 0, len(dp)
            while l < r:
                m = (l + r) // 2
                if num <= dp[m]:
                    r = m
                else:
                    l = m + 1
            dp[l] = num
    return len(dp)


nums = [10,9,2,5,3,7,101,18]
# # nums = [0,1,0,3,2,3]
# nums = [7,7,7,7,7,7,7]
print(lengthOfLIS(nums))