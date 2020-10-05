"""
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

"""
#l1 and l2 are linked lists

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        num1 = 0
        num2 = 0

        temp = l1
        n = 0
        while temp:
            num1 = num1 + temp.val*(10**n)
            n += 1
            temp = temp.next
        
        temp = l2
        n = 0
        while temp:
            num2 = num2 + temp.val*(10**n)
            n += 1
            temp = temp.next
        
        res = num1 + num2
        node = None
        for c in str(res):
            node = ListNode(c, next = node)
    
        return node