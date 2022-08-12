
    class Solution {

        public ListNode removeElements(ListNode head, int val) {
           if(head == null)
              return head;
            
        if(head.val == val)
          {
            while (head.val == val)
            {
              head=head.next;
                if(head ==null) 
                    break;
            }
            if(head == null)
              return head;
          }
           
            
            ListNode res =new ListNode(head.val);
            ListNode nxt = res;
            head = head.next;
            while (head != null) 
            {
                if (head.val != val) 
                {
                    nxt.next = new ListNode(head.val);
                    nxt=nxt.next;
                    
                }
                head = head.next;
            }

            return res;
        }

    }