public class RotateImage{
	public static void main(String[] args){
		Solution so = new Solution();
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		so.rotate(mat);
		System.out.println(mat);

	}
	
}

class Solution{
	public void rotate(int[][] matrix){
		
		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix[0].length;j++){
				int temp =0;
				temp = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}

		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix[0].length/2;j++){
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[i][matrix[0].length-j-1];
				matrix[i][matrix[0].length-j-1]=temp;
			}
		}

	}
}