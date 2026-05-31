package sudoku;

public class SudokuBoard {

    private SudokuCell[][] board;

    public SudokuBoard() {
        board = new SudokuCell[9][9];
        for (int i = 0; i < 9; i++){
            for (int coluna = 0; coluna < 9; coluna++) {
                board[i][coluna] = new SudokuCell(0, false);
            }
        }
    }
    public void printBoard() {
    for (int i = 0; i < 9; i++) {

        if (i % 3 == 0) {
            System.out.println("+-------+-------+-------+");
        }

        for (int coluna = 0; coluna < 9; coluna++) {

            if (coluna % 3 == 0) {
                System.out.print("| ");
            }

            int val = board[i][coluna].getValue();

            if (val == 0) {
                System.out.print(". ");
            } else {
                System.out.print(val + " ");
            }
            }

            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
    public void placeNumber(int row, int col, int value) {
    if (row < 0 || row > 8 || col < 0 || col > 8) {
    System.out.println("Posição inválida!");
    return;
    }
    SudokuCell celula = board[row][col];
    if (celula.isFixed()) {
        System.out.println("Essa posição é fixa, não pode alterar!");
        return;
    }
    if (!celula.isEmpty()) {
    System.out.println("Posição já Preenchida!");
    return;
    }
    celula.setValue(value);
    }
    public void removeNumber(int row, int col) {
    if (row < 0 || row > 8 || col < 0 || col > 8) {
    System.out.println("Posição inválida!");
    return;
    }
    SudokuCell celula = board[row][col];
    if (celula.isFixed()) {
        System.out.println("Número fixo, não pode ser removido!");
        return;
    }
    else celula.setValue(0);
    }
    public void clearBoard() {
    for (int i = 0; i < 9; i++) {
        for (int coluna = 0; coluna < 9; coluna++) {
            
        }
    }
}
}