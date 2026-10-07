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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)return head;

        int len = 0;
        ListNode n1 = head;
        ListNode last = head; 

        while(n1 != null){
            last = n1;
            n1 = n1.next;
            len++;
        }

        k = k%len;
        //System.out.println(k + " " + len);
        if(k == 0)return head;

        //we have last 
        ListNode one = head;
        for(int i = 0;i<len-k-1;i++){
            one = one.next;
        }
        ListNode two = one.next;
        one.next = null;
        last.next = head;

        return two;

    }
}