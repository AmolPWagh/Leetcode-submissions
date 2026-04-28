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
        while (fast!=null && fast.next!=null){
            mid = mid.next;
            fast = fast.next.next;
        }

        if (fast !=null) mid = mid.next;

        ListNode prev = null;
        ListNode pres = mid;
        ListNode later;
        while (pres!=null){
            later = pres.next;
            pres.next = prev;
            prev = pres;
            pres = later;
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