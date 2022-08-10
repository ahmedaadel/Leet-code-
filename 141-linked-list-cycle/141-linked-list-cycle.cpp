/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* fastptr=head;
        ListNode* slowptr=head;
        
        if(head==NULL)
            return false;
        
        while(fastptr->next !=NULL && fastptr->next->next != NULL)
        {
            fastptr= fastptr->next->next;
            slowptr=slowptr->next;
            
            if(slowptr==fastptr)
            return true;
        }
        return false;
    }
};