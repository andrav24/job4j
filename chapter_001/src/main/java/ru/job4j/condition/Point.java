package ru.job4j.condition;

/**
 * Класс Point - точка на плоскости
 * @author Andrey Antonov
 * @version $Id$
 * @since 0.1
 */

public class Point {
    /**
     * координата точки по горизонтали
     */
    private int x;

    /**
     * координата точки по вертикали
     */
    private int y;


    /**
     * Constructor for Point class
     * @param x - координата точки по горизонтали
     * @param y - координата точки по вертикали
     */
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Считает расстояние до другой точки, передаваемой в параметре
     * @param that - объект, содержащий координаты точки до которой считаем расстояние
     * @return возвращаемый тип - с плавающей точкой
     */
    public double distanceTo(Point that){
        Point a = this;
        Point b = that;
        double result = Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
        return result;
    }


    /**
     * метод, отображающий в командной строке работу класса
     * @param args
     */
    public static void main(String[] args){
        Point a = new Point(0, 1);
        Point b = new Point(2,5);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
