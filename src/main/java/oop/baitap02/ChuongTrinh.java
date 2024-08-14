/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.baitap02;

import java.text.DecimalFormat;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinh {
    public static void main(String[] args) {
        Account ac1, ac2;
        
        DecimalFormat fmt = new DecimalFormat("#,##0");
        // Tao doi tuong ac1 : Thong tin chinh minh
        ac1 = new Account("AC001", "Phung Thi Ngoc Han", 35000000);
        
        // Tao doi tuong ac2 : Thong tin ban than
        ac2 = new Account("AC002", "Duong Tu Luc", 20000000);
        
        System.out.println("-----THONG TIN TAI KHOAN BAN DAU-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));

        ac1.credit(15000000);
        ac2.debit(10000000);

        System.out.println("-----THONG TIN TAI KHOAN SAU GIAO DICH RUT, GUI TIEN-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));

        ac1.tranferTo(ac2, 1000000);

        System.out.println("-----THONG TIN TAI KHOAN SAU GIAO DICH CHUYEN KHOAN-----");
        System.out.println("My Account: id:" + ac1.getId() + " - name:" + ac1.getName() + " - " + fmt.format(ac1.getBalance()));
        System.out.println("Myfriend Account: id:" + ac2.getId() + " - name:" + ac2.getName() + " - " + fmt.format(ac2.getBalance()));
    }
}
