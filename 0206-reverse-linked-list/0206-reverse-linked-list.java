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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode current = head;
        while(current != null){
            st.push(current.val);
            current = current.next;
        }

        current = head;
        while(current != null){
            current.val = st.pop();
            current = current.next;
        }
        return head;
    }
}