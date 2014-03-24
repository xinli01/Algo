/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        // check input, if one node, just return
        if (head == null)   return null;
        if (head.next == null) return head;
        
        // use a pointer to keep the head node
        ListNode current = head;
        
        // while current node is not null, loop
        while (current.next != null)
        {
            if (current.next.val == current.val)
            {
                current.next= current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
        
        return head;
    }
}
