nums = [1,3,4,5,3,5,1,2,5]

#it remove all duplicate valus
set=set(nums)

#using this loop remove the all number ones
for i in set:
    # in array remove all elwment in set
    nums.remove(i)
    # if the number have onle one in the array then it removed by (9 line) so it is ot in array so print the number  
    if not(i in nums):
        print(i)
