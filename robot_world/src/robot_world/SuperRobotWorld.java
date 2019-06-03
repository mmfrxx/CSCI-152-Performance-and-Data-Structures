/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot_world;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuperRobotWorld extends RobotWorld {

    // TODO: Add some fields to keep track of commands
    private Stack<Character> stk1 = new LinkedListStack();

    public SuperRobotWorld(String mapFile) throws IOException {
        super(mapFile);
    }

    /**
     * Undo the last move or rotation command that put the robot in its current
     * state. If no commands have been issued yet, do nothing.
     */
    public void undoCommand() {
        char command = 0;
        try {
            // TODO: Fix me
            command = stk.pop();
        } catch (Exception ex) {
            return;
        }
        if (command == 'L') {
            super.rotateClockwise();
            try {
                stk.pop();
            } catch (Exception ex) {
            }
            stk1.push('R');
        } else if (command == 'R') {
            super.rotateCounterClockwise();
            try {
                stk.pop();
            } catch (Exception ex) {
            }
            stk1.push('L');
        } else if (command == 'U') {
            super.rotateClockwise();
            super.rotateClockwise();
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
            super.rotateClockwise();
            super.rotateClockwise();
            for (int i = 0; i < 5; i++) {
                try {
                    stk.pop();
                } catch (Exception ex) {
                }
            }
            stk1.push('D');
        } else if (command == 'D') {
            super.rotateClockwise();
            super.rotateClockwise();
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
            super.rotateClockwise();
            super.rotateClockwise();
            for (int i = 0; i < 5; i++) {
                try {
                    stk.pop();
                } catch (Exception ex) {
                }
            }
            stk1.push('U');
        } else if (command == '-') {
            super.rotateClockwise();
            super.rotateClockwise();
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
            super.rotateClockwise();
            super.rotateClockwise();
            for (int i = 0; i < 5; i++) {
                try {
                    stk.pop();
                } catch (Exception ex) {
                }
            }
            stk1.push('+');
        } else if (command == '+') {
            super.rotateClockwise();
            super.rotateClockwise();
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
            super.rotateClockwise();
            super.rotateClockwise();
            for (int i = 0; i < 5; i++) {
                try {
                    stk.pop();
                } catch (Exception ex) {
                }
            }
            stk1.push('-');
        }
    }

    /**
     * Undo the last n commands. Do nothing if n is zero or negative.
     *
     * @param n the number of commands to undo
     */
    public void undoCommands(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            undoCommand();
        }
    }

    /**
     * For previously undone commands, redo the last command that was undone
     */
    public void redoUndoneCommand() {
        // TODO: Fix me!!!
        char command = 0;
        try {
            command = stk1.pop();
        } catch (Exception ex) {
            return;
        }

        if (command == 'L') {
            super.rotateClockwise();
        } else if (command == 'R') {
            super.rotateCounterClockwise();
        } else if (command == 'U') {
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
        } else if (command == 'D') {;
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
        } else if (command == '+') {;
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
        } else if (command == '-') {;
            try {
                super.moveForward();
            } catch (Exception ex) {
            }
        }
    }

    /**
     * Redo the last n undone commands. Do nothing if n is zero or negative.
     *
     * @param n the number of commands to redo
     */
    public void redoUndoneCommands(int n) {
        if (n <= 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            redoUndoneCommand();
        }
    }
}
