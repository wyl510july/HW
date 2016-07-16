package px;

public class oddEvenLinkedList {

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public ListNode oddEvenList(ListNode head) {
	// edge condition
	if (head == null || head.next == null || head.next.next == null){
	    return head;
	}else{
	    ListNode odd = head;
	    ListNode even = head.next;
	    final ListNode temp = head.next;
	    while(odd.next != null && even.next != null){
	        odd.next = odd.next.next;
	        odd = odd.next;
	        even.next = even.next.next;
	        even = even.next;
	        }
	    odd.next = temp;
	    return head;
	    }
	}
}
