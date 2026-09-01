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
    public int getDecimalValue(ListNode head) {
        if(head.val == 0 && head.next == null){
            return 0;
        }
        if(head.val == 1 && head.next == null){
            return 1;
        }
        int power = 0;
        int ans = 0;
        ListNode curr = head;

        while(curr != null){
            power++;
            curr = curr.next;
        }
        power--;
        System.out.println(power);

        curr = head;
        while(curr != null){
            ans+= Math.pow(2,power--)*(curr.val);
            System.out.println(ans);
            curr = curr.next;
        }

        return ans;
    }
}