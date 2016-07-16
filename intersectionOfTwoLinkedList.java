package px;

import java.util.HashMap;
import java.util.Map;

public class intersectionOfTwoLinkedList {
	
//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //edge condition
    if(headA == null || headB == null){
        return null;
    }else{
        Map <ListNode, Integer> map = new HashMap<>();
        for(ListNode curr = headA; curr != null; curr = curr.next){
            map.put(curr, 1);
        }
        for(ListNode temp = headB; temp != null; temp = temp.next){
            if(map.containsKey(temp)){
                return temp;
                }
            }
        return null;
        }
    }
}
