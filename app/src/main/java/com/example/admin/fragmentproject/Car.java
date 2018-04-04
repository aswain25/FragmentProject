package com.example.admin.fragmentproject;

public class Car
{
    public String Model;
    public String Brand;
    public String Year;

    public Car(String model, String brand, String year) {
        Model = model;
        Brand = brand;
        Year = year;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", Brand='" + Brand + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
