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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode fast = head;
        ListNode mid = head;
        ListNode leftOfMid = null;
        while (fast!=null && fast.next!=null){
            leftOfMid = mid;
            mid = mid.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode pres = mid;
        ListNode later = pres.next;
        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = later;
            if (later!=null){
                later = later.next;
            }
        }

        ListNode node1 = head;
        while(prev!=null) {
            if (node1.val != prev.val){
                return false;
            }
            node1 = node1.next;
            prev = prev.next;
        }
        return true;

    }
}