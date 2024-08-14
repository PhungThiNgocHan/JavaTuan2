/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap01;

/**
 *
 * @author ADMIN
 */
public class Rectangle {
    // Khai bao thuoc tinh (data)
    private double lenght;
    private double width;
    // Dinh nghia cac phuong thuc constructor
    public Rectangle()
    {
        lenght = 1;
        width = 1;
    }

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    // Phuong thuc xu ly tinh toan
    public double findArea()
    {
        double area = lenght * width;
        return area;
    }
    public double findPerimeter()
    {
        double result = (lenght + width) * 2;
        return result;
    }

    @Override
    public String toString() {
        return "Dai :" + lenght + " - Rong:" + width + "- Dien tich:" + findArea() + " - Chu vi" + findPerimeter();
    }
   
    
}
