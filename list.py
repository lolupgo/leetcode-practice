class Solution(object):
    def removeElement(self, nums, val):
        l = 0
        a = len(nums)
        for i in range(0,len(nums)):
            if nums[i] == val:
                l = l+1
        for j in range(l):
            nums.remove(val)
        k = a-l
        return k
        