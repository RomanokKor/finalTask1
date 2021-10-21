package com.roma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Введите текущий курс");
                double x = s.nextDouble();
                System.out.println("Введите количество рублей");
                double y = s.nextDouble();
                System.out.println("Итого долларов: " + ((double) Math.round((y / x)  * 100.0) / 100.0));
            }
        }

