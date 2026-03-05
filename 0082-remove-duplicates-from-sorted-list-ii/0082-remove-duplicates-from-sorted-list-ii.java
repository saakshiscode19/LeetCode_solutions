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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode next = temp.next;
            if(temp.val == next.val){
                ListNode nextNode = findNext(temp);
                prev.next = nextNode;
                temp = nextNode;
            }else{
                prev = temp;
                temp = next;
            }
        }
        return dummy.next;
    }
    private ListNode findNext(ListNode temp) {
        while(temp.next != null && temp.val == temp.next.val) {
            temp = temp.next;
        }
        return temp.next;
    }
}