/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robot_world;

public class Tester {

    public static void main(String[] args) throws Exception {

        SuperRobotWorld rw = new SuperRobotWorld("src/robot_world/map1.txt");
        rw.printCurrentWorldMap();

        rw.moveForward();
        rw.printCurrentWorldMap();

        rw.rotateClockwise();
        rw.printCurrentWorldMap();

        for (int i = 0; i < 8; i++) {
            try {
                rw.moveForward();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            rw.printCurrentWorldMap();
        }
        rw.undoCommand();
        rw.printCurrentWorldMap();
        rw.undoCommand();
        rw.printCurrentWorldMap();
        rw.redoUndoneCommand();
        rw.printCurrentWorldMap();
        rw.rotateClockwise();
        rw.printCurrentWorldMap();
        for (int i = 0; i < 8; i++) {
            try {
                rw.moveForward();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        rw.printCurrentWorldMap();
        rw.rotateClockwise();
        rw.printCurrentWorldMap();
        for (int i = 0; i < 5; i++) {
            try {
                rw.moveForward();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        rw.printCurrentWorldMap();
        rw.rotateClockwise();
        rw.printCurrentWorldMap();
        for (int i = 0; i < 5; i++) {
            try {
                rw.moveForward();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        rw.printCurrentWorldMap();
        rw.rotateClockwise();
        rw.printCurrentWorldMap();
        rw.moveForward();
        rw.printCurrentWorldMap();
        rw.moveForward();
        rw.printCurrentWorldMap();
    }
}
