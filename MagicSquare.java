// This program will implement a magic square. prompt user to enter a number and display magic quare information.
// author: Ericka H. B
import java.util.Scanner; // user input

class MagicSquare {
    static void magic(int n) {
        int [][] magicSquare = new int[n][n];

        // position 1
        int j = 0;
        int i = n / 2;

        // next index(s) loop condition
        for (int x = 1; x <= n * n; x++) {
            magicSquare[j][i] = x;

            // if space is occupied move down
            if (x % n == 0)
                j++;
            else
                // og increment position when empty
                j--;
                i--;
            // conditions to place outbounds value
            if (j < 0)
                j +=n;
            if (i < 0)
                i +=n;
        }

        // print magic square
        for (j = 0; j < n; j++) {
            for (i = 0; i < n; i++) {
                System.out.print(magicSquare[j][i] + " ");
            }
            System.out.println();
        }
    }

    // user integer prompt and program driver

    public static void main(String[] args) {

        int n; // initialize n variable

        System.out.println("Enter a number: "); // user prompt
        Scanner myNum = new Scanner(System.in);  // Create a Scanner object(num)

        n = myNum.nextInt(); // reads the next integer from the screen

        System.out.println("Magic Square for : " + n);  // Output square number
        System.out.println("Sum of each row or column " + n * (n * n + 1) / 2 + ":"); // displays the constant sum
        System.out.println(" "); //blank line
        System.out.println("Magic Square of "+ n);
        System.out.println("..................");
        magic(n);
    }
}
