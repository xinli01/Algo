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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode ln = new ListNode(0);
        ListNode head = null;
        boolean foundFirstNode = false;
        
        while (l1 != null || l2 != null)
        { 
            if(l1 == null)
            {
                if (!foundFirstNode)
                {
                    ln = l2;
                    head = ln;
                    foundFirstNode = true;
                }
                else
                {
                    ln.next = l2;
                    ln = ln.next;
                }
                
                l2 = l2.next;
            }
            else if (l2 == null)
            {
                if (!foundFirstNode)
                {
                    ln = l1;
                    head = ln;
                    foundFirstNode = true;
                }
                else
                {
                    ln.next = l1;
                    ln = ln.next;
                }
                
                l1 = l1.next;
            }
            else if (l1.val > l2.val)
            {
                if (!foundFirstNode)
                {
                    ln = l2;
                    head = ln;
                    foundFirstNode = true;
                }
                else
                {
                    ln.next = l2;
                    ln = ln.next;
                }
                
                l2 = l2.next;
            }
            else if (l1.val <= l2.val)
            {
                if (!foundFirstNode)
                {
                    ln = l1;
                    head = ln;
                    foundFirstNode = true;
                }
                else
                {
                    ln.next = l1;
                    ln = ln.next;
                }
                
                l1 = l1.next;
            }
        }
        
        return head;
    }
}
