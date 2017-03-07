public class FirstUniqueChar{
	public static void main(String[] args){
		solution so = new solution();
		String s="sewisse"; 
		System.out.println(so.getIndexNum(s));
	}	
}

class solution{
	public int getIndexNum(String str){
		char[] a = str.toCharArray();
		int Ind = -1;
		for(int i = 0; i<str.length();i++){
			if(str.indexOf(a[i])==str.lastIndexOf(a[i]) ){
				Ind = i;
				break;
			}
		}
		return Ind;
	}

}