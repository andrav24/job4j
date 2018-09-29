package ru.job4j.calculate;

/**
 * Выводит фразу " Hello World!"
 * @author Antonov Andrey
 */

public class Calculate {

/**
 * Это метод main
 * @param args - массив строк, тип String[]
 */  
  public static void main(String[] args) {
    
    System.out.println("Hello world!");
  }

/**
 * Method echo.
 * @param name Your name.
 * @return Echo plus your name.
 */
public String echo(String name) {
    return "Echo, echo, echo : " + name;
  }
}
