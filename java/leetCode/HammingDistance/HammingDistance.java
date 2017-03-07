public class HammingDistance{
	public static void main(String[] args){
		Solution so = new Solution();
		int x = 1;
		int y = 4;
		System.out.println("The HammingDistance between "+x+" and "+y+" is: "+so.ans(x,y));
	}
}

class Solution{
	public int ans(int x, int y){
		return Integer.bitCount(x^y);

	}

}