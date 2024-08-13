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
public class Bai08_TinhTong {

    public static void main(String[] args) {
        double tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        System.out.println("Tong la: " + tong);

    }
}
