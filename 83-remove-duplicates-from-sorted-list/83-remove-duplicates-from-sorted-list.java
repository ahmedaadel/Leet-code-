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
class Solution {
       public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next ==null) return head;
        
        ArrayList<Integer> dep =new ArrayList();
        dep.add(head.val);  
        
           ListNode curr=head;
        while (head !=null && head.next !=null )
        {
            if(!dep.contains(head.next.val))
            {
                dep.add(head.next.val);
                 head =head.next; 
                continue;
            }
              
           head.next =head.next.next;
        }
       return curr;
    }
}