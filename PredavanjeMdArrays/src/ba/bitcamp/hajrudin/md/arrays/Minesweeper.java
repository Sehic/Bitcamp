package ba.bitcamp.hajrudin.md.arrays;

public class Minesweeper {
		   public static void main(String[] args) { 
		      int M = 8;
		      int N = 8;
		      double p = 0.3;
		      
		      // game grid is [1..M][1..N], border is used to handle boundary cases
		      boolean[][] bombs = new boolean[M+2][N+2];
		      for (int i = 1; i <= M; i++)
		         for (int j = 1; j <= N; j++)
		            bombs[i][j] = (Math.random() < p);

		      // print game
		      for (int i = 1; i <= M; i++) {
		         for (int j = 1; j <= N; j++)
		            if (bombs[i][j]) System.out.print("* ");
		            else             System.out.print(". ");
		         System.out.println();
		      }

		      //sol[i][j] = # bombs adjacent to cell (i, j)
		      int[][] sol = new int[M+2][N+2];
		      for (int i = 1; i <= M; i++)
		         for (int j = 1; j <= N; j++)
		            // (ii, jj) indexes neighboring cells
		            for (int ab = i - 1; ab <= i + 1; ab++)
		               for (int jj = j - 1; jj <= j + 1; jj++)
		                  if (bombs[ab][jj]) sol[i][j]++;

		      // print solution
		      System.out.println();
		      for (int i = 1; i <= M; i++) {
		         for (int j = 1; j <= N; j++)
		            if (bombs[i][j]) System.out.print("* ");
		            else             System.out.print(sol[i][j] + " ");
		         System.out.println();
		      }

		   }
		}


