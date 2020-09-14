"""
Input: J = "aA", S = "aAAbbbb"
Output: 3
"""

def numJewelsInStones(J,S):
        stone = list(S)
        counter = 0
        for i in S:
            if i in J:
                counter += 1
        return counter

J = "aA"
S = "aAAbbbb"
result = numJewelsInStones(J,S)
print("number of elements which are jewel and stone are",result)