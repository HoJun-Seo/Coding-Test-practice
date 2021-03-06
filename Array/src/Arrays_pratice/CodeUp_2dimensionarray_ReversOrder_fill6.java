package Arrays_pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp_2dimensionarray_ReversOrder_fill6 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []s = br.readLine().split(" ");
		int row = Integer.parseInt(s[0]);
		int col = Integer.parseInt(s[1]);
		
		int[][] ReverseOrder_array_col = new int[row][col];
		int number = 1;
		
		for(int y = col - 1; y >= 0; y--) {
			for(int x = 0; x < row; x++) {
				ReverseOrder_array_col[x][y] = number++;
			}
		}
		
		for(int x = 0; x < row; x++) {
			for(int y = 0; y < col; y++) {
				System.out.print(ReverseOrder_array_col[x][y] + " ");
			}
			System.out.println();
		}	
	}
}
