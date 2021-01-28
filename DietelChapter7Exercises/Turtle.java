 package com.turtle.com;

public class Turtle {
    private Pen pen;
    private Direction direction;
    private Position currentPosition;
    public Turtle(Pen pen){
        this.pen = pen;
        direction = Direction.EAST;
    }

    public Pen getPen() {
        return  pen;
    }
    public void setCurrentDirection(Direction direction){
        this.direction = direction;
    }
    public Direction getDirection(){
        return direction;
    }

    public void turnRight() {
        switch (direction){
            case EAST -> setCurrentDirection(Direction.SOUTH);
            case WEST -> setCurrentDirection(Direction.NORTH);
            case NORTH -> setCurrentDirection(Direction.EAST);
            case SOUTH -> setCurrentDirection(Direction.WEST);
        }

    }

    public void turnLeft() {
        switch (direction){
            case EAST -> setCurrentDirection(Direction.NORTH);
            case WEST -> setCurrentDirection(Direction.SOUTH);
            case NORTH -> setCurrentDirection(Direction.WEST);
            case SOUTH -> setCurrentDirection(Direction.EAST);
        }

        }

    public void move(SketchPad sketchPad, int numberOfSteps) {
        numberOfSteps -=1;
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        PenOrientation penOrientation =getPen().getPenOrientation();
        switch (penOrientation) {
            case PEN_UP -> {
                switch (direction) {
                    case EAST -> currentPosition.setColumnPosition(currentColumn + numberOfSteps);
                    case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfSteps);
                    case NORTH -> currentPosition.setRowPosition(currentRow - numberOfSteps);
                    case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfSteps);


                }
            }
            case PEN_DOWN -> {
                int [][]floor = sketchPad.getFloor();
                switch (direction) {
                    case EAST ->
                            {for(int column=0; column<=numberOfSteps;column++)
                                floor[currentRow][column]=1;
                               currentPosition.setColumnPosition(currentColumn++);}
                    case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfSteps);
                    case NORTH -> currentPosition.setRowPosition(currentRow - numberOfSteps);
                    case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfSteps);


                }
            }
        }
    }


    public void setCurrentPosition(Position position) {
        currentPosition = position;

    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

}

