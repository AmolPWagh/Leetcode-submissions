/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head ==null || head.next == null){
            return null;
        }
        ListNode node = head;
        HashSet<ListNode> set = new HashSet<>();

        while(node.next!=null){
            if (set.contains(node)){
                return node;
            }
            else{
                set .add(node);
                node = node.next;
            }
            
        }
        return null;
    }
}