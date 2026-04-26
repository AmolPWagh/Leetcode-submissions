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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)return null;
        if (list1 == null && list2 != null)return list2;
        if (list1 != null && list2 == null)return list1;
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode newHead;
        if (node1.val<=node2.val){
            newHead = node1;
            node1 = node1.next;
        }
        else{
            newHead = node2;
            node2 = node2.next;
        }
        ListNode temp = newHead;

        while (temp.next!=null){
            if (node1.val<=node2.val){
                temp.next =node1;
                temp = temp.next;
                node1 = node1.next;
            }
            else{
                temp.next = node2;
                temp = temp.next;
                node2 = node2.next;
            }
        }
        if (node1==null&& node2!=null){
            temp.next = node2;
        }
        if (node1!=null&& node2==null){
            temp.next = node1;
        }
        return newHead;
    }
}