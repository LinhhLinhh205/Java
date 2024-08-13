/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_20;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Bai07_ThangNam {

    public static void main(String[] args) {
        int month, year;
        int day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang:");
        month = sc.nextInt();
        System.out.print("Nhap nam:");
        year = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                day = 31;
            case 4, 6, 9, 11 ->
                day = 30;
            case 2 -> {
                if (year % 4 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
            }
            default ->
                System.out.println("Thang khong hop le");
        }
        System.out.println("Thang " + month + " nam " + year + " co " + day + " ngay");
    }
}
