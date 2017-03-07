public class Calculator{
	public static void main(String[] args){
		int AB = 1000;
		int AjB = 100000;
		int jAB = 10;
		int jAjB = 100000;
		int to = 201010;

		float sA = (AB+AjB)/to;
		float sB =  (AB+jAB)/to;
		float sAB = (AB)/to;

		float IR = Math.abs(sA-sB)/(sA+sB-sAB);
		System.out.println("The imbalanced ratio is: "+IR);
	}
	
}