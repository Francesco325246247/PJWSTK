import java.awt.Color;

public class Main {

	public static void main(String[] args) {

	 int[][] matrix = new int[21][21];

		for(int i=1; i<matrix.length; i++ ){
			
			//here comes the magic trick!
			for(int j=1 ; j<matrix[i].length; j++ ){

				System.out.format("%4d", i*j);

				
				
			}
			System.out.println();
		}
		
		
		

	}

}
