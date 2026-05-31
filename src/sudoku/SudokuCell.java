package sudoku;

public class SudokuCell {
    int value;
    boolean fixed;

    public SudokuCell(int value, boolean fixed){
        this.value = value;
        this.fixed = fixed;
    }
    public int getValue(){
        return value;
    }
    public boolean isFixed(){
        return fixed;
    }
    public boolean isEmpty(){
        return value == 0;
    }
    public void setValue(int value) {
    this.value = value;
}
}