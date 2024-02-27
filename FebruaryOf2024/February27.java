package FebruaryOf2024;

public class February27 {
    /*
     * https://leetcode.com/problems/palindrome-linked-list/
     */
    public boolean isPalindrome(ListNode head) {
        String str = "";
        
        while(head != null){
            str += head.val;
            head = head.next;
        }

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        
        return true;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}