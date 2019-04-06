package chapter1;

public class RotateMatrix {
	
	public static int[][] rotate(int[][] matrix, int n) {
		int layers = n / 2;
		for(int layer = 0; layer < layers; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[first+offset][last];
				matrix[first+offset][last] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[last][first+offset];
				matrix[last][first+offset] = top;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}
		};
		matrix = rotate(matrix, 4);
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}

}
