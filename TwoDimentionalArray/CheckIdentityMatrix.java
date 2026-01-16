package TwoDimentionalArray;

// Check whether a given square matrix is an identity matrix.
public class CheckIdentityMatrix {
	public static void main(String[] args) {
		int matrix[][] = {
				{1,0,0},
				{0,1,0},
				{0,0,1}
			};
		
		boolean checkdiagonal = true;
		boolean otherelement = true;
		
		for(int r  = 0;r<3;r++) {
			for(int c = 0 ;c<3 ;c++) {
				if(r==c) {
					if(matrix[r][c]!=1) {
						checkdiagonal = false;
					}
				}else {
					if(matrix[r][c]!=0) {
						otherelement = false;
					}
				}
				
			}
		}
		if(otherelement && checkdiagonal) {
			System.out.println("Yes it as an Identity matrix");
		}else {
			System.out.println("Not an Identity matrix");
		}
			
    }
	
}


