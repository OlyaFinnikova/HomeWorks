package part3.unit2;
/**
 * Игра жизнь
 */
public class Field {

    /**
     * Запускает игру
     */

    public void play() {
        Cell[][] cell = new Cell[15][15];
        createFirstDegeneration(cell);
        printArray(cell);
        int counter = 0;
        do {
            counter++;
            System.out.println("Цикл номер " + counter + " завершился.");
            liveOrDie(cell);
            printArray(cell);
        } while (!checkEnd(cell));
    }

    /**
     * Создаёт первое поколение
     */

    static void createFirstDegeneration(Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {

                int deathOrLive = ((int) (Math.random() * (100))) + 1;

                if (deathOrLive > 40) {
                    cell[i][j] = new Cell(true);
                } else {
                    cell[i][j] = new Cell(false);
                }
            }
        }
    }
    /**
     * Печатает поле
     */

    static void printArray(Cell[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j].isLiveStatus() ? "[*]" : "[_]");
            }
            System.out.println();
        }
    }

    /**
     * Убивает или оживляет клетки
     */

    public void liveOrDie(Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                if (!cell[i][j].isLiveStatus() && checkLive(cell, i, j) == 3) {
                    cell[i][j].setLiveStatus(true);
                } else if (!(cell[i][j].isLiveStatus() && (checkLive(cell, i, j) == 3 || checkLive(cell, i, j) == 2))) {
                    cell[i][j].setLiveStatus(false);
                }
            }
        }
    }

    /**
     * Считает живые клетки вокруг
     */

    public int checkLive(Cell[][] cell, int line, int column) {
        int counter = 0;

        if (line - 1 < 0) {
            line=1;
        }
        if (column - 1 < 0) {
            column=1;
        }
        for (int i = line - 1; i <= line + 1 && i < cell.length; i++) {
            for (int j = column - 1; j <= column + 1 && j < cell.length; j++) {
                if (cell[i][j].isLiveStatus() && !(line == i && column == j)) {
                    counter++;
                }
            }
        }
        return counter;
    }
    /**
     * Проверяет наличие живых клеток
     */
    public boolean checkEnd(Cell[][] cell) {
        for (int i = 0; i < cell.length; i++) {
            for (int j = 0; j < cell[i].length; j++) {
                if (cell[i][j].isLiveStatus()) {
                    return false;
                }
            }
        }
        return true;
    }
}



