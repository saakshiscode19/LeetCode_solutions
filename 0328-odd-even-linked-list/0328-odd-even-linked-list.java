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
    public ListNode oddEvenList(ListNode head) {
        ListNode l = head;
        ArrayList<Integer> a = new ArrayList<>();
        while (null != head){
            a.add(head.val);
            head = head.next;
        }
        System.out.print(a);
        head = l;
        int i ;
        for(i =0; i<= a.size() -1; i = i+2){
            head.val = a.get(i);
            head = head.next;
        
        }
        for(i =1; i<= a.size()-1; i = i+2){
            head.val = a.get(i);
            head = head.next;
        }
        head = l;
        return head;

    }
}