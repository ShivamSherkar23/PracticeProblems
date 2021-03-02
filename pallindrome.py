"""
input: -121
output:false
"""

class Solution:
    def isPalindrome(self, x: int) -> bool:
        digit = 0
        rev = 0
        org = x
        if(x < 0):
            return False
        if(x < 10):
            return True
        if(x % 10 == 0):
            return False
        while(x != 0):
            digit = x % 10
            rev = rev * 10 + digit
            x = x // 10
        if(rev == org):
            return True
        else:
            return False
            
            
        
