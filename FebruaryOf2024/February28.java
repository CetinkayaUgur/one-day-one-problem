package FebruaryOf2024;

public class February28 {
    /*
     * https://leetcode.com/problems/remove-linked-list-elements/
     */
    public ListNode removeElements(ListNode head, int val) {
        // Base case: If head is null, return null
        if (head == null) {
            return null;
        }
        
        // Recursive call to remove elements from the rest of the list
        head.next = removeElements(head.next, val);
        
        // Check if the current node's value equals the given value
        // If yes, skip the current node by returning the next node
        return (head.val == val) ? head.next : head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}