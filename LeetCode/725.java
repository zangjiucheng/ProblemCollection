/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int size = 1;
        ListNode temp = head;
        try {
            int x = temp.val;
        } catch (Exception e) {
            return result;
        }
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp = head;
        for (int i = 0; i < k; i++) {
            ListNode tempNode = new ListNode().next;
            int eachSize = (size / k) + 1;
            if (i >= (size % k)) {
                eachSize--;
            }
            int[] resultList = new int[eachSize];
            for (int j = 0; j < eachSize; j++) {
                resultList[j] = temp.val;
                temp = temp.next;
            }
            for (int j = 1; j <= eachSize; j++) {
                tempNode = new ListNode(resultList[eachSize - j], tempNode);
            }
            result[i] = tempNode;
        }
        return result;
    }
}