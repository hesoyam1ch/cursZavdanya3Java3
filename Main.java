package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car youCar1 = new Car();
        Car youCar2 = new Car();
        Car youCar3 = new Car();

        System.out.println("Початок роботи");
        boolean play = true;
        int userNumber;

        youCar1.enter();
        youCar2.enter();
        youCar3.enter();

        ArrayList<Car> carArr = new ArrayList<>();


        carArr.add(youCar1);
        carArr.add(youCar2);
        carArr.add(youCar3);


        printArr(carArr);

        while (play) {
            System.out.println("1.Вивести всі обьєкти" + "\n" +
                    "2.Переглянути певний обьєект" + "\n" +
                    "3.Додати обьєект" + "\n" +
                    "4.Видалити обьєкт" + "\n" +
                    "5.Відсортувати за обьємом двигуна" + "\n" +
                    "6.Виправити обьєект" + "\n" +
                    "7.Завершити програму" + "\n" +
                    "Для вибору дії введіть число тут ==>");
            userNumber = scanner.nextInt();
            if (userNumber == 1) {
                printArr(carArr);
            }
            if (userNumber == 2) {
                System.out.print("Введіть номер елементу який хочете переглянути:");
                choiseElement(carArr, scanner.nextInt());
            }
            if (userNumber == 3) {
                System.out.println("Введіть номер елемента який бажаєте додати");
                addElement(carArr, scanner.nextInt());
            }
            if (userNumber == 4) {
                System.out.println("Введіть номер елемента який бажаєте видалити:");
                deleteElement(carArr, scanner.nextInt());
            }
            if (userNumber == 5) {

                sortingArr(carArr);
            }
            if (userNumber == 6) {
                System.out.println("Введіть номер елемента який бажаєте виправити:");
                correctElement(carArr, scanner.nextInt());
            }
            if (userNumber == 7) {
                play = false;
                return;
            }
        }
        System.out.println("Кінець роботи");

    }


    public static void printArr(ArrayList<Car> carArr) {

        for (int i = 0; i < carArr.size(); i++) {
            System.out.println("Номер обьєкта:" + i);
            carArr.get(i).print();
        }
    }

    public static void choiseElement(ArrayList<Car> carArr, int userNumber) {
        if (userNumber > carArr.size()) {
            System.out.println("Не коректний ввід");
            return;
        }
        carArr.get(userNumber).print();
    }

    public static void correctElement(ArrayList<Car> carArr, int userNumber) {
        carArr.get(userNumber).enter();
    }

    public static void addElement(ArrayList<Car> carArr, int userNumber) {
        Car newCar = new Car();
        newCar.enter();
        carArr.add(userNumber, newCar);
    }

    public static void deleteElement(ArrayList<Car> carArr, int userNumber) {
        carArr.remove(userNumber);
    }

    public static void sortingArr(ArrayList<Car> carArr) {
        for (int i = 0; i < carArr.size() - 1; i++) {
            for (int j = 0; j < carArr.size() - i - 1; j++) {
                if (carArr.get(j).getEngineVolume() > carArr.get(j + 1).getEngineVolume()) {
                    Car temp = carArr.get(j);
                    carArr.set(j, carArr.get(j + 1));
                    carArr.set(j + 1, temp);
                }
            }
        }
    }

}
