
import java.util.Scanner;
public class tictactio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        char[] p = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', };
        char turn = 'X';
        int input;
        int currentturn = 1;

        while (true) {

            do {
                System.out.println("enter the position: ");
                input = s.nextInt();

            } while (p[input - 1] == 'X' || p[input - 1] == 'O');

            p[input - 1] = turn;

            System.out.println("\n " + p[0] + " | " + p[1] + " | " + p[2] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + p[3] + " | " + p[4] + " | " + p[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + p[6] + " | " + p[7] + " | " + p[8] + "\n");

            if (p[0] == turn && p[1] == turn && p[2] == turn ||
                    p[3] == turn && p[4] == turn && p[5] == turn ||
                    p[6] == turn && p[7] == turn && p[8] == turn ||
                    p[0] == turn && p[3] == turn && p[6] == turn ||
                    p[1] == turn && p[4] == turn && p[7] == turn ||
                    p[2] == turn && p[5] == turn && p[8] == turn ||
                    p[0] == turn && p[4] == turn && p[8] == turn ||
                    p[2] == turn && p[4] == turn && p[6] == turn) {
                System.out.println(turn + " is Winner");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            }

            else if (turn == 'O') {
                turn = 'X';
            }

            currentturn++;
            if (currentturn > 9) {
                System.out.println("Draw");
                break;
            }
        }
	}

}
