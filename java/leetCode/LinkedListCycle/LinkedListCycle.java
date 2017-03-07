public class LinkedListCycle{
	public static void main(String[] args){
		Solution so = new Solution();
		List list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(so.hasCycle(list));

	}
}

class Solution{
	public boolean hasCycle(ListNode head) {
		if(head ==null) return false;
		ListNode walker = head;
		ListNode runner = head;
		while(runner.next!=null&&runner.next.next!=null){
			walker = walker.next;
			runner = runner.next.next;
			if(walker==runner) return true;
		}
		return false;
	}
	
}