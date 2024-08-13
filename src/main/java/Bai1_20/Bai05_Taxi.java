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
public class Bai05_Taxi {

    public static void main(String[] args) {
        int km;
        double tien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so km:");
        km = sc.nextInt();

        if (km <= 1) {
            tien = km * 15000;
        } else if (km <= 5) {
            tien = 15000 + (km - 1) * 135000;

        } else {
            tien = 15000 + 4 * 13500 + (km - 5) * 11000;

        }
        if (km > 120) {
            tien = (tien * 0.9);
        }

        System.out.printf("So tien: %.2f", tien);
    }

}
