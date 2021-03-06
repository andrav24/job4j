package ru.job4j.condition;

/**
 * класс Треугольник
 * @author Andrey Antonov
 * @version $Id$
 * @since 0.1
 *
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * конструктор класса Треугольник
     * @param a - первая вершина треугольника
     * @param b - вторая вершина треугольника
     * @param c - третья вершина треуголника
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab расстояние между точками a b
     * @param ac расстояние между точками a c
     * @param bc расстояние между точками b c
     * @return Периметр треугольника.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2.0;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки a b.
     * @param ac Длина от точки a c.
     * @param bc Длина от точки b c.
     * @return возврашщает true если треугольник построить можно, false - если нельзя.
     */

    private boolean exist(double ab, double ac, double bc) {
        return (ab < ac + bc) && (ac < ab + bc) && (bc < ab + ac);
    }
}

