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
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор переведет температуру из градусов Цельсия (°C) в градусы Фаренгейта (°F):");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите температуру в градусах Цельсия (°C):");
        double degreesCelsius = sc.nextDouble();

        double degreesFahrenheit = (degreesCelsius * 9 / 5) + 32;

        System.out.println("Температура в " + degreesCelsius + " " + "(°C) = " + degreesFahrenheit + " " + "(°F)");
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
        System.out.println("Давайте произведем расчет плотности материала тела:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста объем тела (м3):");
        double volume = sc.nextDouble();

        System.out.println("Введите пожалуйста массу тела (кг):");
        double  weight = sc.nextDouble();

        double density = weight / volume;

        System.out.println("Плотность материала тела равна: " + density + " " + "кг/м3");
    }
    // Задача 6. Плотность населения
    static void exercise06() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет произвести расчет плотности населения государства:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста площадь государства (км2):");
        double stateArea = sc.nextDouble();

        System.out.println("Введите пожалуйста численность населения в государстве:");
        double  population = sc.nextDouble();

        double areaSquareMeters = stateArea * 1000000;

        double populationDensity = population / areaSquareMeters;

        System.out.println("Плотность населения государства = " + populationDensity + " " + "чел/м2");
    }
    // Задача 7. Резисторы
    static void exercise07() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет Вам вычислить значения сопротивления RO:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста показатели сопротивления R1, R2, R3:");
        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();
        double R3 = sc.nextDouble();

        double RO = 1 / (1/R1 + 1/R2 + 1/R3);

        System.out.println("Значение сотпротивления RO: " + RO);
    }
    // Задача 8. Площадь круга
    static void exercise08() {
        System.out.println("Добрый день!");
        System.out.println("Давайте произведем расчет площади круга:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите пожалуйста динну окружности (в см):");
        double circuit = sc.nextDouble();

        double PI = 3.14;
        double radius = circuit / (2 * PI);
        double squareCircle = PI * (radius * radius);

        System.out.println("Площадь круга равна:" + squareCircle + " " + "см2");
    }

    // Дополнительные задачи:

    // Задача 1. Секунды в часы и минуты
    static void exercise001() {

    }
    // Задача 2. Поклейка комнаты
    static void exercise002() {
        System.out.println("Добрый день!");
        System.out.println("Наш калькулятор поможет Вам расчитать необходимое количество рулонов обоев для поклейки комнаты:");

        Scanner sc = new Scanner(System.in);

        // ширина и длина рулона обоев в метрах:
        double widthRool = 0.5;
        double lengthRool = 10;

        System.out.println("Введите пожалуйста высоту, ширину и длину комнаты (в метрах):");
        double heightRoom = sc.nextDouble();
        double widthRoom = sc.nextDouble();
        double lengthRoom = sc.nextDouble();

        System.out.println("Введите пожалуйста количество окон в комнате:");
        double numberWindows = sc.nextDouble();

        System.out.println("Введите пожалуйста высоту и ширину окна (в метрах):");
        double heightWindows = sc.nextDouble();
        double widthWindows = sc.nextDouble();

        System.out.println("Введите пожалуйста высоту и ширину двери (а метрах):");
        double heightDoor = sc.nextDouble();
        double widthDoor = sc.nextDouble();

        double squareWindow = ( heightWindows * widthWindows ) * 2;
        double squareDoor = heightDoor * widthDoor;
        double squareRool = widthRool * lengthRool;

        double squareGluing = ((heightRoom * lengthRoom) * 2) + ((heightRoom * widthRoom) * 2) - squareWindow - squareDoor;

        double amountRool = squareGluing / squareRool;

        System.out.println("Необходимое количество рулонов обоев для поклейки комнаты:" + amountRool);
    }
    // Задача 3. Время
    static void exercise003() {

    }
    // Задача 4. Счастливое число
    static void exercise004() {

    }
    public static void main(String[] args) {
        exercise002();
    }
}
