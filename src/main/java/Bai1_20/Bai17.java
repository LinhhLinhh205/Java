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
public class Bai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = docSoPhanTu(sc);
        double[] array = new double[n];
        nhapMang(array, sc);
        System.out.print("Mang da nhap: ");
        xuatMang(array);
        double average = tinhTB(array);
        System.out.printf("\nTrung binh: %.3f\n", average);

        double min = timMin(array);
        System.out.println("Phan tu nho nhat: " + min);

    }

    public static double timMin(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double tinhTB(double[] array) {
        double tong = 0;
        for (double x : array) {
            tong += x;
        }
        double average = tong / array.length;
        return average;
    }

    public static int docSoPhanTu(Scanner sc) {
        int n;
        do {
            System.out.print("Nhap so phan tu:");
            n = sc.nextInt();
        } while (n < 0 || n > 20);
        return n;
    }

    public static void nhapMang(double[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] array) {
        for (double x : array) {
            System.out.print(x + " ");
        }
    }
}
