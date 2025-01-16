class Solution(object):
    def singleNumber(self, nums):
        s=set(nums)
        for i in s:
            nums.remove(i)
            if not(i in nums):
                return i
