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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
             ListNode prev = head;
        ListNode curr = head.next;

        int first = -1;
        int last = -1;
        int minDist = Integer.MAX_VALUE;
        int index = 1;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            if ((curr.val > prev.val && curr.val > next.val) ||
                (curr.val < prev.val && curr.val < next.val)) {

                if (first == -1) {
                    first = index;
                } else {
                    minDist = Math.min(minDist, index - last);
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (minDist == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }

        return new int[]{minDist, last - first};
    }
}