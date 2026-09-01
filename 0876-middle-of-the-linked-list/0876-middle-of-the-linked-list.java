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
    public ListNode middleNode(ListNode head) {
        ListNode current = head; 
        int len = 0;
        while(current!=null){
            len++;
            current = current.next;
        }
        if(len%2 != 0){
            len = len/2;
        }
        else{
            len = (int)(len/2);
        }

        current = head;
        while(len > 0){
            current = current.next;
            len--;
        }

        return current;
    }
}