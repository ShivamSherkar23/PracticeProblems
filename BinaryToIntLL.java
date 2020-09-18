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
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class BinaryToIntLL {
    ListNode head;

    public static BinaryToIntLL insert(BinaryToIntLL list, int val) {
        ListNode newn = new ListNode(val);
        newn.next = null;

        if (list.head == null) {
            list.head = newn;
        } else {
            ListNode temp = list.head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        return list;
    }

    public static int getDecimalValue(BinaryToIntLL list) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = list.head;
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
    public static void main(String args[])
    {
        BinaryToIntLL list = new BinaryToIntLL();
        list = insert(list, 1);
        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 0);

        

        int result = BinaryToIntLL.getDecimalValue(list);
        System.out.println("binary from each node after conversion into integer "+result);
    }
}

//main fuction and linked list creation is not written only logic funtion is written