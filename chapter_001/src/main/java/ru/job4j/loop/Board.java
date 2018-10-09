package ru.job4j.loop;

/**
 * класс Board
 */
public class Board {

    /**
     * Рисует шахматную доску в псевдографике
     * @param width - ширина доски
     * @param height - высота доски
     * @return возвращает строку с форматными символами
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или Х
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
                // добавляем перевод на новую строку.
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
