package TwoDimentionalArray;
// Print elements of the matrix in spiral order
public class SpiralOrderTraversal {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		int top = 0;
        int botm = 2;
        int left = 0;
        int right = 2;

        System.out.println("Spiral Oder : ");

        while (top <= botm && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            for (int i = top; i <= botm; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            if (top <= botm) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[botm][i] + " ");
                }
                botm--;
            }
            if (left <= right) {
                for (int i = botm; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();

	}

}
