package review6;

public class Max2DArray {
	public static void main(String[] args) {
		int[][] b = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int max = b[0][0];
		for(int i = 0; i < b.length; i++) {
			for(int k = 0; k < b[i].length; k++) {
				if (b[i][k] > max) {
					b[i][k] = max;
				}
			}
		}
		System.out.println("Maximum is " + max);
	}

}
