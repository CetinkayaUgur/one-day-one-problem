package MarchOf2024;

public class March8 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectVal = new ListNode(0);

        int skipA = 0;
        int skipB = 0;

        while (headA != null) {
            skipB = 0;
            while (headB != null) {
                skipB++;
                if (headA.val == headB.val) {
                    intersectVal = headA;
                    headB = headB.next;
                }
            }
            skipA++;
            getIntersectionNode(headA.next, headB);
        }

        return intersectVal;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}