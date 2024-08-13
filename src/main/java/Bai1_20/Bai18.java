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
public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = docSoPhanTu(sc);
        int[] array = new int[n];

        nhapMang(array, sc);
        System.out.print("Mang da nhap:");
        xuatMang(array);

        System.out.print("\nPhan tu khong la so nguyen to: ");
        phanTuKhongNguyenTo(array);

        double average = tinhTBSoNguyenTo(array);
        System.out.print("\nTrung binh cac so nguyen to: " + average);
    }

    public static int docSoPhanTu(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        } while (n < 0 || n > 50);
        return n;
    }

    public static void nhapMang(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    public static boolean soNguyenTo(int n) {
        boolean kiemtra = true;
        if (n == 1) {
            kiemtra = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    kiemtra = false;
                    break;
                }
            }
        }
        return kiemtra;
    }

    public static void phanTuKhongNguyenTo(int[] array) {
        for (int x : array) {
            if (!soNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static double tinhTBSoNguyenTo(int[] array) {
        int sum = 0;
        int count = 0;
        for (int x : array) {
            if (soNguyenTo(x)) {
                sum += x;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }
}
