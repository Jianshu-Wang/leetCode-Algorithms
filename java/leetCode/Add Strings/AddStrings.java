public class AddStrings{
	public static void main(String[] args){
		Solution so = new Solution();
		String str1 = "12345";
		String str2 = "54321";
		System.out.println("The sum of "+str1+" and "+str2+" is: " + so.addString(str1,str2));

	}
	
}

class Solution{
	public String addString(String num1, String num2){
		StringBuilder sum = new StringBuilder();
		int len1 = num1.length()-1;
		int len2 = num2.length()-1;
		int carry = 0;
		for(int i = len1,j = len2; i>=0||j>=0||carry==1;i--,j--){
			int x = i<0? 0:num1.charAt(i)-'0';
			int y = j<0? 0:num2.charAt(j)-'0';
			sum.append((x+y+carry)%10);
			carry = (x+y+carry)/10;
		}

		return sum.reverse().toString();
	}
}