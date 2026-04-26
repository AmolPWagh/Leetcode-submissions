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
// Using HashSet Not Optimal
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode node = head;
        HashSet<ListNode> set = new HashSet<>();

        while(node!=null){
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

// Floyd Approach (Optimal)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                do{
                    slow=slow.next;
                    length++;
                }
                while (fast != slow);
                break;
            }
        }
        if (length == 0){
            return null;
        }
        
        ListNode f = head;
        ListNode s = head;

        while(length>0){
            s = s.next;
            length--;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
        
    }
}
