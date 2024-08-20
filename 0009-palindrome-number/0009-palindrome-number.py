class Solution(object):
    def isPalindrome(self, x):
        res=0
        original=x
        if x<0:
            return False
        while x!=0:
            rem=x%10
            res=(res*10)+rem
            x=x//10
        if original==res:
            return True
       