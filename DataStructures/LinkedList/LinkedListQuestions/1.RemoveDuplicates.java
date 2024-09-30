// Single pointer method
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode temp = head;
        while(temp != null && temp.next != null) {
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
}
// Two pointer method
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        while(ptr2 != null) {
            if(ptr1.val == ptr2.val) {
                if(ptr2.next == null) ptr1.next = null;     // Corner case when the last value has duplicate
                ptr2 = ptr2.next;
            }else{
                ptr1.next = ptr2;
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        return head;
    }
}
