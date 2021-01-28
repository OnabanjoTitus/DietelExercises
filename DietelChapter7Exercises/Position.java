package com.turtle.com;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }
    @Override
    public boolean equals(Object obj){
        boolean isEquals=false;
        boolean isSame=obj.getClass()==this.getClass();
        if(isSame){
            Position comparedObject = (Position) obj;
            boolean isSameCoordinate =comparedObject.getColumnPosition()==this.columnPosition
                    && comparedObject.getRowPosition()==this.rowPosition;
            if(isSameCoordinate){
                isEquals=true;
            }
        }
        return isEquals;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition=columnPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition=rowPosition;
    }
}
