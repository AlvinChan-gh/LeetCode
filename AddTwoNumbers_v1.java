/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry =0;
        int val = l1.val + l2.val;
        if (val>=10){
            carry = 1;
            val-=10;
        }
        ListNode result = new ListNode(val);
        if (l1.next != null && l2.next != null){
            result.next = addTwoNumbers(new ListNode(carry),addTwoNumbers(l1.next,l2.next));
        }
        else if( l1.next!= null && l2.next == null){
            result.next = addTwoNumbers(l1.next,new ListNode(carry));
        }
        else if(l1.next== null && l2.next != null){
            result.next = addTwoNumbers(new ListNode(carry),l2.next);
        }   
        else if(carry>0){
            result.next = new ListNode(carry);
        }
        return  result;
    }
}
