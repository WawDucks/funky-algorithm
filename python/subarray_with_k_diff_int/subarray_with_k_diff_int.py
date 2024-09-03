# class Solution:
#     def subarraysWithKDistinct(self, nums: list, k: int) -> int:
#         curr_num_of_diff_int = 0
#         num_of_arrays = 0
#         start_index = 0
#         good_array = []
#         while start_index <= len(nums) - 1:
#             for num in nums[start_index:len(nums)]:
#                 if num in good_array:
#                     good_array.append(num)
#                     if len(good_array) >= k: 
#                         num_of_arrays += 1
#                 elif curr_num_of_diff_int < k:
#                     good_array.append(num)
#                     curr_num_of_diff_int += 1
#                     if len(good_array) >= k: 
#                         num_of_arrays += 1
#                 else:
#                     break
#             start_index += 1
#             good_array = []
#             curr_num_of_diff_int = 0
#         return num_of_arrays

class Solution:
    def solve(self, nums, k):
        ans = 0
        mpp = {}
        left = right = 0
        while right < len(nums):
            mpp[nums[right]] = mpp.get(nums[right], 0) + 1
            while len(mpp) > k:
                mpp[nums[left]] -= 1
                if mpp[nums[left]] == 0:
                    del mpp[nums[left]]
                left += 1
            ans += right - left + 1
            right += 1
        return ans

    def subarraysWithKDistinct(self, nums, k):
        return self.solve(nums, k) - self.solve(nums, k - 1)

# from collections import defaultdict           
# class Solution:
#     def subarraysWithKDistinct(self, nums: list, k: int) -> int:
#         def at_most_k(nums, k):
#             count = 0
#             left = 0
#             freq = defaultdict(int)

#             for right in range(len(nums)):
#                 if freq[nums[right]] == 0:
#                     k -= 1
#                 freq[nums[right]] += 1

#                 while k < 0:
#                     freq[nums[left]] -= 1
#                     if freq[nums[left]] == 0:
#                         k += 1
#                     left += 1

#                 count += right - left + 1

#             return count

#         return at_most_k(nums, k) - at_most_k(nums, k - 1) 


# nums = [1,2,1,2,3]
# k = 2

nums = [1,2,1,3,4]
k = 3

solution = Solution()
print(solution.subarraysWithKDistinct(nums, k)) 


 