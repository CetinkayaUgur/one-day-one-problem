package MarchOf2024;

public class March1 {
    /*
     * https://leetcode.com/problems/reverse-linked-list/description/
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null)return head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
