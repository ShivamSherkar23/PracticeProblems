/*
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.*;
public class BinaryToIntLL {
    public int getDecimalValue(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null)
        {
            arr.add(temp.val);
            temp = temp.next;  
        }
        StringBuilder strNum = new StringBuilder();

        for (int num : arr) 
        {
            strNum.append(num);
        }
        int finalInt = Integer.parseInt(strNum.toString(),2);
        return finalInt;  
    }
}

//main fuction and linked list creation is not written only logic funtion is written