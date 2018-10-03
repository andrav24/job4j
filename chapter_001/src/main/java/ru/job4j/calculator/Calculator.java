package ru.job4j.calculator;

/**
 *  Класс выполняет простые арифметические действия
 * @author Antonov Andrey
 */

public class Calculator {

    /**
     * В эту переменную записываем результат вычислений.
     */

    private double result;

    /**
     * Операция суммирования двух чисел (в том числе с плавающей точкой)
     * @param first     первое слагаемое
     * @param second    второе слагаемое
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Операция вычитания двух чисел (в том числе с плавающей точкой)
     * @param first     уменьшаемое
     * @param second    вычитаемое
     */

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Операция деления двух чисел (в том числе с плавающей точкой)
     * @param first     делимое
     * @param second    делитель
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Операция умножения двух чисел (в том числе с плавающей точкой)
     * @param first     первый аргумент
     * @param second    второй аргумент
     */

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Операция суммирования двух чисел (в том числе с плавающей точкой)
     * @return  Возвращает результат последней операции
     */

    public double getResult() {
        return this.result;
    }
}
