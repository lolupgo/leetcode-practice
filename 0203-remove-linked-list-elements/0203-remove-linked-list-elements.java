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
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode prv = head;
        while(cur!=null){
            if(cur.val == val){
                prv.next = cur.next;
                cur = cur.next;
            }
            else{
            prv = cur;
            cur = cur.next;
            }
        }
        if(head!= null && head.val == val){
            head = head.next;
        }
        return head;
    }
}