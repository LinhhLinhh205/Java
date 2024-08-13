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
public class Bai16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = docSoPhanTu(sc);
        int[] array = new int[n];
        nhapMang(array, sc);
        System.out.print("Mang da nhap la:");
        xuatMang(array);
        int tong = tinhTong(array);
        System.out.println("\nTong mang la: " + tong);

        int count = demDuongLe(array);
        System.out.println("So duong le: " + count);

        int max = timMax(array);
        System.out.println("Phan tu lon nhat: " + max);
    }

    public static int timMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int demDuongLe(int[] array) {
        int count = 0;
        for (int x : array) {
            if (x > 0 && x % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int tinhTong(int[] array) {
        int tong = 0;
        for (int x : array) {
            tong += x;
        }
        return tong;
    }

    public static void xuatMang(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static void nhapMang(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
    }

    public static int docSoPhanTu(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Nhap so phan tu:");
            n = sc.nextInt();
        } while (n < 0 || n > 20);
        return n;
    }
}
