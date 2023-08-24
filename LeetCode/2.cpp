/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* result= new ListNode();
        ListNode* head = result;
        bool carry_on = false; 
        int v1, v2,sum,sum_c;
        while ((l1 != NULL) || (l2!= NULL)){
            if(l1!=NULL){
                v1 = l1-> val; 
                l1 = l1 -> next; 
            }else{
                v1 = 0;
            }
            if(l2!=NULL){
                v2 = l2-> val; 
                l2 = l2 -> next; 
            }else{
                v2 = 0;
            }
            sum = v1 + v2;
            sum_c = carry_on ? (sum + 1): sum ; 
            carry_on = false;
            if (sum_c>=10){
                carry_on = true;
            }      
            result-> val = sum_c%10;
            if ((l1 != NULL) || (l2!= NULL)){
                result = result->next = new ListNode();
         
            }
        }
        if (carry_on) {
            result = result->next = new ListNode();
            result -> val = 1;
        }
        return head;
    }
};class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        l1.
        
    }
};