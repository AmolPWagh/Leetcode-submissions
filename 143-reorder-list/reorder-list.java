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
    public void reorderList(ListNode head) {
        if (head==null || head.next==null){
            return;
        }
        ListNode fast = head;
        ListNode mid = head;
        ListNode leftOfMid = null;
        while (fast!=null && fast.next!=null){
            leftOfMid = mid;
            mid = mid.next;
            fast = fast.next.next;
        }
        if (leftOfMid!=null)leftOfMid.next = null;

        ListNode prev = null;
        ListNode pres = mid;
        ListNode later = pres.next;
        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = later;
            if(later!=null)later = later.next;
        }
        ListNode node = head;
        ListNode node1 = head;
        ListNode node2 = prev;
        while(node1!=null){
            node1 = node1.next;
            node.next = node2;
            node = node2;

            if (node1!=null){
                node2= node2.next;
                node.next = node1;
                node = node1;
            }
        }
    }
}