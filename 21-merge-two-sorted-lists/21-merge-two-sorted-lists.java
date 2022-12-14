class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                 
        
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode result, current;
        if (list1.val < list2.val) {
            result = current = list1;
            list1 = list1.next;
        } else {
            result = current = list2;
            list2 = list2.next;
        }
        
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                current = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
        }
        
        if (list1 == null) {
            while (list2 != null) {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
        } else {
            while (list1 != null) {
                current.next = list1;
                current = list1;
                list1 = list1.next;
            }
        }
        
        return result;
    }
}