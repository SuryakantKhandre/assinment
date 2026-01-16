package TwoDimentionalArray;
// Multiply two matrices if possible and print the resulting matrix
public class MatrixMultiplication {
	public static void main(String[] args) {
		int m1[][] = {
				{1,2},
				{3,4}
		};
		int m2[][] = {
				{5,6},
				{7,8}
		};
		int m3[][] = new int[2][2];
		
		for(int r =0;r<2;r++) {
			for(int c=0;c<2;c++) {
				int e =0;
				for(int k=0;k<2;k++) {
					e += m1[r][k] * m2[k][c];
				}
				m3[r][c] = e; 
			}
		}
		
		for(int r=0;r<2;r++) {
			for(int c=0;c<2;c++) {
				System.out.print(" "+m3[r][c]+" ");
			}
			System.out.println();
		}
	}

}
