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
        if(head == null) return head;
        
        ArrayList<Integer> dep =new ArrayList();
        ListNode res=new ListNode(head.val);
        ListNode nxt=res;
        dep.add(head.val);  
        
        while (head !=null)
        {
            if(!dep.contains(head.val))
            {
                dep.add(head.val);
                nxt.next=new ListNode(head.val);
                nxt=nxt.next;
            }
            head =head.next;    
           
        }
       return res;
    }
}