package com.turtle.com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    Pen pen;
    @BeforeEach
    void setUp() {
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void test_HasAPEN(){
        turtle.getPen();
      assertNotNull(turtle.getPen());

    }
    @Test
    void turtlePen_canBeSetToDown(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(turtle.getPen().getPenOrientation(),PenOrientation.PEN_DOWN);
    }
    @Test
    void turtlePen_canBeSetToUp(){
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(turtle.getPen().getPenOrientation(),PenOrientation.PEN_UP);
    }
  @Test
  void turtlePen_canTurnRight(){

        turtle.turnRight();
        assertEquals(Direction.SOUTH,turtle.getDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST,turtle.getDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH,turtle.getDirection());
        turtle.turnRight();
        assertEquals(Direction.EAST,turtle.getDirection());
    }
    @Test
    void turtlePen_canTurnLeft(){

        turtle.turnLeft();
        assertEquals(Direction.NORTH,turtle.getDirection());
        turtle.turnLeft();
        assertEquals(Direction.WEST,turtle.getDirection());
        turtle.turnLeft();
        assertEquals(Direction.SOUTH,turtle.getDirection());
        turtle.turnLeft();
        assertEquals(Direction.EAST,turtle.getDirection());

    }
    @Test
    void turtle_canMoveEastWard_onASKetchPad(){
        turtle.setCurrentDirection(Direction.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad, 5);
        assertEquals(new  Position(0,4),turtle.getCurrentPosition());
        turtle.move(sketchPad,2);
        assertEquals(new Position(0,5),turtle.getCurrentPosition());
    }
    @Test
    void turtle_canMoveSouthWard_onASKetchPad(){
        turtle.setCurrentDirection(Direction.SOUTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad, 5);
        assertEquals(new  Position(4,0),turtle.getCurrentPosition());
        turtle.move(sketchPad,2);
        assertEquals(new Position(5,0),turtle.getCurrentPosition());
    }

    @Test
    void turtle_canMoveNorthWard_onASKetchPad(){
        turtle.setCurrentDirection(Direction.NORTH);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(7,0));
        turtle.move(sketchPad, 5);
        assertEquals(new  Position(3,0),turtle.getCurrentPosition());
        turtle.move(sketchPad,2);
        assertEquals(new Position(2,0),turtle.getCurrentPosition());
    }
    @Test
    void turtle_canMoveWestWard_onASketchPad(){
        turtle.setCurrentDirection(Direction.WEST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        SketchPad sketchPad = new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(0,7));
        turtle.move(sketchPad,5);
        assertEquals(new Position(0,3),turtle.getCurrentPosition());
        turtle.move(sketchPad,2);
        assertEquals(new Position(0,2),turtle.getCurrentPosition());
    }
    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast(){
        turtle.setCurrentDirection(Direction.EAST);
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        SketchPad sketchPad= new SketchPad(20,20);
        turtle.setCurrentPosition(new Position(0,0));
        turtle.move(sketchPad,5);
        int[][] a={{1,1}};
        for(int i=0;i<5;i++){
            assertEquals(a[0][0],sketchPad.getFloor()[i][i]);
            System.out.println(sketchPad.getFloor()[i][i]);
        }
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
    turtle.setCurrentDirection(Direction.SOUTH);
        turtle.move(sketchPad,5);
        for(int i=0;i<5;i++){
            assertEquals(1,sketchPad.getFloor()[0][i]);
            System.out.println(sketchPad.getFloor()[0][i]);
        }
        turtle.setCurrentDirection(Direction.NORTH);
        turtle.move(sketchPad,5);
        for(int i=0;i<5;i++){
            assertEquals(1,sketchPad.getFloor()[0][i]);
            System.out.println(sketchPad.getFloor()[0][i]);}
    }


}