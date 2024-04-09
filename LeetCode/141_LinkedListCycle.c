/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    struct ListNode *fast = head;
    struct ListNode *slow = head;
    while (fast && fast->next){
        fast = fast->next;
        slow = slow->next;
        if (fast) fast = fast->next;
        if (fast == slow){
            return true;
        }
    }
    return false;
}
