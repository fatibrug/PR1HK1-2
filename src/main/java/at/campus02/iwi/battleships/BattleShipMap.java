package at.campus02.iwi.battleships;

import java.util.Arrays;

public class BattleShipMap {

    public int[][] map = {
            {0, 0, 0, 2, 0, 1, 1, 0, 0, 0},
            {0, 3, -1, 2, 0, 0, 0, 2, 0, 0},
            {0, 3, -1, 0, 4, 4, 0, 0, 2, 2},
            {0, 0, 2, 0, 0, 0, 0, 0, 0, 0},
            {-1, 0, 2, 0, -1, 2, 2, 0, 0, 0},
            {-3, 1, 0, 0, -3, 0, -1, 0, 0, 3},
            {0, 0, 0, -3, 0, 0, 0, -1, 0, 3},
            {0, 0, -2, 0, -2, 0, -2, 0, 0, 0},

    };

    public void print() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0) {
                    System.out.format(" 0\t");
                } else {
                    System.out.format("%+d\t", map[i][j]);
                }
            }
            System.out.println();
        }
    }

    public int totalBattleShipStrength(char player) {
        /* player == 'A' > postive Numbers */
        /* player == 'B' > negative Numbers */

        int erg = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] > 0 && player == 'A') {
                    erg = erg + map[i][j];
                } else if (map[i][j] < 0 && player == 'B') {
                    erg++;
                    erg = erg - map[i][j];
                }
            }
        }
        return erg;
    }

    // returns total number of ships
    public int totalCountBattleShips() {
        int sum = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                sum++;
            }
        }
        return sum;
    }

    // returns a one-dim-array with count in every line
    public int[] countOfShipsPerLine() {
        int[] sumPerLine = new int[map.length];

        for (int i = 0; i < map.length; i++) {
            int shipCount = 0;
            for (int j = 0; j < map[i].length; j++) {
                shipCount++;
            }
        }
        return sumPerLine;
    }

    // returns the average ship strength of player A ships (positive numbers)
    public double averageShipStrengthPlayerA() {
        double sum = 0.0;
        double averageShipPower = 0;
        int sumShipsPower = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] > 0) {
                    sumShipsPower++;
                    sum = sum + map[i][j];
                }
            }
            averageShipPower = sum / sumShipsPower;

        }
        return averageShipPower;
    }

}

