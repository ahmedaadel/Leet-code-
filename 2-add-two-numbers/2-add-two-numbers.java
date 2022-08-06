class Solution {
    
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
            ListNode result =new ListNode();
            ListNode tail = new ListNode();

            int value , reminder = 0, nxtreminder = 0;
            ListNode h1 = l1, h2 = l2;

            if (h1 != null || h2 != null) {
                value = h1.val + h2.val;
                if (value / 10 >= 1) {
                    reminder = value / 10;
                    value = value % 10;

                }
                
                tail=null;
                result=new ListNode(value,tail);
                tail=result;
            }
    
            if(h1.next == null && h2.next == null && reminder !=0)
                                     tail.next= new ListNode( reminder);
                
            
            while (h1.next != null || h2.next != null) {


                if (h1.next != null && h2.next != null) {
                     h1 = h1.next;
                    h2 = h2.next;
                    value = h1.val + h2.val;
                    if (value+reminder / 10 >= 1) {
                        nxtreminder = (value + reminder) / 10;
                        value = (value + reminder) % 10;
                        tail.next= new ListNode(value );
                    }
                    else
                        tail.next= new ListNode(value + reminder);
                    tail=tail.next;
              
                    reminder = nxtreminder;
                    nxtreminder = 0;

                  
                }
                
                else if (h1.next != null) {
                     h1 = h1.next;
                    value = h1.val;
                    if (value + reminder / 10 >= 1) {
                        nxtreminder = (value + reminder) / 10;
                        value = (value + reminder) % 10;
                        tail.next= new ListNode(value );
                    }
                    else
                        tail.next= new ListNode(value + reminder);
                    tail=tail.next;
                    reminder = nxtreminder;
                    nxtreminder = 0;
                   
                }
                
                
                else  if (h2.next != null)
                {
                    h2 = h2.next;
                    value = h2.val;
                    if (value + reminder / 10 >= 1) {
                        nxtreminder = (value + reminder) / 10;
                        value = (value + reminder) % 10;
                        tail.next= new ListNode(value );
                    }
                    else
                        tail.next= new ListNode(value + reminder);
                    tail=tail.next;
                    reminder = nxtreminder;
                    nxtreminder = 0;
                 
                   
                }
                
                if (h1.next == null &&  h2.next ==null && reminder !=0)
                {
                    tail.next= new ListNode( reminder);
                    tail=tail.next;
                }
            }

            return result;
        }
    }