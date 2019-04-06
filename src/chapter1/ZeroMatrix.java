package chapter1;

public class ZeroMatrix {
	
	public static void zeroMatrix(int[][] matrix) {
		boolean[] m = new boolean[100];
		boolean[] n = new boolean[100];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					m[i] = true;
					n[j] = true;
				}
			}
		}
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(m[i] || n[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1,0,2,4},{6,9,3,6},{8,2,10,0}
		};
		zeroMatrix(matrix);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}

	}

}
