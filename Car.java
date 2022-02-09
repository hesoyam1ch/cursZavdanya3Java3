package com.company;

import java.util.Scanner;

public class Car {
    Scanner scanner = new Scanner(System.in);
    private String brand;
    private String model;
    private double engineVolume;
    private int mass;

    public Car() {
    }


    public Car(String brand, String model, double engineVolume, int mass) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
        brand = scanner.nextLine();
    }

    public String getModel() {
        return model ;
    }

    public void setModel() {

        this.model = model;
        model= scanner.nextLine();
    }

    public int getMass() {
        return mass;
    }

    public void setMass() {
        this.mass = mass;
        mass= scanner.nextInt();
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    public void setEngineVolume() {
        this.engineVolume = engineVolume;
        engineVolume=scanner.nextDouble();
    }


    public void enter() {
        System.out.print("Введіть марку вашого автомобіля:");    //Пропускається строка після scaner.nextInt
        setBrand();
        System.out.print("Введіть модель вашого автомобіля:");
        setModel();
        System.out.print("Введіть массу вашого авто:");
        setMass();
        System.out.print("Введіть обьєм двигуна вашого автомобіля:");
        setEngineVolume();
        scanner.nextLine();                                        //Костиль

        System.out.println("");
    }

    public void print() {
        System.out.println("Данні про ваш транспортний засіб:" + "\n" +
                "Марка :" + this.brand + "\n"
                + "Модель:" + this.model + "\n" +
                "Обьєм двигуна:" + this.engineVolume + "\n"
                + "Масса:" + this.mass + "\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "scanner=" + scanner +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + this.engineVolume +
                ", mass=" + mass +
                '}';
    }
}

