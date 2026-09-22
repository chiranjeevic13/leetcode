class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        seen = {}  # Maps number -> its most recent index

        for i, num in enumerate(nums):
            # If the number was seen before and the distance is <= k
            if num in seen and i - seen[num] <= k:
                return True
            
            # Update/store the most recent index for this number
            seen[num] = i

        return False