/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class PrintPatterns {

    public static void main(String[] args) {
        System.out.println("a.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (col <= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println("b.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (col >= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println("c.");
        for (int row = 0; row < 8; row++) {

            for (int col = 0; col < 8; col++) {
                if (col < row) {

                    System.out.print("  ");

                }
                if (col >= row) {
                    System.out.print("# ");
                }
            }

            System.out.println();
        }

        System.out.println("d.");
        for (int row = 0; row < 8; row++) {
            for (int i = row; i < 7; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 8; col++) {
                if (col <= row) {
                    System.out.print("# ");
                }
            }

            System.out.println();
        }

        System.out.println("e.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (col == 0 || col == 7 || row == 0 || row == 7) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("f.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == 0 || row == 7 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("g.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == 0 || row == 7 || row + col == 7) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("h.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == 0 || row == 7 || row + col == 7 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("i.");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (row == 0 || row == 7 || col == 0 || col == 7 || row + col == 7 || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("j.");
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - row; col++) {
                System.out.print("# ");
            }
            for (int j = 6 - row - 1; j > 0; j--) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        System.out.println("k.");
        for (int row = 0; row < 6; row++) {
            for (int i = 0; i < 6 - row - 1; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("# ");
            }
            for (int j = 0; j <= row - 1; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }

        System.out.println("l.");
        int direction = +1;
        for (int row = 0; row < 6; row += direction) {
            if (row < 0) {
                break;
            }
            for (int i = 0; i < 6 - row - 1; i++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("# ");
            }
            for (int j = 0; j < row; j++) {
                System.out.print("# ");
            }
            if (row == (6 - 1)) {
                direction = -direction;
            }
            System.out.println("");
        }
    }
}
