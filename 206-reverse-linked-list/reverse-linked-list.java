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
        if (head == null)return null;
        ListNode prev = null;
        ListNode pres = head;
        ListNode later = pres.next;
        do{
            pres.next = prev;
            prev = pres;
            pres = later;
            if (later!=null)later = later.next;
        }
        while (pres!=null);
        head = prev;

        return head;
    }
}