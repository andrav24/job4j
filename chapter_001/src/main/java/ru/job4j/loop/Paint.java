package ru.job4j.loop;

/**
 * класс рисует различные фигуры в псевдографике
 */

public class Paint {
    /**
     * Рисует пирамиду в псевдографике
     * @param height    высота в строках
     * @return  возвращает пирамиду в виде форматированной строки
     */
    public String piramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    /**
     * рисует правостороннюю часть пирамиды (прямоугольный треугольник)
     * @param height    высота треугольника
     * @return  возвращает рисунок в виде форматированной строки
     */
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    /**
     * рисует левостороннюю часть пирамиды (прямоугольный треугольник)
     * @param height    высота треугольника
     * @return  возвращает рисунок в виде форматированной строки
     */
    public String leftTrl(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

}
