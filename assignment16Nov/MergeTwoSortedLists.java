package assignment16Nov;
 class ListNode {
    int val;
   ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class MergeTwoSortedLists {
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(0), cur = dummy;
				while(l1 != null || l2 != null){
					if(l1 != null && l2 != null){
						cur.next = l1.val < l2.val ? l1: l2;
						if(l1.val < l2.val) l1 = l1.next;
						else l2 = l2.next;
					}else if(l1 != null){
						cur.next = l1;
						l1 = l1.next;
					}else{
						cur.next = l2;
						l2 = l2.next;
					}
					cur = cur.next;
				}
				return dummy.next;
			}
	public static void main(String[] args) {
//		"1https://leetcode.com/problems/merge-two-sorted-lists/
//		2.https://leetcode.com/problems/reverse-linked-list/
//		3. Delete a node in a Doubly Linked List"
		//[1,2,4]
	//[1,3,4]
		ListNode list1= new ListNode(1);
		ListNode list2= new ListNode(2);
		
		System.out.println(mergeTwoLists(list1,list2));
		
		
	}

}
