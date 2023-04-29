package ass_3;
public class Matrix {
	    
		public static void main(String[] args) {
		int matrixA[][]= {{1,0,2},{-1,3,1}};
		int matrixB[][]= {{3,1},{2,1},{1,0}};
		int matrixC[][] = new int[matrixA.length][matrixB[0].length];
		
		
		for(int i=0;i<matrixA.length;i++)
		{
			for(int j=0;j<matrixB[0].length;j++)
			{
				for(int k=0;k<matrixA[0].length;k++)
				{
					matrixC[i][j]+=matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		System.out.println(matrixC[0][0]+" "+matrixC[0][1]);
		System.out.println(matrixC[1][0]+" "+matrixC[1][1]);

	}

}
