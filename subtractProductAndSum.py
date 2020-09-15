"""
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
"""

def subtractProductAndSum(n):
        sum = 0
        mul = 1
        while(n!=0):
            digit = n%10
            sum = sum + digit
            mul = mul * digit
            n = n // 10
        return mul - sum
n = 234
result = subtractProductAndSum(n)
print ("output:",result)        