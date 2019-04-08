// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        int a = 4;
        int b = 4;

        int[][] matrix = new int[a][b];
        for (int row = 0; row < a; row++)
        {
            for (int col = 0; col < b; col++)
            {
                if (row == col)
                {
                    matrix[row][col] = 1;
                    System.out.print(matrix[row][col]);
                } else {
                    matrix[row][col] = 0;
                    System.out.print(matrix[row][col]);
                }
            }
            System.out.println();
        }
    }
}
