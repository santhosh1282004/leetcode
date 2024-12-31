nums = [1,3,4,5,3,5,1,2,5]
set=set(nums)
for i in set:
    nums.remove(i)
    if not(i in nums):
        print(i)