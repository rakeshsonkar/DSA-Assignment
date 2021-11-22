package assignment16Nov;
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
    private ListNode head = null;
    public ListNode reverseList(ListNode head) {
        
   if(head == null) return head;
			getNext(null, head);
			return this.head;
		}
		private void getNext(ListNode pre, ListNode cur){
			ListNode next = cur.next;
			if(cur.next == null){
				this.head = cur;
				cur.next = pre;
				return;
			}
			cur.next = pre;
			getNext(cur, next);
		}
}
public class ReverseListNodeIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
