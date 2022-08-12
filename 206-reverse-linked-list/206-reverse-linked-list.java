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
   public ListNode reverseList(ListNode head) {
       if(head == null)
           return head;
        ArrayList<Integer> vals=new ArrayList();
        while(head !=null)
        {
             vals.add(head.val);
            head=head.next;
        }
         
        ListNode res= new ListNode(vals.get(vals.size()-1));
        ListNode nxt= res;
        for (int i=vals.size()-2;i>=0;i--)
        {
            nxt.next= new ListNode(vals.get(i));
            nxt=nxt.next;
        }
        return res;
        
    }
}