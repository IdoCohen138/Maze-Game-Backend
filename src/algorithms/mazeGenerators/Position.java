package algorithms.mazeGenerators;

import java.io.Serializable;

public class Position implements Serializable {

    private int row;
    private int column;

    public Position() {}
    //constructor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "{" + row +","+ column +"}";
    }

    public int getRowIndex() {
        return row;
    }

    public int getColumnIndex() {
        return column;
    }

    @Override
    public boolean equals(Object obj) {
        return ((this.row == ((Position)obj).row) && (this.column == ((Position)obj).column));
    }
}
