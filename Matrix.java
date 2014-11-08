package day6;

public class Matrix {

	private int x;
	private int y;
	int [] [] array = new int [x] [y];
	
	public Matrix(int x, int y) {
		
		array = new int [x] [y];
		
		for (int i = 0; i<x; i++) {
			for (int j = 0; j<y;j++) {
				array[i][j] = 1;
 			}
		}
		
	}
	
	public void setElement (int oneD, int twoD, int val) {
		
		if ((x-1>=oneD)&&(y-1>=twoD)) {
			array[oneD][twoD] = val;
		} else {
			
		}
		
	}
	
	
	
	
}
