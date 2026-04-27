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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head;
        int count = 1;

        while(count < left-1) {
            node = node.next;
            count++;
        }
        ListNode leftNode = node;

        if (left == 1){
            leftNode = null;
        }
        else{
            node = node.next;
            count++;
        }

        ListNode leftStartNode = node;

        ListNode prev = null;
        ListNode pres = leftStartNode;
        ListNode later = pres.next;

        for (int i=0; i<right-left+1; i++) {
            pres.next = prev;
            prev = pres;
            pres = later;
            if(later !=null)later = later.next;
            count++;
        }
        if (leftNode != null){
            leftNode.next = prev;
        }
        else{
            head = prev;
        }
        leftStartNode.next = pres;

        return head;
    }
}