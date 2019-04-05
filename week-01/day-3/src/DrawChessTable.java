public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %


        for (int row = 0; row < 8; row++)
        {
            for (int col = 0; col < 8; col++)
            {
                if (((row + col) % 2) == 0)
                {
                    System.out.print("%");
                } else
                    {
                    System.out.print(" ");
                    }
            }
            System.out.println(" ");
        }
    }
}