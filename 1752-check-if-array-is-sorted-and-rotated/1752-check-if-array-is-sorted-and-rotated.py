class Solution(object):
    def check(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        rotate=0
        n=len(nums)

        for i in range(n):
            if nums[i]>nums[(i+1)%n]:
                rotate+=1
            if rotate>1:
                return False
        return True


        