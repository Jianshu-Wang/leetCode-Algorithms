public class ReverseLinkedList{
	public static void main(String[] args){
	
	}	

} 

class Solution{
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head==null) return null;
		ListNode superHead = new ListNode(0);
		superHead.next = head;
		ListNode pre = superHead;
		for(int i=0;i<m-1:i++) pre = pre.next;
		ListNode start = pre.next;
		ListNode then = start.next;
		for(int i=m-1;i<n;i++){
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;

		}
		return superHead;
    }

}