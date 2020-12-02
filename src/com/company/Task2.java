package com.company;

import java.util.Scanner;

public class Task2 {
    // Обязательные задачи:

    // Задача 1. Среднее арифметическое
    static void exercise01() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор посчитает среднее арифметическое введенных Вами чисел:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = sc.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = sc.nextInt();

        System.out.println("Введите третье число:");
        int thirdNumber = sc.nextInt();

        int result = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println("Среднее арифметическое введенных Вами чисел:" + " " + result);
    }
    // Задача 2. Перевод температуры
    static void exercise02() {

    }
    // Задача 3. Площадь и периметр
    static void exercise03() {
        System.out.println("Добрый день!");
        System.out.println("Давайте произведем расчет площади и периметра прямоугольника:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста ширину и длинну прямоугольника (в см)");
        int width = sc.nextInt();
        int length = sc.nextInt();

        double square = width * length;
        double perimeter = (width + length) * 2;

        System.out.println("Площадь прямоугольника:" + " " + square + " " + "см2");
        System.out.println("Периметр прямоугольника:" + " " + perimeter + " " + "см");

    }
    // Задача 4. Объем цилиндра
    static void exercise04() {
        System.out.println("Добрый день!");
        System.out.println("Давайте произведем расчет объема цилиндра:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажите пожалуйста высоту цилиндра (в см):");
        double height = sc.nextDouble();

        System.out.println("Укажите пожалуйста радиус цилиндра (в см):");
        double radius = sc.nextDouble();

        double PI = 3.1415;

        double volume = PI * (radius * radius) * height;

        System.out.println("Объем цилиндра по заданным параметрам:" + " " + volume + " " + "см3");
    }
    // Задача 5. Плотность вещества
    static void exercise05() {
        System.out.println("Добрый день!");
        System.out.println("Давайте произведем расчет плотности вещества:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста объем тела:");
    }
    // Задача 6. Плотность населения
    static void Exercise06() {

    }
    // Задача 7. Резисторы
    static void Exercise07() {

    }
    // Задача 8. Площадь круга
    static void Exercise08() {

    }

    // Дополнительные задачи:

    // Задача 1. Секунды в часы и минуты
    static void Exercise001() {

    }
    // Задача 2. Поклейка комнаты
    static void Exercise002() {

    }
    // Задача 3. Время
    static void Exercise003() {

    }
    // Задача 4. Счастливое число
    static void Exercise004() {

    }
    public static void main(String[] args) {
        exercise04();
    }
}
