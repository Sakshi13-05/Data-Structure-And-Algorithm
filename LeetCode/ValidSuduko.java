import java.util.*;

public class ValidSuduko {
    public static boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (board[i][j] != '.') {

                    if (!rows[i].contains(board[i][j])) {
                        rows[i].add(board[i][j]);
                    } else {
                        return false;
                    }
                }

                if (board[j][i] != '.') {

                    if (!col[i].contains(board[j][i])) {
                        col[i].add(board[j][i]);
                    } else {
                        return false;

                    }
                }
                if (board[i][j] != '.') {

                    if (!box[(i / 3) * 3 + (j / 3)].contains(board[i][j])) {
                        box[(i / 3) * 3 + (j / 3)].add(board[i][j]);
                    } else {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },

                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },

                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

        };

        boolean result = isValidSudoku(board);
        System.out.println(result);
    }
}
