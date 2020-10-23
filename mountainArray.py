"""
Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

Input: [0,3,2,1]
Output: true
"""


class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        n = len(A)
        i = 0
        
        while(i+1) < n and A[i] < A[i+1]:
            i += 1
        
        if i == 0 or i == n-1:
            return False
        
        while i+1 < n and A[i] > A[i+1]:
            i += 1
            
        if i == n - 1:
            return True
        else:
            return False