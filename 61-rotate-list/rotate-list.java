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
        if (head==null)return null;
        if (head.next==null || k==0)return head;
        ListNode node = head;
        int len = 0;
        while (node != null){
            node=node.next;
            len++;
        }
        if (k%len==0) return head; 
        len = len-(k%len);
        

        ListNode newHead = null;
        node = head;
        for (int i=1; i<len; i++){
            node = node.next;
        }
        newHead = node.next;
        node.next = null;   

        node = newHead;
        while(node.next!=null){
            node = node.next;
        }
        node.next = head;

        return newHead;
    }
}